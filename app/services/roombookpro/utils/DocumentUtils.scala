/**
 * Created by Babatunde on 2/10/2016.
 */
package services.roombookpro.utils

import java.util.{ArrayList => JavaArrayList}

import com.sun.org.apache.xalan.internal.xsltc.trax.DOM2SAX
import core.hotels.HotelDataPresentationInterface
import org.w3c.dom.{Node => w3cNode}
import services.roombookpro.dto.{CancellationPolicy => RoomBookCancellationPolicy, _}
import services.roombookpro.messages._

import scala.xml.parsing.NoBindingFactoryAdapter
import scala.xml.{Node, NodeSeq}

object DocumentUtils {

  def hotelSearchResponses(dom: w3cNode): java.util.ArrayList[HotelDataPresentationInterface] = {
    val hotelSearchResponses = new JavaArrayList[HotelDataPresentationInterface]()
    val returnNode = returnNodeSeq(dom)
    val hotelNodeSeq: NodeSeq = returnNode \ "Soap_Model_SOAP_Hotel_Hotel"

    hotelNodeSeq.foreach { node =>
      val hotelSearch = new HotelSearchResponse()
      val images = new JavaArrayList[Image]()
      val facilities = new JavaArrayList[Facility]()
      val hotel = toHotel(node)
      val lowestPrice =  toPrice(node \ "lowestPrice")
      val totalPrice = toPrice(node \ "totalPrice")
      val discount = toPrice(node \ "discount")
      val imagesNode: NodeSeq = node \ "images" \ "Soap_Model_SOAP_Hotel_Image"
      val facilitiesNode = node \ "facilities" \ "Soap_Model_SOAP_Hotel_Facility"

      imagesNode.foreach { node => images.add(toImage(node))}
      facilitiesNode.foreach { node => facilities.add(toFacility(node))}

      hotelSearch.setHotel(hotel)
      hotelSearch.setLowestPrice(lowestPrice)
      hotelSearch.setTotalPrice(totalPrice)
      hotelSearch.setDiscount(discount)
      hotelSearch.setImages(images)
      hotelSearch.setFacilities(facilities)

      hotelSearchResponses.add(hotelSearch)
    }
    hotelSearchResponses
  }

  def roomsSearchResponse(dom: w3cNode) = {
    val roomsSearchResponse = new RoomsSearchResponse()
    val roomsGroupings = new JavaArrayList[RoomsGrouping]()
    val images = new JavaArrayList[Image]()
    val facilities = new JavaArrayList[Facility]()

    val returnNode = returnNodeSeq(dom)
    val hotel = toHotel(returnNode)
    val roomsGroupingNodeSeq: NodeSeq = returnNode \ "roomsGrouping" \ "Soap_Model_SOAP_Hotel_RoomsGrouping"
    val imagesNodeSeq: NodeSeq = returnNode \ "images" \ "Soap_Model_SOAP_Hotel_Image"
    val facilityNodeSeq: NodeSeq = returnNode \ "facilities" \ "Soap_Model_SOAP_Hotel_Facility"

    roomsGroupingNodeSeq.foreach {node => roomsGroupings.add(toRoomsGrouping(node))}
    imagesNodeSeq.foreach {node => images.add(toImage(node))}
    facilityNodeSeq.foreach {node =>  facilities.add(toFacility(node))}

    roomsSearchResponse.setHotel(hotel)
    roomsSearchResponse.setRoomGroupings(roomsGroupings)
    roomsSearchResponse.setImages(images)
    roomsSearchResponse.setFacilities(facilities)
    roomsSearchResponse
  }

  def cancellationPolicyResponse(dom: w3cNode) = {
    val cancellationPolicies = new JavaArrayList[RoomBookCancellationPolicy]()
    val cancellationPolicyNodeSeq = returnNodeSeq(dom) \ "Soap_Model_SOAP_Hotel_CancellationPolicy"

    cancellationPolicyNodeSeq.foreach {node => cancellationPolicies.add(toCancellationPolicy(node))}
    new CancellationPolicyResponse(cancellationPolicies)
  }

  def bookingResponse(dom: w3cNode) = {
    val bookingResponse = new BookingResponse()
    val returnNode = returnNodeSeq(dom)
    val bookingRef = returnNode \ "bookingRef"
    val agentRef = returnNode \ "agentRef"
    val status = returnNode \ "status"
    val supplierRef = returnNode \ "supplierRef"
    val hotelConfirmationRef = returnNode \ "hotelConfirmationRef"
    bookingResponse.setRef(bookingRef.text)
    bookingResponse.setAgentRef(agentRef.text)
    bookingResponse.setStatus(status.text)
    bookingResponse.setSupplierRef(supplierRef.text)
    bookingResponse.setHotelConfirmationRef(hotelConfirmationRef.text)
    bookingResponse
  }

