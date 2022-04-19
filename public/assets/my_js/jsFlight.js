/**
 * Created by Kode on 26/12/2015.
 */

/*
 * AngularJS Code Begin
 *
 */
function getParameterByName(name) {
    var match = RegExp('[?&]' + name + '=([^&]*)').exec(window.location.search);
    return match && decodeURIComponent(match[1].replace(/\+/g, ' '));
}
angularApp.controller('flightResultCtrl', function ($scope, $http, $cookies, $location) {
    $scope.numOfAdults = parseInt(getParameterByName('num_of_adult'));
    $scope.numOfChildren = parseInt(getParameterByName('num_of_children'));
    $scope.numOfInfants = parseInt(getParameterByName('num_of_infant'));
    $scope.flexibleDate = parseInt(getParameterByName("flexible_date"));
    $scope.dpDate = getParameterByName("departure_date_1");
    $scope.arrDate = getParameterByName("arrival_date_1");
    $scope.Math = window.Math;
    $scope.orderByColumn = '';
    $scope.parseDate = function (date) {
        return new Date(date);
    };
    //get the flight result from the webservice
    var flightObjs = {};
    $scope.isLoading = true;
    $http({
        method: 'POST',
        url: '/flight/flight-result-json'
    }).then(function (response) {
        if(response.data.status == 400) {
            window.location.href = '/flight/no-result';
        }
        var groupByAirline = [];
        angular.forEach(response.data.groupByAirlines, function (obj, airlineCode) {
            groupByAirline.push(obj[0]);
        });
        flightObjs['groupByAirlines'] = groupByAirline;
        flightObjs['groupByDepartureDates'] = response.data.groupByDepartureDates;
        flightObjs['airlineFlights'] = response.data.groupByAirlines;
        flightObjs['sortByShortestTime'] = response.data.sortByShortestTime;
        flightObjs['departureDates'] = response.data.departureDates;
        flightObjs['arrivalDates'] = [];//response.data.arrivalDates;
        $scope.flightResults = flightObjs;
        $scope.searchResult = response.data;
        $scope.isLoading = false;
    }, function (failure) {
        window.location.href = '/flight/no-result';
    });

    $scope.dtSplit = function (string, nb) {
        var array = string.split('<<>>');
        return array[nb];
    };
    $scope.rpItem = function (length) {
        return 6 - length;
    };
    $scope.orderByDate = function (item) {
        console.log(item);
        // var parts = item.dateString.split('-');
        // var date = new Date(parseInt(parts[2],
        //     parseInt(parts[1]),
        //     parseInt(parts[0])));
        // return date;
    };
    $scope.showMatrixFlInfo = function (className) {
        $(function () {
            $('.' + className).attr('style', 'display: none');
        });
    };

    $scope.showMoreFlightResult = function (airlineName, airlineCode, $event) {
        console.log(angular.element($event));//.html('<i class="icon icon-minus-circle"></i> Show Less Results for ' + airlineName);
        $(function () {
            var hidden_div = $("." + airlineCode);
            var is_hidden = hidden_div.is(':visible');
            if (is_hidden == false) {
                hidden_div.fadeIn('slow').show();
            } else {
                hidden_div.fadeOut('slow').hide();
                // hidden_div.html('<i class="icon icon-plus-circle"></i> Show More Results for ' + airlineName);
            }
        })
    };

    $scope.flightDetails = function (indexItem, $event) {
        $(function () {
            var targetDiv = $('.' + indexItem);
            $("#" + indexItem).toggle();
            return false;
        });
    };

    var currency = {};
    // alert($cookies.get(cCurrency));
    if ($cookies.get(cCurrency) == 'undefined' || $cookies.get(cCurrency) == null) {
        currency['code'] = 'NGN'; //the default in Naira.
    } else {
        currency['code'] = $cookies.get(cCurrency);
    }
    $scope.currency = currency;
    $scope.displayPrice = function (priceObj) {
        //convert the currency based on the conversion rate for the website.
        return priceObj;
    };
});

angularApp.filter('priceOrder', function () {
    return function (items) {
        var returnVal = 0;
        var itemsList = [];
        angular.forEach(items, function (value, key) {
            itemsList.push(value[0]);
        });
        itemsList.sort(function (a, b) {
            aPos = a.pricingInfoWSResponse.totalFare;
            bPos = b.pricingInfoWSResponse.totalFare;
            // Do our custom test
            if (aPos > bPos) returnVal = 1;
            if (aPos < bPos) returnVal = -1;
            return returnVal;
        });
    };
});

