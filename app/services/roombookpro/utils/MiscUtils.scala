/**
 * Created by Babatunde on 3/22/2016.
 */

package services.roombookpro.utils

import java.io.{File, FileWriter, PrintWriter}
import java.util.{List => JavaList}

import play.api.Play
import play.api.Play.current

import services.roombookpro.dto.City
import services.roombookpro.messages.CitiesRequest

import scala.collection.mutable.ListBuffer
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.io.Source
import scala.xml.NodeSeq
import scala.collection.JavaConversions._

object MiscUtils {
  val tmpDir = s"${Play.application.path.getAbsolutePath}" + "/tmp"

  def convertToCSV = Future {
    val bufferedSource = Source.fromFile(s"$tmpDir\\roombookpro_countries.csv")
    for (line <- bufferedSource.getLines()) {
      val cols: Array[String] = line.split(",").map(_.trim)
      val countryCode = cols(1)
      val cities = scala.xml.XML.loadString(RoomBookProXMLRequests.citiesSoapMessage(new CitiesRequest(countryCode)))
      val returnNode = cities \ "return"
      val citiesNodeSeq: NodeSeq = returnNode \ "Soap_Model_SOAP_Location_City"
      val fileDir = s"$tmpDir\\$countryCode.csv"
      val printWriter = new PrintWriter(new FileWriter(fileDir))
      citiesNodeSeq.foreach { city =>
        val cityID = city \ "id"
        val cityCode = city \ "code"
        val cityName = city \ "name"
        val stateCode = city \ "state"
        val countryCode = city \ "country"
        printWriter.write(s"${cityID.text},${cityCode.text},${cityName.text},${stateCode.text},${countryCode.text}\n")
      }
      printWriter.close()
    }
  }

  var counter = 0
  def csvToCities(directory: String): JavaList[City] = getFilesInDirectory(directory).map { file: File =>
    Source.fromFile(file).getLines().mkString("\n")}.filter { content =>
      content.nonEmpty }.flatMap { fileContent =>
      counter = counter + 1
      println(s"file[$counter] - processed...")
      fileContent.split("\n").map { line =>
        val values = line.split(",")
        new City(values(0).toInt, values(1), values(2), values(3), values(4))
      }.to[ListBuffer]
    }


  private def getFilesInDirectory(directory: String) = {
    val dir = new File(directory)
    if (dir.exists && dir.isDirectory) {
      dir.listFiles.filter(_.isFile).toList
    } else {List[File]()}
  }
}