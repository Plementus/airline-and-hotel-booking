'use strict';
/*! main.js - v0.1.1
 * http://admindesigns.com/
 * Copyright (c) 2013 Admin Designs;*/

/* Demo theme functions. Required for
 * Settings Pane and misc functions */
var Demo = function() {

   var runDemoCache = function() {

      $(window).load(function() {

         // List of all available JS files. We're going to attempt to
         // cache them all after the first page has finished loading.
         // This is for DEMO purposes ONLY
         var scripts = {

            // HIGH PRIORITY - Images
            image1: 'img/stock/splash/1.jpg',
            image2: 'img/stock/splash/2.jpg',
            image3: 'img/stock/splash/3.jpg',
            image4: 'img/stock/splash/4.jpg',

            // HIGH PRIORITY
            gmap: 'vendor/plugins/map/gmaps.min.js',
            jquerymap: 'vendor/plugins/gmap/jquery.ui.map.js',
            mixitup: 'vendor/plugins/mixitup/jquery.mixitup.min.js',
            mpopup: 'vendor/plugins/mfpopup/jquery.magnific-popup.min.js',
            chosen: 'vendor/plugins/chosen/chosen.jquery.js',
            moment: 'vendor/plugins/daterange/moment.min.js',
            globalize: 'vendor/plugins/globalize/globalize.js',

            // FORM PICKERS
            cpicker: 'vendor/plugins/colorpicker/bootstrap-colorpicker.js',
            timepicker: 'vendor/plugins/timepicker/bootstrap-timepicker.min.js',
            datepicker: 'vendor/plugins/datepicker/bootstrap-datepicker.js',
            daterange: 'vendor/plugins/daterange/daterangepicker.js',

            // FORMS
            validate: 'vendor/plugins/validate/jquery.validate.js',
            masked: 'vendor/plugins/jquerymask/jquery.maskedinput.min.js',

            // FORMS TOOLS
            holder: 'vendor/bootstrap/plugins/holder/holder.js',
            tagmanager: 'vendor/plugins/tags/tagmanager.js',
            gritter: 'vendor/plugins/gritter/jquery.gritter.min.js',
            ladda: 'vendor/plugins/ladda/ladda.min.js',
            paginator: 'vendor/bootstrap/plugins/paginator/bootstrap-paginator.js',
            knob: 'vendor/plugins/jquerydial/jquery.knob.js',
            rangeslider: 'vendor/plugins/rangeslider/jQAllRangeSliders.min.js',

            // MED PRIORITY - Large File sizes
            charts: 'js/pages/charts.js',
            ckeditorCDN: 'http://cdnjs.cloudflare.com/ajax/libs/ckeditor/4.0.1/ckeditor.js',
            xedit: 'vendor/editors/xeditable/js/bootstrap-editable.js',
            summernote: 'vendor/editors/summernote/summernote.js',
            countdown: 'vendor/plugins/countdown/jquery.countdown.js',
            jcrop: 'vendor/plugins/imagecrop/jquery.Jcrop.min.js',
            imagezoom: 'vendor/plugins/imagezoom/jquery.elevatezoom.min.js',
            sketchpad: 'vendor/plugins/notepad/wPaint.min.js',
            fileupload: 'vendor/bootstrap/plugins/fileupload/fileupload.js',
         };

         var cacheCheck = function(o) {
               $.each(o, function(i, p) {

                  if (localStorage.getItem(i) !== 'cached') {
                     $.ajax({
                        url: p,
                        cache: true,
                        success: function(data) {
                           localStorage.setItem(i, 'cached');
                           console.log(localStorage.getItem(i));
                        }
                     });

                  } else {}
               });
            }
            // DISABLED BY DEFAULT
            // cacheCheck(scripts);
      });
   }

   return {
      init: function() {
         runDemoCache();
      }
   }
}();

