/**
 * Created by Ibrahim Olanrewaju on 4/1/2016.
 */

package services.sabre.utils

import java.time.Duration

object TimeZoneUtils {
  def subtractZonedDateTimes(departureZonedDateTime: ZonedDateTimeWrapper, arrivalZonedDateTime: ZonedDateTimeWrapper): String = {
    Duration.between(arrivalZonedDateTime.value, departureZonedDateTime.value).toString.substring(3).replace("-"," ").trim
  }
}

  /*
if((!Strings.isNullOrEmpty(getDepartureTimeZone())) && (!Strings.isNullOrEmpty(getArrivalTimeZone()))) {
if((!Strings.isNullOrEmpty(getDepartureDateTime())) && (!Strings.isNullOrEmpty(getArrivalDateTime()))) {
duration = TimeZoneUtils.subtractZonedDateTimes(ZonedDateTimeWrapper.apply(getDepartureDateTime(), getDepartureTimeZone()),
ZonedDateTimeWrapper.apply(getArrivalDateTime(), getArrivalTimeZone()));
}
}*/