  def cancelBookingResponse(dom: w3cNode) = {
    val cancellation = toCancellation( returnNodeSeq(dom))
    new CancellationResponse(cancellation)
  }

  def detailsResponse(dom: w3cNode) = {
    val detailsResponse = new DetailsResponse()
    val pricings = new JavaArrayList[Pricing]()
    val returnNode = returnNodeSeq(dom)
    val bookingRefNode = returnNode \ "bookingRef"
    val agentRefNode = returnNode \ "agentRef"
    val supplierRefNode = returnNode \ "supplierRef"
    val hotelConfirmationRefNode = returnNode \ "hotelConfirmationRef"
    val agentNameNode = returnNode \ "agentName"
    val agentPhoneNode = returnNode \ "agentPhone"
    val agentRemarkNode = returnNode \ "agentRemark"
    val statusNode = returnNode \ "status"
    val bookingDateNode = returnNode \ "bookingDt"
    val checkInNode = returnNode \ "checkIn"
    val checkOutNode = returnNode \ "checkOut"
    val cityNode = returnNode \ "city"
    val stateNode = returnNode \ "state"
    val countryNode = returnNode \ "country"
    val hotelDetails = toHotelDetails(returnNode \ "hotel")

    detailsResponse.setBookingRef(bookingRefNode.text)
    detailsResponse.setAgentRef(agentRefNode.text)
    detailsResponse.setSupplierRef(supplierRefNode.text)
    detailsResponse.setHotelConfirmationRef(hotelConfirmationRefNode.text)
    detailsResponse.setAgentName(agentNameNode.text)
    detailsResponse.setAgentRemark(agentRemarkNode.text)
    detailsResponse.setStatus(statusNode.text)
    detailsResponse.setAgentPhone(agentPhoneNode.text)
    detailsResponse.setBookingDate(bookingDateNode.text)
    detailsResponse.setCheckIn(checkInNode.text)
    detailsResponse.setCheckOut(checkOutNode.text)
    detailsResponse.setCity(cityNode.text)
    detailsResponse.setState(stateNode.text)
    detailsResponse.setCountry(countryNode.text)
    detailsResponse.setHotel(hotelDetails)
    if((returnNode \ "pricings").nonEmpty) {
      val pricingsNode = returnNode \ "pricings" \ "Soap_Model_SOAP_Details_Pricing"
      pricingsNode.foreach {node => pricings.add(toPricing(node))}
      detailsResponse.setPricings(pricings)
    }
    detailsResponse
  }

  def citiesResponse(dom: w3cNode) = {
    val cities = new JavaArrayList[City]()
    val citiesNodeSeq = returnNodeSeq(dom) \ "Soap_Model_SOAP_Location_City"
    citiesNodeSeq.foreach {node => cities.add(toCity(node))}
    new CitiesResponse(cities)
  }

  private def toCity(node: NodeSeq) = {
    val city = new City()
    val id = (node \ "id").text
    val code = (node \ "code").text
    val name = (node \ "name").text
    val country = (node \ "country").text

    if((node \ "state").nonEmpty)
      city.setState((node \ "state").text)

    city.setId(Integer.parseInt(id))
    city.setCode(code)
    city.setName(name)
    city.setCountry(country)
    city
  }

  private def toPricing(node: NodeSeq) = {
    val pricing = new Pricing()
    val price = toPrice(node \ "price")
    val componentNode = node \ "component"
    pricing.setPrice(price)
    pricing.setComponent(componentNode.text)
    pricing
  }

  private def toHotelDetails(node: NodeSeq) = {
    val hotelDetails = new HotelDetails()
    val images = new JavaArrayList[Image]()
    val facilities = new JavaArrayList[Facility]()
    val hotel = toHotel(node)
    val imagesNode = node \ "images" \ "Soap_Model_SOAP_Hotel_Image"
    val facilitiesNode = node \ "facilities" \ "Soap_Model_SOAP_Hotel_Facility"
    val room1 = toRoomDetails(node \ "room1")
    val room2 = toRoomDetails(node \ "room2")
    val room3 = toRoomDetails(node \ "room3")
    val room4 = toRoomDetails(node \ "room4")

    imagesNode.foreach {node => images.add(toImage(node))}
    facilitiesNode.foreach {node => facilities.add(toFacility(node))}
    hotelDetails.setHotel(hotel)
    hotelDetails.setImages(images)
    hotelDetails.setFacilities(facilities)
    hotelDetails.setRoom1(room1)
    hotelDetails.setRoom2(room2)
    hotelDetails.setRoom3(room3)
    hotelDetails.setRoom4(room4)
    hotelDetails
  }

