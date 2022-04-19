/*
 *  Checkout jQuery File
 *
 * 	All the jquery functions that controls interactivity
 *	written by Igbalajobi Jamiu Okunade
 *
 *	Copyright (c) May 2015
 */

$(function () {

    function validateEmail(emailAddress) {
        var pattern = /^([a-z\d!#$%&'*+\-\/=?^_`{|}~\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]+(\.[a-z\d!#$%&'*+\-\/=?^_`{|}~\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]+)*|"((([ \t]*\r\n)?[ \t]+)?([\x01-\x08\x0b\x0c\x0e-\x1f\x7f\x21\x23-\x5b\x5d-\x7e\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]|\\[\x01-\x09\x0b\x0c\x0d-\x7f\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]))*(([ \t]*\r\n)?[ \t]+)?")@(([a-z\d\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]|[a-z\d\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF][a-z\d\-._~\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]*[a-z\d\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])\.)+([a-z\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]|[a-z\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF][a-z\d\-._~\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]*[a-z\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])\.?$/i;
        return pattern.test(emailAddress);
    }

    $('.login-action').on('click', function () {
        $("#login-reg-modal").toggle();
        return false;
    });

    $('select[name=referral]').on('change', function () {
        var value = $(this).val();
        if (value === 'tfx_staff') {
            $('.tfx_staff_code_div').show();
            $('.tfx_staff_code_div').attr('required', 'required');
        } else {
            $('.tfx_staff_code_div').hide();
            $('.tfx_staff_code_div').removeAttr('required');
            $('input[name=tfx_staff_code]').val('');
        }

        if (value === 'others') {
            $('.other_div').show();
        } else {
            $('.other_div').hide();
            $('input[name=other_referral]').val('');
        }
    });

    //Sign In to form
    jQuery(function () {
        /* For Login functionality */
        $('#login_form').on('submit', function () {
            var $this = $(this);
            var password = $this.find('#password').val();
            var email = $this.find("#email").val();
            if (email === '' || password === '') {
                $('.signin-error').html('<strong>Oops! email and password are required.</strong>').removeClass('hide');
            } else {
                //Everything seem to be fine
                $.ajax({
                    url: '/login',
                    dataType: 'JSON',
                    type: 'POST',
                    data: $this.serialize(),
                    beforeSend: function () {
                        $("#submitLogin").addClass('disabled');
                        $('#submitLogin').html('<i class="fa fa-spin fa-spinner"></i> loading...please wait');
                    },
                    success: function (response) {
                        if (response.status === 0) {
                            $('.signin-error').html('<strong>' + response.desc + '</strong>').removeClass('hide');
                        } else if (response.status === 1) {
                            //Account registration success, notify the user of a successful registration process
                            $('.signin-success').html('<strong>Login successful, wait while page redirect</strong>').removeClass('hide');
                            setTimeout(function () {
                                window.location.href = response.url;
                            }, 1000);
                        } else {
                            $('.signin-error').html('<strong>Unresolved error occurred, please try again later</strong>').removeClass('hide');
                        }
                    },
                    complete: function () {
                        $("#submitLogin").removeClass("disabled");
                        $('#submitLogin').html('Login');
                    }, error: function () {
                        $('.signin-error').html('<strong>Oops! An error occurred, please try again</strong>').removeClass('hide');
                    }
                });
            }
            setTimeout(function () {
                $('.signin-error').addClass('hide').fadeOut('slow');
            }, 5000);
            setTimeout(function () {
                $('.signin-success').addClass('hide').fadeOut('slow');
            }, 8000);
            return false;
        });
        hideAlert('signin-success', 'signin-error');
    });

    //Register
    jQuery(function () {
        /* For Registration functionality */
        if (window.location.pathname === "/register" || window.location.pathname === "/b2b/register") {
            $("#email").on('blur', function () {
                var email = $(this).val(), info_div = $(".email-val-ajax");
                if (!validateEmail(email)) {
                    info_div.html("<i class=\"fa fa-close\"></i> Invalid email address.");
                } else {
                    $.ajax({
                        url: '/validate-email-ajax',
                        type: 'get',
                        data: {
                            "email": email
                        },
                        beforeSend: function () {
                            info_div.html('<i class="fa fa-spin fa-spinner"></i>');
                        },
                        success: function (resp) {
                            if (resp.status !== true) {
                                info_div.html("<i class=\"fa fa-close\"></i>");
                                $.growl.error({
                                    title: "Oops!!!",
                                    message: "Email has already been used"
                                });
                                $('input[name=email]').val('');
                            } else {
                                info_div.html('');
                            }
                        }
                    })
                }
            });
        }

        $('#register_form').on('submit', function () {
            var $this = $(this);
            var prefix = $("input[name=prefix]").val();
            var first_name = $("input[name=first_name]").val();
            var last_name = $("input[name=last_name]").val();
            var email = $("input[name=email]").val();
            var phone = $("input[name=phone]").val();
            var term_condition = $('#term_condition:checked').val();
            var password = $('input[name=password]').val();
            var retype_password = $('input[name=retype_password]').val();
            var btn = $("#submitRegister");


            if (email === '' || phone === '' || password === '' || prefix === '' || first_name === '' || last_name === '') {
                $('.signup-error').html('<strong>Invalid form field, please check required field and try again.</strong>').removeClass('hide');
            } else if (password !== retype_password) {
                $('.signup-error').html('<strong>Password did not match</strong>').removeClass('hide');
            } else if (term_condition !== 'yes' || term_condition === '') {
                $('.signup-error').html('<strong>You need to accept to the terms and condition</strong>').removeClass('hide');
            } else {
                //Everything seem to be fine
                if ($this.parsley('isValid')) {
                    $.ajax({
                        url: '/register',
                        dataType: 'JSON',
                        type: 'POST',
                        data: $this.serialize(),
                        beforeSend: function () {
                            btn.addClass('disabled');
                            btn.val('<i class="fa fa-spin fa-spinner"></i> loading...please wait');
                        },
                        success: function (response) {
                            if (response.status === 0) {
                                $('.signup-error').html('<strong>' + response.desc + '</strong>').removeClass('hide');
                            } else if (response.status === 1) {
                                //Account registration success, notify the user of a successful registration process
                                $('.signup-success').html('<strong>Registration successful. Please wait...</strong>').removeClass('hide');
                                setTimeout(function () {
                                    window.location.href = response.url;
                                }, 1000);
                            } else {
                                $('.signup-error').html('<strong>Unresolved error occurred, please try again later</strong>').removeClass('hide');
                            }
                        },
                        complete: function () {
                            btn.val('Register');
                            btn.removeClass("disabled");
                        }, error: function () {
                            $('.signup-error').html('<strong>Oops! An error occurred, please try again</strong>').removeClass('hide');
                        }
                    });
                }
            }
            return false;
        });

        hideAlert('signup-success', 'signup-error');
    });


    function hideAlert(success, danger) {
        setTimeout(function () {
            $(success).hide().fadeOut('slow');
        }, 5000);
        setTimeout(function () {
            $(danger).hide().fadeOut('slow');
        }, 8000);
    }
});

//Password Reset
jQuery(function () {
    jQuery(function () {
        /* For Login functionality */
        $('#reset_form').on('submit', function () {
            var $this = $(this);
            var email = $("#email").val();
            if (email === '') {
                $('.signin-error').html('<strong>Email field cannot be empty.</strong>').removeClass('hide');
            } else {
                //Everything seem to be fine
                $.ajax({
                    url: '/forget-password',
                    type: 'POST',
                    data: $this.serialize(),
                    beforeSend: function () {
                        $("#resetPassword").addClass('disabled');
                        $('#resetPassword').html('<i class="fa fa-spin fa-spinner"></i> loading...please wait');
                    },
                    success: function (response) {
                        if (response.status === 0) {
                            $('.signin-error').html('<strong>' + response.desc + '</strong>').removeClass('hide');
                        } else if (response.status === 1) {
                            //Account registration success, notify the user of a successful registration process
                            $('.signin-success').html('<strong>Password reset request has been sent to your email.</strong>').removeClass('hide');
                        } else {
                            $('.signin-error').html('<strong>Unresolved error occurred, please try again later</strong>').removeClass('hide');
                        }
                    },
                    complete: function () {
                        $("#resetPassword").removeClass("disabled");
                        $('#resetPassword').html('Reset Password');
                    },
                    error: function (xhrError, xhr) {
                        //console.log(xhrError, xhr);
                        $('.signin-error').html('<strong>Oops! An error occurred, please try again</strong>').removeClass('hide');
                    }
                });
            }
            setTimeout(function () {
                $('.signin-error').addClass('hide').fadeOut('slow');
            }, 5000);
            return false;
        });
    });
});

/******* Begin Facebook Login *********/
/*************************************/
if (document.getElementById("facebookLogin") !== null) {
    document.getElementById("facebookLogin").onclick = function () {
        FB.login(function (response) {
            if (response.authResponse) {
                FB.api('/me?fields=id,name,picture,first_name,last_name,email,gender,locale,timezone,age_range', function (resp) {
                    console.log(resp.picture.data.url);
                    document.getElementById("facebookLogin").value = "Loading..please wait";
                    jQuery(function () {
                        $.ajax({
                            url: '/auth/social-auth/fb',
                            type: 'POST',
                            dataType: 'JSON',
                            data: {
                                social_media_id: resp.id,
                                email: resp.email,
                                gender: resp.gender.toString().toUpperCase(),
                                first_name: resp.first_name,
                                last_name: resp.last_name,
                                timezone: resp.timezone,
                                is_silhouette: resp.picture.data.is_silhouette,
                                avatar_url: resp.picture.data.url
                            },
                            success: function (httpResp) {
                                if (httpResp.status === 1) {
                                    window.location.href = '/';
                                } else {
                                    $.growl.error({
                                        title: "Login not successful, please try again later."
                                    });
                                }
                            }
                        });
                    });
                });
            }
        }, {scope: 'email, public_profile, user_birthday', auth_type: 'rerequest'});
    };
}
window.fbAsyncInit = function () {
    FB.init({
        appId: serverMode == 'dev' ? '755403261261714' : '722442624557778',
        cookie: true,
        xfbml: true,
        version: 'v2.5' // use version 2.2
    });
};


// Load the SDK asynchronously
(function (d, s, id) {
    var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s);
    js.id = id;
    js.src = "//connect.facebook.net/en_US/sdk.js";
    fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));

/******** End Facebook Login *********/


