/*
 *
 *  * [BRAKET] CONFIDENTIAL
 *  * __________________
 *  *
 *  *  4/5/16 10:34 AM  [BRAKKET] Solutions
 *  *  All Rights Reserved.
 *  *
 *  * NOTICE:  All information contained herein is, and remains
 *  * the property of Brakket Solutions and its suppliers,
 *  * if any.  The intellectual and technical concepts contained
 *  * herein are proprietary to Brakket Solutions
 *  * and its suppliers and may be covered by Nigeria. and Foreign Patents,
 *  * patents in process, and are protected by trade secret or copyright law.
 *  * Dissemination of this information or reproduction of this material
 *  * is strictly forbidden unless prior written permission is obtained
 *  * from Brakket Solutions.
 *
 */

package controllers

import play.api.mvc.{AnyContent, Action, Controller}
import play.api.Play.current

/**
  * Created by 
  * Ibrahim Olanrewaju. on 05/04/2016 10:34 AM.
  */
object StaticAssets extends Controller {

  // drop the version
  def at(path: String, file: String): Action[AnyContent] = {
    Assets.at(path, file)
  }

  // returns a path that has a version if the assets.version config is set
//  def url(file: String): String = {
//    val maybeAssetsVersion = current.configuration.getString("assets.version")
//    maybeAssetsVersion.fold(routes.Assets.at(file).url)(routes.StaticAssets.at(_, file).url)
//  }

}