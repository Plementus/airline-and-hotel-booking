/**
 *
 * Created by Igbalajobi Jamiu on 14/02/2016.
 */
jQuery(function () {
    $("#templateForm").validate({
        ignore: "",
        rules: {
            something: {
                number: true,
                min: 1,
                required: true
            }
        }
    });

    var body_dom = $("#body_html"), sidebar_dom = $("#sidebar_dom");
    $.fn.add_content_btn = function (attr_name) {
        var hasContainerName = attr_name.toString().replace('__col', '__hasContainer');
        return '<a href="#" class="add-container" data-container="' + attr_name + '">' +
            '<i class="fa fa-plus"></i> Add Container</a>' +
            '<input type="hidden" name="' + hasContainerName + '" />' +
            '<input type="hidden" required="required" name="' + attr_name + '"/>';
    };

    $.fn.selectContainerItem = function (obj) {
        var item_name = obj.data('container');
        var item_hasContainer = obj.data('container').toString().replace('__col', '__hasContainer');
        if (item_name.indexOf("sidebar_content_") > -1) {
            item_hasContainer = obj.data('container').toString().replace('sidebar_content', 'sidebar_hasContainer');
        }
        $("#add-btn").one('click', function () {
            var sel_cont = $("#select_container_id"),
                item_sel = sel_cont.val(),
                selected_name = $("#select_container_id option:selected").text(),
                is_in_container = $("input[name=in_container]").is(":checked") === true ? 'Yes' : 'No';
            $('.add-container-div').modal('hide');
            $("input[name=" + item_name + "]").attr('value', item_sel);
            $("input[name=" + item_hasContainer + "]").attr('value', is_in_container);
            obj.remove();
            var html_output = '<input type="hidden" name="' + item_name + '" value="' + item_sel + '" />' +
                '<input type="hidden" name="' + item_hasContainer + '" value="' + is_in_container + '" />';
            html_output += '<a href="#" class="text-primary edit-container" data-container="' + item_name + '"><i class="fa fa-edit"></i> Edit Container' + '</a><br />';
            html_output += '<h4>' + selected_name + '</h4>Lorem ipsum dolor sit amet, probo habeo delectus qui no, volumus perpetua vix ex, errem tempor commodo pri in. Mei te scripta disputando. Dolorum placerat ne vis, pro et aliquip corpora, porro audiam nec ex. Dicat accusam ius et. Ut dolorem fastidii nec.';
            $("." + item_name).html(html_output);
            $('.edit-container').on('click', function () {
                var editObj = $(this);
                $('.add-container-div').modal({
                    'backdrop': true
                });
                $(this).selectContainerItem(obj);
                return false;
            });
        });
    };

    $('select[name=sidebar_perc_ratio]').on('change', function () {
        var $this = $(this), selected_perc = $this.val();
        var body_class = "col-md-12";
        var sidebar_class = "pull-right";
        $this.attr('required', 'required');
        switch (selected_perc) {
            case "20__left":
                body_class = "col-md-9 pull-right";
                sidebar_class = "col-md-3";
                break;
            case "30__left":
                body_class = "col-md-8 pull-right";
                sidebar_class = "col-md-4";
                break;
            case "40__left":
                body_class = "col-md-7 pull-right";
                sidebar_class = "col-md-5";
                break;
            case "20__right":
                body_class = "col-md-9";
                sidebar_class = "col-md-3 pull-right";
                break;
            case "30__right":
                body_class = "col-md-8";
                sidebar_class = "col-md-4 pull-right";
                break;
            case "40__right":
                body_class = "col-md-7";
                sidebar_class = "col-md-5 pull-right";
                break;
            default:
                sidebar_dom.hide();
                sidebar_dom.removeAttr('required');
                break;
        }
        body_dom.attr('class', body_class);
        sidebar_dom.attr('class', sidebar_class);
        if (selected_perc !== "0") {
            sidebar_dom.show();
        }
    });

    $.fn.applyBodyFormatting = function () {
        $('.body_rows').on('change', function () {
            var $this = $(this), selected_val = $this.val(), data_id = $this.attr('data_id');
            var output_html = "";
            var sub_str = selected_val.substring(1, selected_val.length);
            var inputColHidden = $('input[name=inner_col' + data_id + ']');
            switch (selected_val) {
                case '1__col' + data_id + '__100':
                default:
                    inputColHidden.attr('value', "1");
                    output_html = $(this).add_content_btn("1" + sub_str) + " <h1 class=\"text-center\" >Body</h1>";
                    break;
                case '2__col' + data_id + '__50__50':
                    inputColHidden.attr('value', "2");
                    output_html = "<div class=\"col-md-6\">" + $(this).add_content_btn("1" + sub_str) + " <br /><span class=" + ("1" + sub_str) + "><h1 class=\"text-center\" >Body</h1></span></div>";
                    output_html += "<div class=\"col-md-6\">" + $(this).add_content_btn("2" + sub_str) + " <br /><span class=" + ("2" + sub_str) + "><h1 class=\"text-center\" >Body</h1></span></div>";
                    break;
                case '2__col' + data_id + '__66__33':
                    inputColHidden.attr('value', "2");
                    output_html = "<div class=\"col-md-7\">" + $(this).add_content_btn("1" + sub_str) + " <br /><span class=" + ("1" + sub_str) + "><h1 class=\"text-center\" >Body</h1></span></div>";
                    output_html += "<div class=\"col-md-5\">" + $(this).add_content_btn("2" + sub_str) + " <br /><span class=" + ("2" + sub_str) + "><h1 class=\"text-center\" >Body</h1></span></div>";
                    break;
                case '2__col' + data_id + '__33__66':
                    inputColHidden.attr('value', "2");
                    output_html = "<div class=\"col-md-5\">" + $(this).add_content_btn("1" + sub_str) + " <br /><span class=" + ("1" + sub_str) + "><h1 class=\"text-center\" >Body</h1></span></div>";
                    output_html += "<div class=\"col-md-7\">" + $(this).add_content_btn("2" + sub_str) + " <br /><span class=" + ("2" + sub_str) + "><h1 class=\"text-center\" ></h1></span></div>";
                    break;
                case '2__col' + data_id + '__75__25':
                    inputColHidden.attr('value', "2");
                    output_html = "<div class=\"col-md-8\">" + $(this).add_content_btn("1" + sub_str) + " <br /><span class=" + ("1" + sub_str) + "><h1 class=\"text-center\" >Body</h1></span></div>";
                    output_html += "<div class=\"col-md-4\">" + $(this).add_content_btn("2" + sub_str) + " <br /><span class=" + ("2" + sub_str) + "><h1 class=\"text-center\" >Body</h1></span></div>";
                    break;
                case '2__col' + data_id + '__25__75':
                    inputColHidden.attr('value', "2");
                    output_html = "<div class=\"col-md-4\">" + $(this).add_content_btn("1" + sub_str) + " <br /><span class=" + ("1" + sub_str) + "><h1 class=\"text-center\" >Body</h1></span></div>";
                    output_html += "<div class=\"col-md-8\">" + $(this).add_content_btn("2" + sub_str) + " <br /><span class=" + ("2" + sub_str) + "><h1 class=\"text-center\" >Body</h1></span></div>";
                    break;
                case '3__col' + data_id + '__33__33__33':
                    inputColHidden.attr('value', "3");
                    output_html = "<div class=\"col-md-4\">" + $(this).add_content_btn("1" + sub_str) + " <br /><span class=" + ("1" + sub_str) + "><h1 class=\"text-center\" >Body</h1></span></div>";
                    output_html += "<div class=\"col-md-4\">" + $(this).add_content_btn("2" + sub_str) + " <br /><span class=" + ("2" + sub_str) + "><h1 class=\"text-center\" >Body</h1></span></div>";
                    output_html += "<div class=\"col-md-4\">" + $(this).add_content_btn("3" + sub_str) + " <br /><span class=" + ("3" + sub_str) + "><h1 class=\"text-center\" >Body</h1></span></div>";
                    break;
                case '4__col' + data_id + '__25__25__25__25':
                    inputColHidden.attr('value', "4");
                    output_html = "<div class=\"col-md-3\">" + $(this).add_content_btn("1" + sub_str) + " <br /><span class=" + ("1" + sub_str) + "><h1 class=\"text-center\" >Body</h1></span></div>";
                    output_html += "<div class=\"col-md-3\">" + $(this).add_content_btn("2" + sub_str) + " <br /><span class=" + ("2" + sub_str) + "><h1 class=\"text-center\" >Body</h1></span></div>";
                    output_html += "<div class=\"col-md-3\">" + $(this).add_content_btn("3" + sub_str) + " <br /><span class=" + ("3" + sub_str) + "><h1 class=\"text-center\" >Body</h1></span></div>";
                    output_html += "<div class=\"col-md-3\">" + $(this).add_content_btn("4" + sub_str) + " <br /><span class=" + ("4" + sub_str) + "><h1 class=\"text-center\" >Body</h1></span></div>";
                    break;
            }
            output_html += "<div class=\"clearfix\"></div>"
            $('.1__col' + data_id + '__100').html(output_html);
            $('.add-container').on('click', function () {
                $('.add-container-div').modal({
                    'backdrop': true
                });
                $(this).selectContainerItem($(this));
                return false;
            });
        });
    };
    $(this).applyBodyFormatting();

    $('input[name=header]').on('change', function () {
        var isChecked = $(this).is(':checked');
        if (isChecked === false) {
            $("#header_dom").hide();
        } else {
            $("#header_dom").show();
        }
    });

    $('input[name=footer]').on('change', function () {
        var isChecked = $(this).is(':checked');
        if (isChecked === false) {
            $("#footer_dom").hide();
        } else {
            $("#footer_dom").show();
        }
    });

    $('.add-container').on('click', function () {
        var $_th = $(this);
        $('.add-container-div').modal({'backdrop': true});
        $(this).selectContainerItem($_th, $_th.data('d_id'));
    });

    $('.delete-row').on('click', function () {
        var index = parseInt($(this).data('row'));
        var body_row_count = parseInt($('input[name=num_body_rows]').attr('value'));
        body_row_count = body_row_count - 1;
        $('input[name=num_body_rows]').attr('value', body_row_count);
        $(".1__col" + index + '__100').remove('');
        $('input[name=inner_col' + index + ']').remove('');
        $(this).closest('dt').remove();
        var inp = $('#body_rows' + index);
        inp.remove();
        inp.prev().remove();
        return false;
    });


    $(".add-row").on('click', function () {
        var more_body_rows = $("#body_rows1_field");
        $('input[name=num_body_rows]').attr('value', parseInt($('input[name=num_body_rows]').attr('value')) + 1);
        var body_row_count = $('input[name=num_body_rows]').attr('value');
        var select_field_html = '<dt><label for="body_rows' + body_row_count + '"><a class="text-danger delete-row" data-row="' + body_row_count + '" class="text-danger"><i class="fa fa-minus-circle"></i></a>' + ' Body Rows ' + body_row_count + '</label></dt>';
        select_field_html += '<dd><select id="body_rows' + body_row_count + '" name="body_rows' + body_row_count + '" class="form-control body_rows" data_id="' + body_row_count + '" required="required" aria-required="true">';
        select_field_html += '<option value="1__col' + body_row_count + '__100">one column 100 percent</option>';
        select_field_html += '<option value="2__col' + body_row_count + '__50__50">two column 50 50 percent</option>';
        //select_field_html += '<option value="2__col' + body_row_count + '__66__33">two column 66 33 percent</option>';
        //select_field_html += '<option value="2__col' + body_row_count + '__33__66">two column 33 66 percent</option>';
        //select_field_html += '<option value="2__col' + body_row_count + '__75__25">two column 75 25 percent</option>';
        //select_field_html += '<option value="2__col' + body_row_count + '__25__75">two column 25 75 percent</option>';
        select_field_html += '<option value="3__col' + body_row_count + '__33__33__33">three column 33 33 33 percent</option>';
        select_field_html += '<option value="4__col' + body_row_count + '__25__25__25__25">four column 25 25 25 25 percent</option>';
        select_field_html += '</select></dd>';
        $(select_field_html).appendTo(more_body_rows);
        var inner_col = '<input type="hidden" name="inner_col' + body_row_count + '" value="1" required="required" />';
        $(inner_col).appendTo($(".col"));
        $('.delete-row').on('click', function () {
            var index = parseInt($(this).data('row'));
            body_row_count -= 1;
            $('input[name=num_body_rows]').attr('value', body_row_count);
            $(".1__col" + index + '__100').remove('');
            $('input[name=inner_col' + index + ']').remove('');
            $(this).closest('dt').remove();
            var inp = $('#body_rows' + index);
            inp.remove();
            inp.prev().remove();
        });

        /**
         * HTML Body presentation
         */
        var body_html = '<div class="1__col' + body_row_count + '__100">';
        body_html += '<a href="#" class="add-container" data-d_id="' + body_row_count + '" data-container="1__col' + body_row_count + '__100"><i class="fa fa-plus"></i> Add Container</a>';
        body_html += '<input type="hidden" name="1__col' + body_row_count + '__100" required="required" />';
        body_html += '<input type="hidden" name="1__hasContainer' + body_row_count + '__100" />';
        body_html += '<h1 class="text-center" >Body</h1>';
        body_html += '</div>';
        $(body_html).appendTo('#body_html');
        $('.add-container').on('click', function () {
            var $_th = $(this);
            $('.add-container-div').modal({'backdrop': true});
            $(this).selectContainerItem($_th, body_row_count);
            return false;
        });
        $(this).applyBodyFormatting();
        return false;
    });

    $(".add-sidebar-container").on('click', function () {
        var num_of_sidebar = parseInt($('input[name=num_of_sidebar]').attr('value'));
        num_of_sidebar += 1;
        $('input[name=num_of_sidebar]').attr('value', num_of_sidebar);
        var more_sidebar = '<section style="border-bottom: 1px solid #9AB3CE" class="side_dd' + num_of_sidebar + '"><a href="#" class="add-container" data-d_id="' + num_of_sidebar + '" data-container="sidebar_content_' + num_of_sidebar + '"><i class="fa fa-plus"></i>Add Container</a>';
        more_sidebar += '<input type="hidden" name="sidebar_content_' + num_of_sidebar + '" />';
        more_sidebar += '<input type="hidden" name="sidebar_hasContainer_' + num_of_sidebar + '" />';
        more_sidebar += '<span class="sidebar_content_' + num_of_sidebar + '" style="border-bottom: 1px solid">';
        more_sidebar += '<h1 class="text-center">Sidebar ' + num_of_sidebar + '</h1>';
        more_sidebar += '</span></section>';
        $(more_sidebar).appendTo('#sidebar_dom');
        $('.add-container').on('click', function () {
            $('.add-container-div').modal({
                'backdrop': true
            });
            $(this).selectContainerItem($(this));
            return false;
        });

        var remove_sidebar = '<a href="#" class="text-danger del-sidebar" data-rowside="' + num_of_sidebar + '" class="text-danger"><br /><i class="fa fa-minus-circle"></i> Remove Sidebar ' + num_of_sidebar + '</a>';
        $(remove_sidebar).appendTo('.sidebar-mgr');
        $('.del-sidebar').on('click', function () {
            $(this).removeSidebarContent($(this));
            return false;
        });
        return false;
    });

    $.fn.removeSidebarContent = function (obj) {
        var r = parseInt($('input[name=num_of_sidebar]').attr('value'));
        r = r - 1;
        var index = obj.data('rowside');
        $('.side_dd' + index).remove();
        $('input[name=num_of_sidebar]').attr('value', r);
        obj.remove();
    };
});