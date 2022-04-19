/**
 * |
 * | Created by Igbalajobi  Jamiu O.
 * | On 11/10/15 12:59 AM
 * |
 **/

jQuery(function () {
    'use strict';

    $(".chosen-select").chosen();

    //Call the form
    admin_create_ticket();

    //For Admin Creating Support Ticket
    function admin_create_ticket() {
        var form_obj = $(".console-create-ticket"), parsley = form_obj.parsley();
        form_obj.on('submit', function() {
            if (parsley.isValid()) {
                var form_data = new FormData()[0];
                $.ajax({
                    url: '/console/support/create-client-ticket',
                    dataType: 'json',
                    type: 'post',
                    data: form_data,
                    success: function (resp) {
                        if (resp.status === 0) {
                            $('.success').html('<strong>'+resp.desc+'</strong>').removeClass('hide');
                        } else {
                            $('.error').html('<strong>'+resp.desc+'</strong>').removeClass('hide');
                        }
                    },
                    beforeSend: function () {
                        $(".submit-btn").addClass('disabled');
                        $('.submit-btn').html('<i class="fa fa-spin fa-spinner"></i>');
                    }, complete: function () {
                        $(".submit-btn").removeClass("disabled");
                        $('.submit-btn').html('<i class="fa fa-envelope"></i> Submit Ticket');
                    },
                    error: function () {
                        $('.error').html('<strong>Unknown error occurred, please try again later.</strong>').removeClass('hide');
                    }
                });
            } else {
                $('.error').html('<strong>Invalid form input, please check field to continue.</strong>').removeClass('hide');
            }
            setTimeout(function () {
                $('.error').addClass('hide').fadeOut('slow');
                $('.success').addClass('hide').fadeOut('slow');
            }, 7000);
            //return false
        });
    }
});