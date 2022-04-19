/**
 * Developed By Igbalajobi Jamiu
 * Date: November 19, 2015 5:24PM
 *
 */

/*
 * Angular JS
 *
 */
var cCurrency = 'user_currency';
var cCurrencyCountry = 'u_cr_country';
var cUniqUID = 'uniq_u';

var angularApp = angular.module('appInit', ['ngCookies']);

angularApp.factory('appFactory', function ($cookies, $http) {
    var factory = {};
    factory.getCurrency = function (currencyCode) {
        return $http({
            method: 'GET',
            url: '/api/get-currencies?code=' + currencyCode,
            headers: {'Content-Type': 'application/json'}
        });
    };

    factory.getUserUid = function () {
    };
    return factory;
});
angularApp.filter('split', function () {
    return function (input, splitChar, splitIndex) {
        return input.split(splitChar)[splitIndex];
    }
});

angularApp.controller('switchCurrencyCtrl', function ($scope, $cookies, $http, appFactory) {
    if ($cookies.get(cCurrency) == 'undefined' || $cookies.get(cCurrency) == null) {
        $scope.currencycode = "NGN";
        $scope.currencycountry = "Nigeria";
    } else {
        $scope.currencycode = $cookies.get(cCurrency); //the default currency code should be NGN.
        $scope.currencycountry = $cookies.get(cCurrencyCountry); //the default currency code should be NGN.
    }
    $scope.changeCurrency = function (currencyCode) {
        appFactory.getCurrency(currencyCode).then(function (response) {
            if (response.status == 200) {
                var countryName = response.data.country_id.name.replace(" ", "-");
                $cookies.put(cCurrency, response.data.code); //set the value to cookie
                $cookies.put(cCurrencyCountry, countryName); //set the value to cookie
                $scope.currencycode = response.data.code;
                $scope.currencycountry = countryName;
                $(function () {
                    $.growl.notice({
                        title: "",
                        message: "Currency changed to " + currencyCode,
                        duration: 1000 * 15
                    });

                });
            }
        });
    };
});

/*
 * JQuery
 */
