/**
 * Created by Kode on 1/19/16.
 */

/**
 * AngularJS
 */



/**
 * JQuery Code
 */
jQuery(function () {
    'use strict';

    $.fn.getHotelGeoLocation = function ($this) {
        var value = null;
        var options_from = {
            getValue: function (element) {
                var country = element.country_id;
                if(country !== null) {
                    var countryName = country["name"];
                    return element.name.replace(/"+/, '') + ", " + countryName.replace(/"+/, '') + " (" + element.city_code1.replace(/"+/, '') + ")";
                    //return element.name.replace(/"+/, '') + ", " + country.name.replace(/"+/, '') + " (" + element.city_code1.replace(/"+/, '') + ")";
                } else {
                    return "";
                }
            },
            list: {
                maxNumberOfElements: 50,
                match: {
                    enabled: true
                },
                onSelectItemEvent: function () {
                    var json_obj = $this.getSelectedItemData();
                    value = $this.getSelectedItemData().city_code1;
                    var country_name = json_obj.country_id['name'];
                    $('input[name=iso_city_code]').attr('value', value);
                    $('input[name=iso_city_name]').attr('value', json_obj.name);
                    $('input[name=iso_city_id]').attr('value', json_obj.id);
                    $('input[name=iso_country_name]').attr('value', country_name);
                    $('input[name=iso_country_code]').attr('value', json_obj.country_id['iso_code_3']);
                },
                onKeyEnterEvent: function () {
                    var json_obj = $this.getSelectedItemData();
                    value = $this.getSelectedItemData().city_code1;
                    var country_name = json_obj.country_id['name'];
                    $('input[name=iso_city_code]').attr('value', value);
                    $('input[name=iso_city_name]').attr('value', json_obj.name);
                    $('input[name=iso_city_id]').attr('value', json_obj.id);
                    $('input[name=iso_country_name]').attr('value', country_name);
                    $('input[name=iso_country_code]').attr('value', json_obj.country_id['iso_code_3']);
                }
            },
            theme: "square"
        };

        if (localStorage.getItem("tfx_cities") === 'undefined' || localStorage.getItem("tfx_cities") === null) {
            if (typeof hotelCitiesUrl === 'undefined') {
                options_from['url'] = function (p) {
                    return "/api/get-state?q=" + p;
                }
            } else {
                options_from['url'] = hotelCitiesUrl;
            }
        } else {
            options_from['data'] = jQuery.parseJSON(window.localStorage.getItem("tfx_cities"));
        }
        $this.easyAutocomplete(options_from);
        $this.focus();
    };

    $(".destination").on('keyup keyenter paste', function () {
        $(this).getHotelGeoLocation($(this));
    });

    var hotel_date_picker_options_to = {
        dateFormat: 'yyyy-mm-dd',
        minDate: new Date(),
        language: 'en',
        autoClose: true
    }, hotel_date_picker_options_from = {
        dateFormat: 'yyyy-mm-dd',
        minDate: new Date(),
        language: 'en',
        autoClose: true,
        onSelect: function (formattedDate, date, inst) {
            hotel_date_picker_options_to['minDate'] = new Date(formattedDate);
            $('input[name=check_out_date]').click();
            $('input[name=check_out_date]').val(formattedDate);

        }
    }, to_dh = moment(new Date().setDate(new Date().getDate() + 3)).format("YYYY-MM-DD");

    var checkInDOM = $('input[name=check_in_date]');
    var checkOutDOM = $('input[name=check_out_date]');
    checkInDOM.first().attr('value', moment(new Date().setDate(new Date().getDate() + 2)).format("YYYY-MM-DD"));

    checkInDOM.on('click', function (e) {
        var $this = $(this);
        $this.datepicker(hotel_date_picker_options_from);
        $this.focus();
    });
    checkOutDOM.first().attr('value', to_dh);
    checkOutDOM.on('click', function () {
        var $this = $(this);
        $this.datepicker(hotel_date_picker_options_to);
        $this.focus();
    });
    $(".ht_departure_date_icon, .ht_arrival_date_icon").on('click', function () {
        $(this).prev('input').click();
    });


    $(".add-more-option").on('click', function () {
        var moreOptionDom = $(".more-options"), isMoreOptionHidden = moreOptionDom.is(':hidden');
        if (isMoreOptionHidden) {
            $(this).html('Fewer search options <i class="icon icon-caret-up"></i>');
            moreOptionDom.show();
        } else {
            $(this).html('More search options <i class="icon icon-caret-down"></i>');
            moreOptionDom.hide();
        }
        return false;
    });

    function isEmpty(str) {
        return typeof str == 'string' && !str.trim() || typeof str == 'undefined' || str === null;
    }

    $('button, .action-attr-count').on('click', function () {
        var $this = $(this), field = $('input[name=' + $this.data('input') + ']'), fieldVal = field.attr('value'), action = $this.data('action'), name_label = $this.data('label');
        if (isEmpty(fieldVal)) {
            fieldVal = 0;
        } else {
            fieldVal = parseInt(fieldVal);
        }
        if (action === 'increment') {
            fieldVal += 1;
        } else if (action === 'decrement' && fieldVal != 0) {
            fieldVal -= 1;
        }
        field.attr('value', fieldVal);
        if (name_label === 'children') {
            if (fieldVal <= 0) {
                $('input[name=' + name_label + ']').attr('value', 'No Child');
            } else {
                $('input[name=' + name_label + ']').attr('value', fieldVal + ' Children');
            }
        } else if (name_label === 'rooms') {
            $('input[name=' + name_label + ']').attr('value', fieldVal + ' ' + name_label);
            $('input[name=num_of_rooms]').attr('value', fieldVal);
            $('input[name=num_of_adults]').attr('value', fieldVal);
            $('input[name=Adults]').attr('value', fieldVal + ' Adults');
        } else {
            $('input[name=' + name_label + ']').attr('value', fieldVal + ' ' + name_label);
        }

    });

    $('.modify_search_toggle').on('click', function () {
        $('.modify_result_hotel_engine').toggle();
    });

    var formHotel = $("#hotel_search"), num_of_retry = 0;
    formHotel.on('submit', function () {
        if (formHotel.parsley().isValid() === false) {
            $.growl.error({
                title: "Validation Error",
                message: "Invalid form input, please check your form input"
            });
        } else {
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
                url: '/hotel/search',
                type: 'get',
                data: formHotel.serialize(),
                dataType: 'json',
                beforeSend: function () {
                    $("#load_screen").show();
                    formHotel.find('input[type=submit]').addClass('disabled');
                    formHotel.find('input[type=submit]').html('<i class="fa fa-spin fa-spinner"></i> Loading...');
                    var desc_html = "<h2>Relax! We'll get you the best and affordable hotels in " + formHotel.find('.destination').val() + "</h2>";
                    desc_html += "form " + $('input[name=check_in_date]').val() + " - " + $('input[name=check_out_date]').val();
                    $(".loading-msg").html(desc_html);
                },
                success: function (response) {
                    window.location.href = "/hotel/search-result?" + formHotel.serialize();
                    if (response.responseCode === 200) {

                    }
                },
                error: function () {
                    if (num_of_retry <= 5) {
                        console.log("Resubmit Request failed.");
                        formHotel.submit();
                    } else {
                        $.growl.error({
                            title: "Request failed",
                            message: "Request failed, please try again"
                        });
                        $("#load_screen").hide();
                        num_of_retry = 0;
                    }
                    num_of_retry += 1;
                },
                complete: function () {
                    formHotel.find('input[type=submit]').removeClass('disabled');
                }
            });
        }
        return false;
    });

    var activeStep;
    $('.continue-hotel-booking-step').on('click', function () {
        var $this = $(this);
        activeStep = $this.data('step');
        var step1Pagination = $('#pagination_1');
        var step2Pagination = $('#pagination_2');
        var step3Pagination = $('#pagination_3');

        if (activeStep === 1) {
            $this.data('step', 2);
            $('<span><a class="back-to-hotel-review" style="cursor: pointer;"> Back</a></span>').appendTo($('#pagination_1 span:nth-child(3)'));
            step1Pagination.removeClass('active');
            step1Pagination.addClass('tobe_select');
            step2Pagination.removeClass('tobe_select');
            step2Pagination.addClass('active');
            $("#review_booking_mod_section_id").fadeOut('slow').hide();
            $("#travellers_booking_section_id").fadeIn('slow').show();
        } else if (activeStep === 2) {
            $this.data('step', 3);
            $('<span><a class="back-to-passenger-review" style="cursor: pointer;"> Back</a></span>').appendTo($('#pagination_2 span:nth-child(3)'));
            step1Pagination.removeClass('active');
            step2Pagination.removeClass('active');
            step1Pagination.addClass('tobe_select');
            step2Pagination.addClass('tobe_select');
            step3Pagination.addClass('active');
            step3Pagination.removeClass('tobe_select');
            $("#travellers_booking_section_id").fadeOut('slow').hide();
            $("#booking_payment_section_id").fadeIn('slow').show();
        }


        $('.back-to-hotel-review').click(function () {
            $('.back-to-hotel-review').remove();
            step1Pagination.addClass('active');
            step1Pagination.removeClass('tobe_select');
            step2Pagination.removeClass('active');
            step2Pagination.addClass('tobe_select');
            $("#travellers_booking_section_id").fadeOut('slow').hide();
            $("#booking_payment_section_id").fadeOut('slow').hide();
            $("#review_booking_mod_section_id").fadeIn('slow').show();
        });

        $(".back-to-passenger-review").click(function () {
            $('.back-to-passenger-review').remove();
            step2Pagination.addClass('active');
            step2Pagination.removeClass('tobe_select');
            step3Pagination.removeClass('active');
            step3Pagination.addClass('tobe_select');


        });
        //return false;
    });
});