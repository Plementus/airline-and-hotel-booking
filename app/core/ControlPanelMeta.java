package core;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 07/01/2016 7:46 PM
 * |
 **/
public enum ControlPanelMeta {
    enable_javascript,
    enable_css,
    enable_images,
    enable_cdn,
    enable_payment_gateway,
    default_payment_gateway,
    default_currency,
    usd_conversion_rate,
    enable_chat,
    cache_user_browser,
    is_enable_mobile_view,
    is_enable_web_view,
    is_enable_tablet_view,
    ws_gds_mode, //test or prod
    active_gds, // system should select the default GDS from the available options at the GdsNames.java
    under_maintenance, //this is to either enable the website running or display website under construction.
    flight_terms_and_condition,
    cms_page_layout,
    cms_page_layout_inline_css,
    cms_header_html,
    cms_footer_html,
    cms_head_title,
    cms_head_seo_meta_name,
    cms_head_seo_meta_content,
    cms_page_layout_css,
    cms_page_layout_js,
    cms_logo_data_bank_id,
    cms_logo_alt_text,
    cms_logo_width,
    cms_logo_height,
    bg_img_flight,
    enable_database_backup,
    enable_files_backup,
    user_sign_up_email,
    user_forget_password_email,
    flight_booking_confirmation_email,
    flight_booking_confirmation_sms,
    hotel_booking_confirmation_email,
    hotel_booking_confirmation_sms,
    payment_confirmation_email,
    payment_confirmation_sms,
    b2b_flight_invoice_template,
    b2c_flight_invoice_template,
    b2b_hotel_invoice_template,
    b2c_hotel_invoice_template,
}