angularApp.controller('flightBookingCtrl', function ($scope, $http, $cookies) {
    $scope.validateCouponCode = function () {
        var couponcode = $scope.couponcode;
        $(function () {
            $.growl.error({
                title: "Invalid Coupon!",
                message: "Coupon code does not exist",
                duration: 1000 * 15
            });
        });
    }
});

/*
 * JQuery Code Begins.
 */
jQuery(function () {
    'use strict';

    var from = null, to = null, day_sum = null, form_DOM = $('#flight_search'), to_d = moment(new Date().setDate(new Date().getDate() + 5)).format("YYYY-MM-DD");
    $.fn.funcAutoSuggestDeparture = function ($this) {
        var value = null;
        var id = $this.data('section');
        var country = null;
        var options_from = {
            getValue: function (element) {
                return "(" + element.air_code.replace(/"+/, '') + ") " + element.airport_name.replace(/"+/, '') + " - " + element.city.replace(/"+/, '') + ", " + element.country_name;
                //return element.air_code.replace(/"+/, '') + " " + element.airport_name.replace(/"+/, '') + ", " + element.country_name;
            },
            list: {
                maxNumberOfElements: 20,
                match: {
                    enabled: true
                },
                onSelectItemEvent: function () {
                    value = $this.getSelectedItemData().air_code;
                    country = $this.getSelectedItemData().country_code;
                    if (value === parseInt($('input[name=arrival_airport_code_' + id + ']').attr('value'))) {
                        $.growl.error({
                            title: "You cannot do that!",
                            message: "You cannot select the same location as departure and destination"
                        });
                        $this.val('');
                        $('input[name=departure_country_id_' + id + ']').val('');

                    } else {
                        $('input[name=departure_airport_code_' + id + ']').attr('value', value);
                        $('input[name=departure_country_id_' + id + ']').attr('value', country);
                    }
                    $('input[name=departure_country_' + id + ']').val(country);
                },
                onKeyEnterEvent: function () {
                    if (value === parseInt($('input[name=arrival_airport_code_' + id + ']').attr('value'))) {
                        $.growl.error({
                            title: "You cannot do that!",
                            message: "You cannot select the same location as departure and destination"
                        });
                        $this.val('');
                        $('input[name=departure_country_id_' + id + ']').val('');

                    } else {
                        $('input[name=departure_airport_code_' + id + ']').attr('value', value);
                        $('input[name=departure_country_id_' + id + ']').attr('value', country);
                    }
                    $('input[name=departure_country_' + id + ']').val(country);
                }
            },
            theme: "square"
        };
        if (localStorage.getItem("airport_cities") === 'undefined' || localStorage.getItem("airport_cities") === null) {
            //if (typeof airportJsonCache === 'undefined') {
            //    options_from['url'] = function (p) {
            //        return "/api/get-airports?q=" + p;
            //    }
            //} else {
            //    options_from['data'] = airportJsonCache;
            //}
            if (typeof airportJsonUrl === 'undefined') {
                options_from['url'] = function (p) {
                    return "/api/get-airports?q=" + p;
                }
            } else {
                options_from['url'] = airportJsonUrl;
            }
        } else {
            options_from['data'] = jQuery.parseJSON(window.localStorage.getItem("airport_cities"));
        }
        $this.easyAutocomplete(options_from);
        $this.focus();
    };
    $.fn.funcAutoSuggestArrival = function ($this) {
        var id = $this.data('section');
        var value = null;
        var country = null;
        var options_to = {
            getValue: function (element) {
                //return element.air_code.replace(/"+/, '') + " " + element.airport_name.replace(/"+/, '') + ", " + element.country_name;
                return "(" + element.air_code.replace(/"+/, '') + ") " + element.airport_name.replace(/"+/, '') + " - " + element.city.replace(/"+/, '') + ", " + element.country_name;
            },
            list: {
                maxNumberOfElements: 20,
                match: {
                    enabled: true
                },
                onSelectItemEvent: function () {
                    value = $this.getSelectedItemData().air_code;
                    country = $this.getSelectedItemData().country_code;
                    if (value === parseInt($('input[name=departure_airport_code_' + id + ']').attr('value'))) {
                        $.growl.error({
                            title: "You cannot do that!",
                            message: "You cannot select the same location as departure and destination"
                        });
                        $this.val('');
                        $('input[name=arrival_country_id_' + id + ']').val('');
                    } else {
                        $('input[name=arrival_airport_code_' + id + ']').val(value).trigger("change");
                        $('input[name=arrival_country_id_' + id + ']').val(country).trigger("change");
                    }
                    $('input[name=arrival_country_' + id + ']').val(country);
                },
                onKeyEnterEvent: function () {
                    if (value === parseInt($('input[name=departure_airport_code_' + id + ']').attr('value'))) {
                        $.growl.error({
                            title: "You cannot do that!",
                            message: "You cannot select the same location as departure and destination"
                        });
                        $this.val('');
                        $('input[name=arrival_country_id_' + id + ']').val('');
                    } else {
                        $('input[name=arrival_airport_code_' + id + ']').val(value).trigger("change");
                        $('input[name=arrival_country_id_' + id + ']').val(country).trigger("change");
                    }
                    $('input[name=arrival_country_' + id + ']').val(country);
                }
            },
            theme: "square"
        };
        if (localStorage.getItem("airport_cities") === 'undefined' || localStorage.getItem("airport_cities") === null) {
            //if (typeof airportJsonCache == 'undefined') {
            //    options_to['url'] = function (p) {
            //        return "/api/get-airports?q=" + p;
            //    }
            //} else {
            //    options_to['data'] = airportJsonCache;
            //}
            if (typeof airportJsonUrl === 'undefined') {
                options_to['url'] = function (p) {
                    return "/api/get-airports?q=" + p;
                }
            } else {
                options_to['url'] = airportJsonUrl;
            }
        } else {
            options_to['data'] = jQuery.parseJSON(window.localStorage.getItem("airport_cities"));
        }
        //push the option into auto-select.
        $this.easyAutocomplete(options_to);
        $this.focus();
    };
    $.fn.deleteMultiCity = function ($this) {
        var class_section = $this.data('section');
        $('.multi_section_' + class_section).html('');
        var current_num_of_destination = parseInt($('input[name=num_of_destination]').val());
        current_num_of_destination = current_num_of_destination - 1;
        $('input[name=num_of_destination]').val(current_num_of_destination);
    };
    var date_picker_options_to = {
        dateFormat: 'yyyy-mm-dd',
        minDate: new Date(),
        language: 'en',
        autoClose: true
    };

    var date_picker_options_from = {
        dateFormat: 'yyyy-mm-dd',
        minDate: new Date(),
        language: 'en',
        autoClose: true,
        onSelect: function (formattedDate, date, inst) {
            date_picker_options_to['minDate'] = new Date(formattedDate);
            $('input[name=arrival_date_1]').click();
            $('input[name=arrival_date_1]').val(formattedDate);
        }
    };


    function multi_city_html(i) {
        var html = '<div class="multi_section_' + i + '">';
        html += '<div class="input-append col-sm-3 col-xs-12 bdr border-btm">';
        html += '<input class="input-box search_airport_from"  data-section="' + i + '" autoselect="true" autocomplete="off" aria-autocomplete="none" placeholder="Departing Airport" />';
        html += '<input type="hidden" name="departure_airport_code_' + i + '">';
        html += '<input type="hidden" name="departure_country_' + i + '">';
        html += '<i class="icon icon-map-marker"></i>';
        html += '</div>';
        html += '<div class="input-append col-sm-3 col-xs-12 bdr border-btm">';
        html += '<input class="input-box search_airport_to" data-section="' + i + '" autocomplete="off" autoselect="true" aria-autocomplete="none" placeholder="Arrival Airport" />';
        html += '<input type="hidden" name="arrival_airport_code_' + i + '">';
        html += '<input type="hidden" name="arrival_country_' + i + '">';
        html += '<i class="icon icon-map-marker"></i>';
        html += '</div>';
        html += '<div id="div_dt_from" class="input-append col-sm-4 col-xs-6 bdr border-btm">';
        html += '<input class="input-box departure_date" readonly data-type="dateIso" placeholder="Leaving on" name="departure_date_' + i + '" type="text">';
        html += '<i class="icon icon-calendar departure_date_icon"></i>';
        html += '</div>';
        html += '<div class="col-sm-2 col-xs-2" style="background: none; margin-top: 8px; border: 0; padding-left: 10px;">';
        html += '<button type="button" class="btn btn-danger delete_multi" data-section="' + i + '">X</button>';
        html += '</div>';
        html += '</div>';
        html += '<div class="clearfix"></div>';
        return html;
    }

    function compute_destination_locale() {
        var locale_dom = $('input[name=destination_locale]');
        var num_of_destination = $('input[name=num_of_destination]').val();
        var is_local = false;
        for (var i = 1; i <= num_of_destination; i++) {
            var departure_id = $('input[name=departure_country_' + i + ']').val();
            var arrival_id = $('input[name=arrival_country_' + i + ']').val();
            if (departure_id === arrival_id) {
                is_local = true;
            } else {
                is_local = false;
            }
        }
        if (is_local) {
            locale_dom.attr('value', 'Local');
        } else {
            locale_dom.attr('value', 'International');
        }
        return locale_dom.attr('value').toLowerCase();
    }

    //focus on the departure date by default
    $(document).on('ready', function () {
        //$('input[name=departure_airport]').focus();
    });
    /*
     | Rest form on Change Trip Type
     */
    $("#flight_search input[name=trip_type]").on('change', function () {
        var $this = $(this);
        $('input[type=hidden]').val('');
        $('input[type=radio]').removeAttr('id');
        $('input[type=radio]').removeAttr('checked');
        var trip_type = $(this).val();
        //$("#flight_search").get(0).reset();
        $("#flight_search").parsley('reset');
        $this.attr('id', 'checked');
        $this.attr('checked', 'checked');
        $('.multi_city_div').hide();
        $('input[name=num_of_destination]').val(1);
        switch (trip_type) {
            case 'ONE_WAY':
                $("#div_dt_from").removeClass('col-sm-2');
                $("#div_dt_from").addClass('col-sm-4');
                $("#div_dt_from").removeClass('col-xs-6');
                $("#div_dt_from").addClass('col-xs-12');
                $("#div_dt_to").hide();
                $('input[name=num_of_destination]').val(1);
                $('input[name=arrival_date_1]').removeAttr('required');
                $("input[name=flexible_date]").removeAttr('disabled');
                $('.flexible_date').show();
                break;
            case 'RETURN':
                $("#div_dt_from").removeClass('col-sm-4');
                $("#div_dt_from").addClass('col-sm-2');
                $("#div_dt_from").removeClass('col-xs-12');
                $("#div_dt_from").addClass('col-xs-6');
                $("#div_dt_to").show();
                $('input[name=num_of_destination]').val(1); //round trip is a two way destination.
                $('input[name=arrival_date_1]').attr('required', 'true');
                $("input[name=flexible_date]").removeAttr('disabled');
                $('.flexible_date').show();
                break;
            case 'MULTI_CITY':
                $('.search_airport_from').attr('required', 'required');
                $('.search_airport_to').attr('required', 'required');
                $("#div_dt_from").removeClass('col-sm-2');
                $("#div_dt_from").addClass('col-sm-4');
                $("#div_dt_from").removeClass('col-xs-6');
                $("#div_dt_from").addClass('col-xs-12');
                $("#div_dt_to").hide();
                $('.multi_city_div').show();
                $('input[name=num_of_destination]').val(4);
                $('input[name=arrival_date_1]').attr('data-required', 'true');
                $('input[name=arrival_date_1]').attr('data-type', 'dateIso');
                $('input[name=arrival_date_1]').addClass('parsley-validated');
                $("input[name=flexible_date]").attr('disabled', 'disabled');
                $('.flexible_date').hide();
                $('.flexible_date').removeAttr('checked');
                break;
        }
    });
    var timer = null;

    $('.add_more_multi_city').on('click', function () {
        var current_num_of_destination = parseInt($('input[name=num_of_destination]').val());
        current_num_of_destination = current_num_of_destination + 1;
        if (current_num_of_destination <= 5) {
            $('input[name=num_of_destination]').val(current_num_of_destination);
            var html_append = multi_city_html(current_num_of_destination);
            $(html_append).appendTo('.more_multi_city_div');
            $(".search_airport_from").on('keyup keyenter paste', function () {
                var $this = $(this);
                if (localStorage.getItem("airport_cities") === 'undefined' || localStorage.getItem("airport_cities") === null) {
                    setTimeout(function () {
                        $(this).funcAutoSuggestDeparture($this);
                    }, 500);
                } else {
                    $(this).funcAutoSuggestDeparture($(this));
                }
            });
        } else {
            $.growl.error({
                title: "You cannot do that!",
                message: "You cannot add more than " + current_num_of_destination + " destinations"
            });
        }
        $(".search_airport_to").on('keyup keyenter paste', function () {
            var $this = $(this);
            if (localStorage.getItem("airport_cities") === 'undefined' || localStorage.getItem("airport_cities") === null) {
                setTimeout(function () {
                    $(this).funcAutoSuggestArrival($this);
                }, 500);
            } else {
                $(this).funcAutoSuggestArrival($(this));
            }
        });
        $(".departure_date").click(function () {
            var $this = $(this);
            $this.datepicker(date_picker_options_from);
            $this.focus();
        });
        $(".arrival_date").click(function () {
            var $this = $(this);
            date_picker_options_to['onSelect'] = function () {

            }
            $this.datepicker(date_picker_options_to);
            $this.focus();
        });
        $(".delete_multi").on('click', function () {
            $(this).deleteMultiCity($(this));
        });
        $(".departure_date_icon, .arrival_date_icon").on('click', function () {
            $(this).prev('input').click();
        });
    });

    $(".delete_multi").on('click', function () {
        $(this).deleteMultiCity($(this));
    });

    $(".search_airport_from").on('keyup keyenter paste', function () {
        var $this = $(this);
        if (localStorage.getItem("airport_cities") === 'undefined' || localStorage.getItem("airport_cities") === null) {
            setTimeout(function () {
                $(this).funcAutoSuggestDeparture($this);
            }, 500);
        } else {
            $(this).funcAutoSuggestDeparture($(this));
        }
    });

    $(".search_airport_to").on('keyup keyenter paste', function () {
        var $this = $(this);
        if (localStorage.getItem("airport_cities") === 'undefined' || localStorage.getItem("airport_cities") === null) {
            setTimeout(function () {
                $(this).funcAutoSuggestArrival($this);
            }, 500);
        } else {
            $(this).funcAutoSuggestArrival($(this));
        }
    });

    $('.departure_date').first().attr('value', moment(new Date().setDate(new Date().getDate() + 2)).format("YYYY-MM-DD"));

    $('.departure_date').on('click', function (e) {
        var $this = $(this);
        $this.datepicker(date_picker_options_from);
        $this.focus();
    });

    $('.arrival_date').first().attr('value', to_d);

    $('.arrival_date').on('click', function () {
        var $this = $(this);
        $this.datepicker(date_picker_options_to);
        $this.focus();
    });
    $(".departure_date_icon, .arrival_date_icon").on('click', function () {
        $(this).prev('input').click();
    });

    $('.passenger_onclick').on('click', function () {
        $('#passenger-modal').modal('show');
    });

    /*
     | Increment and Decrement Button
     */
    var max_adult = 9;
    var max_children = 9;
    var max_infant = 9;
    var incre_obj;

    var current_adult = 1;
    var current_children = 0;
    var current_infant = 0;
    $(".increment").on('click', function () {
        incre_obj = $(this);
        if ($(this).hasClass('adults')) {
            current_adult = parseInt($("#js-adults").val());
            current_adult = current_adult + 1;
            if (current_adult === max_adult) {
                $(this).attr("disabled", true);
            }
            $("#js-adults").attr('value', current_adult);
            $(".passenger_onclick").val(current_adult + ' Adults');
        } else if ($(this).hasClass('children')) {
            current_children = parseInt($("#js-children").val());
            current_children += 1;
            if (current_children === max_children) {
                $(this).attr("disabled", true);
            }
            $("#js-children").attr('value', current_children);
            var tot_pass = current_children + current_adult + current_infant;
            $(".passenger_onclick").val(tot_pass + ' Passengers');
        } else if ($(this).hasClass('infants')) {
            current_infant = parseInt($("#js-infants").val());
            current_infant += 1;
            if (current_infant === max_infant) {
                $(this).attr("disabled", true);
            }
            $("#js-infants").attr('value', current_infant);
            var tot_pass = current_children + current_adult + current_infant;
            $(".passenger_onclick").val(tot_pass + ' Passengers');
        }
    });
    $(".decrement").on('click', function () {
        incre_obj = $(this);
        if ($(this).hasClass('adults')) {
            current_adult = parseInt($("#js-adults").val());
            current_adult -= 1;
            if (current_adult <= 1) {
                $(this).attr("disabled", true);
                current_adult = 1;
            }
            $("#js-adults").attr('value', current_adult);
            $(".passenger_onclick").val(current_adult + ' Adults');
        } else if ($(this).hasClass('children')) {
            current_children = parseInt($("#js-children").val());
            current_children -= 1;
            if (current_children <= 0) {
                $(this).attr("disabled", true);
                current_children = 0;
            }
            $("#js-children").attr('value', current_children);
            var tot_pass = current_children + current_adult + current_infant;
            $(".passenger_onclick").val(tot_pass + ' Passengers');
        } else if ($(this).hasClass('infants')) {
            current_infant = parseInt($("#js-infants").val());
            current_infant -= 1;
            if (current_infant <= 0) {
                $(this).attr("disabled", true);
                current_infant = 0;
            }
            $("#js-infants").attr('value', current_infant);
            var tot_pass = current_children + current_adult + current_infant;
            $(".passenger_onclick").val(tot_pass + ' Passengers');
        }
    });

    jQuery(window).load(function () {
        var currency = '&#x20a6;';
        if (typeof('ionRangeSlider') !== 'undefined' && typeof price_range !== 'undefined') {
            if (typeof(jQuery.cookie !== "undefined")) {
                if (jQuery.cookie("user_currency") === "undefined" || jQuery.cookie("user_currency") === 'USD') {
                    currency = "$";
                }
            }
            price_range.sort(function (a, b) {
                return a - b
            });
            stop_overs.sort(function (a, b) {
                return a - b
            });
            jQuery("#price_range").ionRangeSlider({
                type: "double",
                prefix: currency,
                prettify_separator: ',',
                from: price_range[0],
                values: price_range,
                drag_interval: false
            });
            jQuery("#stop_overs").ionRangeSlider({
                type: "double",
                grid: true,
                from: 0,
                values: stop_overs,
                drag_interval: true
            });
        }
    });

    form_DOM.on('submit', function (e) {
        var destination_locale = compute_destination_locale();
        //perform client side validation first.
        if (form_DOM.parsley().isValid() === false) {
            $.growl.error({
                title: "Validation Error",
                message: "Invalid form input, please check your form input"
            });
        } else {
            NProgress.start();
            if ($('input[name=trip_type]').val() !== 'RETURN') {
                var num_of_destination = $('input[name=num_of_destination]').val();
                for (var i = 1; i <= num_of_destination; i++) {
                    var o = $('input[name=arrival_airport_' + num_of_destination + ']');
                    o.attr('value', null);
                    o.val(null);
                }
            }
            $.ajax({
                xhr: function () {
                    var xhr = new window.XMLHttpRequest();
                    //Upload progress
                    xhr.upload.addEventListener("progress", function (evt) {
                        if (evt.lengthComputable) {
                            var percentComplete = evt.loaded / evt.total;
                            var flightProgressDOM = $('.flight-progress');
                            flightProgressDOM.attr('aria-valuenow', percentComplete);
                            flightProgressDOM.attr('style', 'width: ' + flightProgressDOM + '%');
                            $('.percentage-load').html(percentComplete);
                        }
                    }, false);
                    //Download progress
                    xhr.addEventListener("progress", function (evt) {
                        if (evt.lengthComputable) {
                            var percentComplete = evt.loaded / evt.total;
                            //Do something with download progress
                        }
                    }, false);
                    return xhr;
                },
                url: '/flight/search/' + destination_locale,
                type: 'get',
                data: form_DOM.serialize(),
                dataType: 'json',
                beforeSend: function () {
                    $("#load_screen").show();
                    form_DOM.find('input[type=submit]').addClass('disabled');
                    form_DOM.find('input[type=submit]').html('<i class="fa fa-spin fa-spinner"></i> Loading...');
                    //Booking flights for millions of customers worldwide!
                    //
                    //    You are searching for a return flight, from Lagos to Dubai.
                    //23 Jan 2016 - 30 Jan 2016
                    //for 1 passenger
                    var tripName = $("input[name=trip_type]:checked").val();
                    var departureAirport = $('input[name=departure_airport]').val();
                    var arrivalAirport = $('input[name=arrival_airport]').val();
                    var depDate = $('input[name=departure_date_1]').val();
                    var arrDate = $('input[name=arrival_date_1]').val();
                    var desc_html = "<h2>We're searching for the best available price.</h2>";
                    desc_html += "<p>Searching for a " + tripName.replace("_", " ") + " flights from <br />" + departureAirport + " to " + arrivalAirport + ".<br />";
                    ;
                    if (tripName === 'MULTI_CITY') {
                        desc_html += " and other cities.";
                    } else if (tripName === 'ROUND_TRIP') {
                        desc_html += depDate + " - " + arrDate;
                    } else {
                        desc_html += "On " + depDate;
                    }
                    desc_html += " for " + $(".passenger_onclick").val() + "</p>";
                    $(".loading-msg").html(desc_html);
                },
                success: function (response) {
                    if (response.responseCode === 200) {
                        window.location.href = "/flight/r/" + destination_locale + "?" + form_DOM.serialize();
                    } else if (response.responseCode === 503) {
                        $("#loading").hide();
                        $.growl.error({
                            title: "Request failed",
                            message: "Request failed, please check your form input and try again"
                        });
                    }
                },
                error: function () {
                    $.growl.error({
                        title: "Request failed",
                        message: "Request failed, please try again"
                    });
                    $("#load_screen").hide();
                },
                complete: function () {
                    //NProgress.done();
                    form_DOM.find('input[type=submit]').removeClass('disabled');
                }
            });

        }
        return false;
    });

    $.fn.getParameterByName = function (name) {
        name = name.replace(/[\[]/, "\\[").replace(/[\]]/, "\\]");
        var regex = new RegExp("[\\?&]" + name + "=([^&#]*)"),
            results = regex.exec(location.search);
        return results === null ? "" : decodeURIComponent(results[1].replace(/\+/g, " "));
    };

    $(".research-flight").on('click', function () {
        $("#load_screen").show();
        form_DOM.find('input[type=submit]').addClass('disabled');
        form_DOM.find('input[type=submit]').html('<i class="fa fa-spin fa-spinner"></i> Loading...');
        var desc_html = "<h3>We're searching for the best available price.</h3>";
        $(".loading-msg").html(desc_html);
    });

    //notify the user every 5min. that the price might increase if not
    if (window.location.pathname === '/flight/r/international' || window.location.pathname === '/flight/r/local' || window.location.pathname === '/flights/flight-passenger-itinerary') {
        setTimeout(function () {
            $.growl.notice({
                title: "Hurry up!",
                message: "The price of this fare might increase. Be fast!",
                duration: 1000 * 15
            });
        }, 1000 * 60 * 3);
    }

    /**
     * using jQuery to modify the css of the flight form.
     */
    if (window.location.pathname === '/flight/r/international' || window.location.pathname === '/flight/r/local' || window.location.pathname === '/flights/flight-passenger-itinerary') {
        var btn = $(".border-btm-orange"),
            cabin_class = $("select[name=cabin_class]");
        // btn.removeClass('col-sm-1');
        // btn.addClass('col-sm-3');
        btn.css('background', '#FF5A00');
        cabin_class.closest('div').css('border', '1px solid #ccc');
    }


    $('.hotel-suggest-modal').on('click', function () {
        //$(".hotel-modal").modal('show');
        //return false;
    });

    //Passenger Itinerary Booking Process
    $(".step-action").on('click', function () {
        var $this = $(this), step = $this.data('step'), stepyTitle = $(".stepy-title"), breadcrumb = $('ol.breadcrumb > li');
        switch (step) {
            case 2:
                stepyTitle.html('REVIEW FLIGHT DETAILS');
                $('ol.breadcrumb > li:nth-child(3)').removeClass('active');
                breadcrumb.next(":nth-child(2)").addClass('active');
                $("#step3").fadeOut('slow').hide();
                $("#step2").fadeIn('show').show();
                break;
            case 3:
                stepyTitle.html('PASSENGER DETAILS');
                $('ol.breadcrumb > li:nth-child(2)').removeClass('active');
                breadcrumb.next(":nth-child(3)").addClass('active');
                breadcrumb.next(":nth-child(3)").html('PASSENGER DETAILS');
                $("#step2").fadeOut('slow').hide();
                $("#step3").fadeIn('show').show();
                break;
            case 4:
                if ($("#flight-booking").parsley('validate') === true) {
                    stepyTitle.html('PAYMENT');
                    $('ol.breadcrumb > li:nth-child(3)').removeClass('active');
                    breadcrumb.next(":nth-child(4)").addClass('active');
                    breadcrumb.next(":nth-child(4)").html('PAYMENT');
                    $("#step3").fadeOut('slow').hide();
                    $("#step4").fadeIn('show').show();
                }
                break;
        }
    });


    var activeStep;
    $('.continue-flight-booking-step').on('click', function () {
        var $this = $(this);
        activeStep = $this.data('step');
        var step1Pagination = $('#pagination_1');
        var step2Pagination = $('#pagination_2');
        var step3Pagination = $('#pagination_3');

        if (activeStep === 1) {
            $this.data('step', 2);
            $this.attr('data-step', 2);
            $('<span><a class="back-to-flight-review" style="cursor: pointer;"> Back</a></span>').appendTo($('#pagination_1 span:nth-child(3)'));
            step1Pagination.removeClass('active');
            step1Pagination.addClass('tobe_select');
            step2Pagination.removeClass('tobe_select');
            step2Pagination.addClass('active');
            $(".flight_review").fadeOut('slow').hide();
            $(".traveller_bio_data").fadeIn('slow').show();
            $this.html('Continue Booking');
        } else if (activeStep === 2) {
            //$("#flight-booking").validate();
            if ($("#flight-booking").parsley('validate') === true) {
                $this.data('step', 3);
                $this.attr('data-step', 3);
                $('<span><a class="back-to-passenger-review" style="cursor: pointer;"> Back</a></span>').appendTo($('#pagination_2 span:nth-child(3)'));
                step1Pagination.removeClass('active');
                step2Pagination.removeClass('active');
                step1Pagination.addClass('tobe_select');
                step2Pagination.addClass('tobe_select');
                step3Pagination.addClass('active');
                step3Pagination.removeClass('tobe_select');
                $(".traveller_bio_data").fadeOut('slow').hide();
                $(".payment_section").fadeIn('slow').show();
                $this.html('Proceed to Payment');
            } else {
                $.growl.error({
                    title: "Form Input Error!",
                    message: "Please check form field values."
                });
            }
        } else if (activeStep === 3) {
            NProgress.start();
            return true;
        }


        $('.back-to-flight-review').click(function () {
            $this.data('step', 1);
            $this.attr('data-step', 1);
            $('.back-to-flight-review').remove();
            $('.back-to-passenger-review').remove();
            step1Pagination.addClass('active');
            step1Pagination.removeClass('tobe_select');
            step2Pagination.removeClass('active');
            step2Pagination.addClass('tobe_select');
            step3Pagination.removeClass('active');
            step3Pagination.addClass('tobe_select');
            $(".traveller_bio_data").fadeOut('slow').hide();
            $(".payment_section").fadeOut('slow').hide();
            $(".flight_review").fadeIn('slow').show();
        });

        $(".back-to-passenger-review").click(function () {
            $this.data('step', 2);
            $this.attr('data-step', 2);
            $('.back-to-passenger-review').remove();
            step2Pagination.addClass('active');
            step2Pagination.removeClass('tobe_select');
            step3Pagination.removeClass('active');
            step3Pagination.addClass('tobe_select');
            $(".flight_review").fadeOut('slow').hide();
            $(".payment_section").fadeOut('slow').hide();
            $(".traveller_bio_data").fadeIn('slow').show();
        });
        return false;
    });


    $("input[name=same_as_adult1]").on('click', function () {
        var c_title = $("#title").first();
        var c_fname = $('#first_name').first();
        var c_lname = $('#last_name').first();
        if ($(this).is(':checked')) {
            var title = c_title.val();
            var first_name = c_fname.val();
            var last_name = c_lname.val();
            $('select[name=contact_title]').val(title);
            $('input[name=contact_first_name]').val(first_name);
            $('input[name=contact_surname]').val(last_name);
        } else {
            $('select[name=contact_title]').val('');
            $('input[name=contact_first_name]').val('');
            $('input[name=contact_surname]').val('');
        }
    });

    $(".process-booking").click(function () {
        $(this).disable();
        $("#load_screen").show();
        var desc_html = "<h2>Loading...please wait</h2>";
        $(".loading-msg").html(desc_html);
        return true;
    });
});