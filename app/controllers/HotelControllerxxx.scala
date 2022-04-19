package controllers

import javax.inject.Inject

import controllers.abstracts.BaseController
import play.api.mvc.Action
import play.api.mvc.Controller

/**
 * |
 * | Created by Ibrahim Olanrewaju..
 * | On 28/02/2016 7:52 PM
 * |
 **/
@Inject class HotelControllerxxx extends Controller {
  def index = Action { implicit request =>
    Ok("welcome");
  }
}
