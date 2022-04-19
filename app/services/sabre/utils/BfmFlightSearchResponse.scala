package service.sabre.utils

/**
  * Created by Ibrahim Olanrewaju on 4/27/2016.
  */

import core.gdsbookingengine.{FlightSearchResponse, PricedItineraryWSResponse}

case class BfmFlightSearchResponse(pricedItineraryWSResponses: List[PricedItineraryWSResponse]) extends FlightSearchResponse {
  import scala.collection.JavaConverters._
  override def getPricedItineraryWSResponses = pricedItineraryWSResponses.asJava
}