  private def toRoomDetails(node: NodeSeq) = {
    val roomDetails = new RoomDetails()
    val guests = new JavaArrayList[Guest]()
    val cancellationPolicies = new JavaArrayList[RoomBookCancellationPolicy]()
    val room = toRoom(node)
    val supplierRefNode = node \ "supplierRef"
    val hotelConfirmationRefNode = node \ "hotelConfirmationRef"
    val guestsNode = node \ "guests" \ "Soap_Model_SOAP_Details_Guest"
    val cancellationPoliciesNode = node \ "cancellationPolicies" \ "Soap_Model_SOAP_Hotel_CancellationPolicy"

    guestsNode.foreach {node => guests.add(toGuest(node))}
    cancellationPoliciesNode.foreach {node => cancellationPolicies.add(toCancellationPolicy(node))}

    roomDetails.setRoom(room)
    roomDetails.setSupplierRef(supplierRefNode.text)
    roomDetails.setHotelConfirmationRef(hotelConfirmationRefNode.text)
    roomDetails.setGuests(guests)
    roomDetails.setCancellationPolicies(cancellationPolicies)
    roomDetails
  }

  private def toGuest(node: NodeSeq) = {
    val guest = new Guest()
    val titleNode = node \ "name"
    val firstNameNode = node \ "firstName"
    val lastNameNode = node \ "lastName"
    val dobNode = node \"dob"
    val emailNode = node \ "email"
    val phoneNode = node \ "phone"
    val addressNode = node \"address"
    val address2Node = node \ "address2"
    val zipCodeNode = node \ "zipCode"
    val cityNode = node \ "city"
    val passportNumberNode = node \ "passportNo"
    val leadNode = node \ "lead"

    guest.setTitle(titleNode.text)
    guest.setFirstName(firstNameNode.text)
    guest.setLastName(lastNameNode.text)
    guest.setDob(dobNode.text)
    guest.setEmail(emailNode.text)
    guest.setPhone(phoneNode.text)
    guest.setAddress(addressNode.text)
    guest.setAddress(address2Node.text)
    guest.setZipCode(zipCodeNode.text)
    guest.setCity(cityNode.text)
    guest.setPassportNumber(passportNumberNode.text)
    guest.setLead(leadNode.text.toBoolean)
    guest
  }

  private def toCancellation(node: NodeSeq) = {
    val cancellationRef = node \ "cancellationRef"
    val agentRef = node \ "agentRef"
    val cancellationDate = node \ "cancellationDt"
    val status = node \ "status"
    val chargeValue = node \ "charge" \ "value"
    val chargeCurrency = node \ "charge" \ "currency"
    val charge = new Price(chargeValue.text.toDouble, chargeCurrency.text)

    new Cancellation(cancellationRef.text, agentRef.text, cancellationDate.text, status.text, charge)
  }

  private def toCancellationPolicy(node: NodeSeq) = {
    val description = node \ "description"
    val price = toPrice(node \ "price")
    new RoomBookCancellationPolicy(description.text, price)
  }

  private def toHotel(node: NodeSeq) = {
    val searchID = node \ "searchId"
    val hotelID = node \ "id"
    val hotelCode = node \ "code"
    val hotelName = node \ "name"
    val hotelRating = node \ "rating"
    val checkInTime = node \ "checkInTime"
    val checkOutTime = node \ "checkOutTime"
    val allLeadInfo = node \ "allLeadInfo"
    val latitude = node \ "lat"
    val longitude = node \ "lon"
    val location = node \ "location"
    val description = node \ "description"
    val address1 = node \ "address1"
    val address2 = node \ "address2"
    val zipCode = node \ "zipCode"
    val city = node \ "city"

    val hotel = new Hotel()
    if(searchID.nonEmpty) {
      hotel.setSearchID(searchID.text.toInt)
    }
    hotel.setID(hotelID.text.toInt)
    hotel.setCode(hotelCode.text)
    hotel.setHotelName(hotelName.text)
    hotel.setRating(hotelRating.text)
    hotel.setCheckInTime(checkInTime.text)
    hotel.setCheckOutTime(checkOutTime.text)
    if(allLeadInfo.nonEmpty) {
      hotel.setAllLeadInfo(allLeadInfo.text.toBoolean)
    }
    hotel.setLatitude(latitude.text.toDouble)
    hotel.setLongitude(longitude.text.toDouble)
    hotel.setLocation(location.text)
    hotel.setDescription(description.text)
    hotel.setAddress1(address1.text)
    hotel.setAddress2(address2.text)
    hotel.setZipCode(zipCode.text)
    hotel.setCity(city.text)
    hotel
  }

