/**
 * Created by Ibrahim Olanrewaju on 4/2/2016.
 */

package services.sabre.utils

import java.time.ZonedDateTime

case class ZonedDateTimeWrapper(dateTime: String, gmtOffset: String) {
  def value = ZonedDateTime.parse(s"$dateTime${parseGMTOffset(gmtOffset)}")

  private def parseGMTOffset(gmtOffset: String) = {
    val ZERO = "0"
    def parse = gmtOffset.replace(".",":").concat(ZERO).trim
    if(gmtOffset.startsWith("-")) parse.replaceFirst("-", s"-$ZERO") else s"+$ZERO$parse"
  }
}