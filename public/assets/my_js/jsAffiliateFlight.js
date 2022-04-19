/**
 * Created by Kode on 11/20/15.
 */


jQuery(function (e) {
    'use strict';

    var from = null, to = null, day_sum = null, form_DOM = $('#flight_search'), to_d = moment(new Date().setDate(new Date().getDate() + 5)).format("YYYY-MM-DD");
    $.fn.departAutoSuggest = function ($this) {
        var value = null;
        var id = $this.data('section');
        var country = null;
        var options_from = {
            getValue: function (element) {
                return "(" + element.air_code.replace(/"+/, '') + ") " + element.airport_name.replace(/"+/, '') + " - " + element.city.replace(/"+/, '') + ", " + element.country_name;
            },
            list: {
                maxNumberOfElements: 15,
                match: {
                    enabled: true
                },
                onSelectItemEvent: function () {
                    value = $this.getSelectedItemData().id;
                    country = $this.getSelectedItemData().country_code;
                    if (value === parseInt($('input[name=arrival_airport_id_' + id + ']').attr('value'))) {
                        $.growl.error({
                            title: "You cannot do that!",
                            message: "You cannot select the same location as departure and destination"
                        });
                        $this.val('');
                        $('input[name=departure_country_id_' + id + ']').val('');

                    } else {
                        $('input[name=departure_airport_id_' + id + ']').attr('value', value);
                        $('input[name=departure_country_id_' + id + ']').attr('value', country);
                    }
                    $('input[name=departure_country_' + id + ']').val(country);
                },
                onKeyEnterEvent: function () {
                    if (value === parseInt($('input[name=arrival_airport_id_' + id + ']').attr('value'))) {
                        $.growl.error({
                            title: "You cannot do that!",
                            message: "You cannot select the same location as departure and destination"
                        });
                        $this.val('');
                        $('input[name=departure_country_id_' + id + ']').val('');

                    } else {
                        $('input[name=departure_airport_id_' + id + ']').attr('value', value);
                        $('input[name=departure_country_id_' + id + ']').attr('value', country);
                    }
                    $('input[name=departure_country_' + id + ']').val(country);
                }
            },
            theme: "square"
        };
        if (localStorage.getItem("airport_cities") === 'undefined' || localStorage.getItem("airport_cities") === null) {
            if(typeof airportJsonCache == 'undefined') {
                options_from['url'] = function (p) {
                    return "/api/get-airports?q=" + p;
                }
            } else {
                options_from['data'] = airportJsonCache;
            }
        } else {
            options_from['data'] = jQuery.parseJSON(window.localStorage.getItem("airport_cities"));
        }
        $this.easyAutocomplete(options_from);
        $this.focus();
    };
    $.fn.arriveAutoSuggest = function ($this) {
        var id = $this.data('section');
        var value = null;
        var country = null;
        var options_to = {
            getValue: function (element) {
                return "(" + element.air_code.replace(/"+/, '') + ") " + element.airport_name.replace(/"+/, '') + " - " + element.city.replace(/"+/, '') + ", " + element.country_name;
            },
            list: {
                maxNumberOfElements: 15,
                match: {
                    enabled: true
                },
                onSelectItemEvent: function () {
                    value = $this.getSelectedItemData().id;
                    country = $this.getSelectedItemData().country_code;
                    if (value === parseInt($('input[name=departure_airport_id_' + id + ']').attr('value'))) {
                        $.growl.error({
                            title: "You cannot do that!",
                            message: "You cannot select the same location as departure and destination"
                        });
                        $this.val('');
                        $('input[name=arrival_country_id_' + id + ']').val('');
                    } else {
                        $('input[name=arrival_airport_id_' + id + ']').val(value).trigger("change");
                        $('input[name=arrival_country_id_' + id + ']').val(country).trigger("change");
                    }
                    $('input[name=arrival_country_' + id + ']').val(country);
                },
                onKeyEnterEvent: function () {
                    if (value === parseInt($('input[name=departure_airport_id_' + id + ']').attr('value'))) {
                        $.growl.error({
                            title: "You cannot do that!",
                            message: "You cannot select the same location as departure and destination"
                        });
                        $this.val('');
                        $('input[name=arrival_country_id_' + id + ']').val('');
                    } else {
                        $('input[name=arrival_airport_id_' + id + ']').val(value).trigger("change");
                        $('input[name=arrival_country_id_' + id + ']').val(country).trigger("change");
                    }
                    $('input[name=arrival_country_' + id + ']').val(country);
                }
            },
            theme: "square"
        };
        if (localStorage.getItem("airport_cities") === 'undefined' || localStorage.getItem("airport_cities") === null) {
            if(typeof airportJsonCache == 'undefined') {
                options_to['url'] = function (p) {
                    return "/api/get-airports?q=" + p;
                }
            } else {
                options_to['data'] = airportJsonCache;
            }
        } else {
            options_to['data'] = jQuery.parseJSON(window.localStorage.getItem("airport_cities"));
        }
        //push the option into auto-select.
        $this.easyAutocomplete(options_to);
        $this.focus();
    };
    $.fn.deleteMultiCity = function($this) {
        var class_section = $this.data('section');
        $('.multi_section_' + class_section).html('');
        var current_num_of_destination = parseInt($('input[name=num_of_destination]').val());
        current_num_of_destination = current_num_of_destination - 1;
        $('input[name=num_of_destination]').val(current_num_of_destination);
    };
    var date_picker_options_from = {
        dateFormat: 'yyyy-mm-dd',
        minDate: new Date(),
        language: 'en',
        autoClose: true,
        onSelect: function(formattedDate, date, inst) {
            $('input[name=arrival_date_1]').click();
        }
    };
    var date_picker_options_to = {
        dateFormat: 'yyyy-mm-dd',
        minDate: new Date(),
        language: 'en',
        autoClose: true
    };

    function multi_city_html(i) {
        var html = '<div class="col-md-12 multi_section_' + i + '" style="margin-left: -25px; margin-bottom: 5px">';
        html += '<div class="col-md-3" style="margin-right: -19px;">';
        html += '<input class="form-control search_airport_from" data-name="" autocomplete="off" data-section="' + i + '" aria-autocomplete="none" placeholder="Departing Airport" />';
        html += '<input type="hidden" name="departure_airport_id_' + i + '">';
        html += '</div>';
        html += '<div class="col-md-3" style="margin-right: -19px;">';
        html += '<input class="form-control search_airport_to" autocomplete="off" data-section="' + i + '" aria-autocomplete="none" placeholder="Arrival Airport" />';
        html += '<input type="hidden" name="arrival_airport_id_' + i + '">';
        html += '</div>';
        html += '<div class="col-md-3" style="margin-left: 0px;width: 20%;">';
        html += '<input class="form-control departure_date" name="departure_date_' + i + '" data-type="dateIso" data-required="true" data-error-message="Invalid Departure Date" placeholder="Departure Date" type="text">';
        html += '</div>';
        html += '<div class="col-md-1" style="margin-left: -20px;width: 11%;">';
        html += '<button type="button" class="delete_multi btn-danger btn-sm" data-section="' + i + '" style="border-radius: 50px;border: 0;margin-top: 5px;margin-left: 5px;"><i class="fa fa-times"></i></button>';
        html += '</div>';
        html += '</div>';
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
    }
    /*
     | Rest form on Change Trip Type
     */
    $("#flight_search input[name=trip_type]").on('change', function () {
        var $this = $(this);
        $('input[type=hidden]').val('');
        $('input[type=radio]').removeAttr('id');
        $('input[type=radio]').removeAttr('checked');
        var trip_type = $(this).val();
        $("#flight_search").get(0).reset();
        $("#flight_search").parsley('reset');
        $this.attr('id', 'checked');
        $this.attr('checked', 'checked');
        $('.multi_city_div').hide();
        $('input[name=num_of_destination]').val(1);
        switch (trip_type) {
            case 'ONE_WAY':
                $("#div_dt_from").css('width', '20.3%');
                $("#div_dt_from").attr('class', 'col-md-3');
                $("#div_dt_to").hide();
                $('input[name=num_of_destination]').val(1);
                $('input[name=arrival_date_1]').removeAttr('required');
                break;
            case 'ROUND_TRIP':
                $("#div_dt_from").css('width', '11%');
                $("#div_dt_from").attr('class', 'col-md-2');
                $("#div_dt_to").show();
                $('input[name=num_of_destination]').val(1); //round trip is a two way destination.
                $('input[name=arrival_date_1]').attr('required', 'true');
                break;
            case 'MULTI_CITY':
                $('.search_airport_from').attr('required', 'required');
                $('.search_airport_to').attr('required', 'required');
                $("#div_dt_from").css('width', '20%');
                $("#div_dt_from").attr('class', 'col-md-3');
                $("#div_dt_to").hide();
                $('.multi_city_div').show();
                $('input[name=num_of_destination]').val(3); //a default of lo
                $('input[name=arrival_date_1]').attr('data-required', 'true');
                $('input[name=arrival_date_1]').attr('data-type', 'dateIso');
                $('input[name=arrival_date_1]').addClass('parsley-validated');
                break;
        }
    });

    $(".delete_multi").on('click', function () {
        $(this).deleteMultiCity($(this));
    });

    $('.add_more_multi_city').on('click', function () {
        var current_num_of_destination = parseInt($('input[name=num_of_destination]').val());
        current_num_of_destination = current_num_of_destination + 1;
        if (current_num_of_destination <= 10) {
            $('input[name=num_of_destination]').val(current_num_of_destination);
            $(multi_city_html(current_num_of_destination)).appendTo('.more_multi_city_div');
        } else {
            $.growl.error({
                title: "You cannot do that!",
                message: "You cannot add have upto " + current_num_of_destination + " destinations"
            });
        }
        $('.departure_date').on('click', function (e) {
            var $this = $(this);
            $this.datepicker(date_picker_options_from);
            $this.focus();
        });
        $('.arrival_date').on('click', function () {
            var $this = $(this);
            $this.datepicker(date_picker_options_to);
            $this.focus();
        });
        $(".search_airport_from").on('keyup keyenter paste', function() {
            $(this).departAutoSuggest($(this));
        });
        $(".search_airport_to").on('keyup keyenter paste', function() {
            $(this).arriveAutoSuggest($(this));
        });
        $(".delete_multi").on('click', function () {
            $(this).deleteMultiCity($(this));
        });
    });

    //var count = 0;
    $(".search_airport_from").on('keyup keyenter paste', function() {
        $(this).departAutoSuggest($(this));
    });

    $(".search_airport_to").on('keyup keyenter paste', function() {
        $(this).arriveAutoSuggest($(this));
    });

    $('.advance_search_click').click(function () {
        $(".advance_search_div").toggle();
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

    form_DOM.on('submit', function (e) {
        compute_destination_locale();
        //perform client side validation first.
        if (!form_DOM.parsley().isValid()) {
            $.growl.error({
                title: "Validation Error",
                message: "Invalid form input, please check your form input"
            });
        } else {
            NProgress.start();
            //process the request and send
            $.ajax({
                url: '/b2b/flight/search',
                type: 'get',
                data: form_DOM.serialize(),
                dataType: 'json',
                beforeSend: function (e) {
                    $("#loading").fadeOut(500);
                    $("#loading").show();
                    form_DOM.find('button').removeClass('btn btn-success');
                    form_DOM.find('button').addClass('btn btn-default');
                    form_DOM.find('button').addClass('disabled');
                    form_DOM.find('button').html('<i class="fa fa-spin fa-spinner"></i> Loading Flights');
                },
                onProgress: function (e) {
                    console.log(e);
                },
                success: function (response) {
                    if (response.responseCode === 200) {
                        window.location.href = "/b2b/flight/result?" + form_DOM.serialize();
                    } else if (response.responseCode === 503) {
                        $("#loading").hide();
                        $.growl.error({
                            title: "Request failed",
                            message: "Request failed, please check your form input and try again"
                        });
                    } else {

                    }
                },
                onError: function () {

                },
                complete: function () {
                    NProgress.done();
                    form_DOM.find('button').removeClass('disabled');
                }
            });

        }
        return false;
    });

    //Display of flight result.
    $(function () {
        var oTable = $('#display_flight_result').DataTable({
            "aoColumnDefs": [
                {'bSortable': false, "sWidth": "0%", 'aTargets': [0]},
                {'bSortable': true, "sWidth": "20%", 'aTargets': [1]},
                {'bSortable': true, "sWidth": "25%", 'aTargets': [2]},
                {'bSortable': true, "sWidth": "25%", 'aTargets': [3]},
                {'bSortable': true, "sWidth": "4%", 'aTargets': [4]},
                {'bSortable': true, "sWidth": "4%", 'aTargets': [5]},
                {'bSortable': true, "sWidth": "10%", 'aTargets': [6]},
                {'bSortable': false, "sWidth": "8%", 'aTargets': [7]},
            ],
            "aOrder": [
                [0, "asc"]
            ],
            "oLanguage": {
                "oPaginate": {
                    "sPrevious": "",
                    "sNext": ""
                }
            },
            "bProcessing": true,
            "iDisplayLength": 25,
            "aLengthMenu": [
                [5, 10, 25, 50, -1],
                [5, 10, 25, 50, "All"]
            ],
            "sDom": 't<"dt-panelfooter clearfix"ip>',
            "oTableTools": {
                "sSwfPath": "vendor/plugins/datatables/extensions/TableTools/swf/copy_csv_xls_pdf.swf"
            }
        });

        $("select[name=sort_price]").on('change', function () {
            oTable.draw();
        });
    });

    if (window.location.pathname === '/b2b/flight/search' || window.location.pathname === '/b2b/flight/result') {
        //if the page is not active in 35Min. Ensure the user is redirected away from the page.
        setTimeout(function () {
            $(".session-timeout").modal({
                backdrop: 'static',
                keyboard: false,
                show: true
            });
        }, 1000 * 60 * 30); //delay for 30min
    }

});