$(document).ready(function () {
    'use strict';


    $('a, .xhr-load').on('click', function () {
        var pageurl = $(this).attr('href');
        if (typeof pageurl !== 'undefined') {
            var isHashUrl = pageurl.toString().substring().substr(0, 1) === '#';
            var isJavascriptUrl = pageurl.toString().substr(0, 10) == 'javascript',
                noxhr = $(this).hasClass('noxhr');
            var hasTarget = ($(this).attr('target') !== 'undefined' && $(this).attr('target') !== null);
            if (!isHashUrl && !isJavascriptUrl && hasTarget) {
                NProgress.start();
            }
            if ($(this).hasClass('xhr-load')) {
                if (!isHashUrl && !noxhr && !hasTarget) {
                    $('#wrap').load(pageurl + " #main", function (responseTxt, response, xhr) {
                        if (response === 'success') {
                            NProgress.done();
                            if (pageurl != window.location) {
                                window.history.pushState({path: pageurl}, '', pageurl);
                            }
                        }
                    });
                    return false;
                }
                return false;
            }
        }
    });

    if (typeof("storage") !== "undefined") {
        if (localStorage.getItem("airport_cities") === 'undefined' || localStorage.getItem("airport_cities") === null) {
            $.ajax({
                url: '/api/get-airports',
                dataType: "json",
                type: 'GET',
                success: function (data) {
                    var arr = [];
                    $.each(data, function (i, value) {
                        var obj = new Object();
                        obj.airport_name = value.airport_name;
                        obj.city = value.city;
                        obj.country_code = value.country_code;
                        obj.country_name = value.country_name;
                        obj.air_code = value.air_code;
                        obj.id = value.id;
                        arr.push(obj);
                    });
                    localStorage.setItem("airport_cities", JSON.stringify(arr));
                }
            });
        }
    }


    $("select[name=country_id]").on('change', function () {
        var $this = $(this);
        var country_id = $(this).val();
        var state = $("select[name=state]");
        state.text('loading...');
        $.ajax({
            url: '/api/get-state?countryId=' + country_id,
            dataType: 'json',
            success: function (resp) {
                state.append($('<option>', {
                    text: 'Select States',
                    value: null
                }));
                $.each(resp, function (k, v) {
                    state.append($('<option>', {
                        value: v.id,
                        text: v.name
                    }));
                });
            },
            complete: function () {
                $this.removeClass('disabled');
                state.removeClass('disabled');
            }
        });
    });

    if (typeof($.datepicker) !== 'undefined') {
        $("input[name=dob], .dob").datepicker({
            dateFormat: 'yyyy-mm-dd',
            maxDate: new Date(),
            language: 'en',
            autoClose: true
        });

        $(".date_picker").datepicker({
            dateFormat: 'yyyy-mm-dd',
            language: 'en',
            autoClose: true
        });
    }
    if (typeof($.dataTable) !== 'undefined') {
        $('.datatable').dataTable();
    }

    if (typeof('CKEDITOR') !== 'undefined' && typeof('CKEDITOR') !== 'string') {
        var config = {
            codeSnippet_theme: 'Monokai',
            language: 'en',
            height: 400,
            //width: '100%',
            filebrowserUploadUrl: '/jargon/uploader.php',
            filebrowserBrowseUrl: '/browser/browse?type=Images',
            filebrowserWindowWidth: 100,
            filebrowserWindowHeight: 100,
            toolbarGroups: [
                {name: 'clipboard', groups: ['clipboard', 'undo']},
                {name: 'editing', groups: ['find', 'selection', 'spellchecker']},
                {name: 'links'},
                {name: 'insert'},
                {name: 'forms'},
                {name: 'tools'},
                {name: 'document', groups: ['mode', 'document', 'doctools']},
                {name: 'others'},
                {name: 'basicstyles', groups: ['basicstyles', 'cleanup']},
                {name: 'paragraph', groups: ['list', 'indent', 'blocks', 'align', 'bidi']},
                {name: 'styles'},
                {name: 'colors'}
            ]
        };
        CKEDITOR.replace('ck-editor', config);
    }

    if (typeof($.summernote) !== 'undefined') {
        var $summernote = $('.sm-editor').summernote({
            minHeight: 200,
            height: 200
        });
    }
    /*
     | Chosen Select
     */
    if (typeof('chosen') !== 'undefined') {
        //$('.chosen-select').chosen();
    }
    //$('[data-toggle="tooltip"]').tooltip();
    //Bootstrap tab
    if (window.location.hash != 'undefined' && window.location.hash != null) {
        $('.hometabs a[href="' + window.location.hash + '"]').tab('show'); // Select tab by name
    }

    //subscribe to user newsletter.
    $("#sub_newsletter").on('submit', function (e) {
        var $this = $(this);
        if ($this.parsley('isValid')) {
            $.ajax({
                url: $this.attr('action'),
                type: $this.attr('method'),
                data: $this.serialize(),
                beforeSend: function () {
                    $this.find('button[type=submit]').html('Loading...');
                },
                success: function (xhr) {
                    if (xhr.status === 1) {
                        $.growl.notice({
                            message: "Newsletter subscribed successfully",
                            title: "Successful"
                        });
                    } else if (xhr.status === 0) {
                        $.growl.warning({
                            message: "Email address has already been registered.",
                            title: "Notice"
                        });
                    } else {
                        $.growl.error({
                            message: "Request failed, please try again later",
                            title: "Unknown Error"
                        });
                    }
                },
                complete: function () {
                    $this.find('button[type=submit]').html('Get me Deals!');
                }
            });
        } else {
            $.growl.error({
                message: "Invalid email address entered",
                title: "Validation Error"
            });
        }
        e.preventDefault();
        return false;
    });

    /*  (function () {
        if (navigator.geolocation) {
            navigator.geolocation.getCurrentPosition(function (position) {
                //GET USER CURRENT LOCATION
                var lat = position.coords.latitude, long = position.coords.longitude;
                var cookie_duration = 60 * 60 * 25; //cookie last for a day
                if (typeof(jQuery.cookie !== "undefined")) {
                    if (typeof(jQuery.cookie("near_airport")) === 'undefined' || typeof(jQuery.cookie("airport_code")) === 'undefined') {

                         $.ajax({
                         url: "http://iatageo.com/getCode/" + lat + "/" + long,
                         dataType: 'JSON',
                         type: 'GET',
                         success: function (response) {
                         if (response.code !== 'undefined') {
                         var airportCode = response.code;
                         jQuery.cookie('near_airport', airportCode, {expires: cookie_duration, path: '/'});
                         $.ajax({
                         url: '/api/get-airports?code=' + airportCode,
                         dataType: 'json',
                         success: function (res) {
                         localStorage.setItem('airport_info', JSON.stringify(res));
                         }
                         });
                         }
                         }
                         });

                    } else {
                        if (typeof(jQuery.cookie("near_airport") !== "undefined")) {
                            var airport = jQuery.parseJSON($.cookie("near_airport"));
                            if (airport !== null && airport !== 'undefined') {
                                $('input[name=departure_airport_id_1]').attr('value', airport.id);
                                $('input[name=departure_airport]').val(airport.airport_name + ' - ' + airport.city + ' (' + airport.air_code + ')');
                                $('input[name=departure_country_1]').val(airport.country_id.id);
                            }
                        }
                    }
                }
            });

        }
    }(document, 'scripts', 'geo-location'));
     */

    function copyToClipboard(element) {
        var $temp = $("<input>")
        $("body").append($temp);
        $temp.val(element).select();
        document.execCommand("copy");
        $temp.remove();
    }

    $('.copy_to_clip').click(function () {
        copyToClipboard($(this).data('value'));
    });

    if (window.location.pathname === '/tfx/cms/page') {
        $('body').on('click', '.gen_short_url', function () {
            var $this = $(this),
                loadingUrlShortner = $(".loading-url-shortner"), bitLyToken = '0c18a59c228a0e9094b6e38d1d335e8a1df907d1';
            loadingUrlShortner.prev('button').html('.loading...');
            $.ajax({
                url: 'https://api-ssl.bitly.com/v3/link/lookup?access_token=' + bitLyToken + "&url=" + "http://" + $this.data('host') + $this.data('url'),
                type: 'GET',
                success: function (response) {
                    if (response !== 'undefined') {
                        if (response.status_code === 200) {
                            var bitLyUrl = response.data.link_lookup[0];
                            $.growl.notice({
                                message: "Shortened URL has been copied to clipboard.",
                                title: "Notice"
                            });
                        } else {
                            $.growl.error({
                                message: "Request failed, please try again later",
                                title: "Unknown Error"
                            });
                        }
                    }
                },
                complete: function () {
                    //loadingUrlShortner.html('URL Shortening');
                }
            })
        });
        return false;
    }

    $('a[role=tab]').click(function (e) {
        e.preventDefault();
        $(this).tab('show');
    });

    $(".lazy-load").lazyload({
        effect: "fadeIn"
    });
});