  private def toPrice(node: NodeSeq) = {
    if(node.nonEmpty) {
      val value = node \ "value"
      val currency = node \ "currency"
      new Price(value.text.toDouble, currency.text)
    } else {
      new Price()
    }

  }

   private def toImage(node: NodeSeq) = {
     val url = node \ "url"
     new Image(url.text)
   }

   private def toFacility(node: NodeSeq) = {
     val name = node \ "name"
     new Facility(name.text)
   }

  private def toRoomsGrouping(node: NodeSeq) = {
    val roomsGrouping = new RoomsGrouping()
    val rooms1 = new JavaArrayList[Room]()
    val rooms2 = new JavaArrayList[Room]()
    val rooms3 = new JavaArrayList[Room]()
    val rooms4 = new JavaArrayList[Room]()

    val rooms1NodeSeq = node \ "rooms1" \ "Soap_Model_SOAP_Hotel_Room"
    val rooms2NodeSeq = node \ "rooms2" \ "Soap_Model_SOAP_Hotel_Room"
    val rooms3NodeSeq = node \ "rooms3" \ "Soap_Model_SOAP_Hotel_Room"
    val rooms4NodeSeq = node \ "rooms4" \ "Soap_Model_SOAP_Hotel_Room"

    rooms1NodeSeq.foreach {node => rooms1.add(toRoom(node))}
    rooms2NodeSeq.foreach {node => rooms2.add(toRoom(node))}
    rooms3NodeSeq.foreach {node => rooms3.add(toRoom(node))}
    rooms4NodeSeq.foreach {node => rooms4.add(toRoom(node))}

    roomsGrouping.setRoom1(rooms1)
    roomsGrouping.setRoom2(rooms2)
    roomsGrouping.setRoom3(rooms3)
    roomsGrouping.setRoom4(rooms4)
    roomsGrouping
  }

  private def toRoom(node: NodeSeq) = {
    val room = new Room()
    val inclusions = new JavaArrayList[Inclusion]()
    val id = node \ "id"
    val code = node \ "code"
    val name = node \ "name"
    val smoking = node \ "smoking"
    val bedType = node \ "bedType"
    val description = node \ "description"
    val payType = node \ "payType"
    val price = toPrice(node \ "price")
    val lastCancelDate = node \ "lastCancelDt"
    val inclusionsNode = node \ "inclusions" \ "Soap_Model_SOAP_Hotel_Inclusion"

    inclusionsNode.foreach {inclusion => inclusions.add(toInclusion(inclusion))}
    if(id.nonEmpty) {
      room.setId(id.text.toInt)
    }
    room.setCode(code.text)
    room.setName(name.text)
    if(smoking.nonEmpty) {
      room.setSmoking(smoking.text.toBoolean)
    }
    room.setBedType(bedType.text)
    room.setDescription(description.text)
    room.setPayType(payType.text)
    room.setPrice(price)
    room.setLastCancelDate(lastCancelDate.text)
    room.setInclusions(inclusions)
    room
  }

  private def toInclusion(node: NodeSeq) = {
    val name = node \ "name"
    val mandatory = node \ "mandatory"
    val payAtProperty = node \ "payAtProperty"
    val priceType = node \ "priceType"
    val price = toPrice(node \ "price")
    val inclusion =  new Inclusion()
    inclusion.setName(name.text)
    inclusion.setMandatory(mandatory.text.toBoolean)
    inclusion.setPayAtProperty(payAtProperty.text.toBoolean)
    inclusion.setPriceType(priceType.text)
    inclusion.setPrice(price)
    inclusion
  }

  def returnNodeSeq(dom: w3cNode) = {
    asXml(dom) \\ "return"
  }

  private def asXml(dom: w3cNode): Node = {
    val dom2sax = new DOM2SAX(dom)
    val adapter = new NoBindingFactoryAdapter
    dom2sax.setContentHandler(adapter)
    dom2sax.parse()
    adapter.rootElem
  }
}
