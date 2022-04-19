package core

import java.util.{List => JavaList, Map => JavaMap}
import models.{AppFormField, FormFieldAttrValidations, FormFieldTypes, FormFields}

import scala.collection.JavaConversions._
import play.twirl.api.Html

/**
  * Created by Ibrahim Olanrewaju on 3/15/2016.
  */
object FormFieldHelper {
  //  def getNameAndIDAttribute(value: String, fieldId: String, isArrayField: Boolean) = if (value != null) s"""id="$value" name="$fieldId"""" else ""
  def getNameAndIDAttribute(value: String, fieldId: String, isArrayField: Boolean) = {
    var outputStr = ""
    if (value != null) {
      outputStr = " id=\"".concat(value).concat("\" ")
      if (isArrayField) {
        outputStr = outputStr.concat("name=\"" + fieldId + "[]\"");
      } else {
        outputStr = outputStr.concat("name=\"" + fieldId + "\"" );
      }
    } else {
      outputStr = ""
    }
    outputStr
  }

  def renderFormField(field: AppFormField) = field.form_field_id.getField_type match {
    case FormFieldTypes.select => {
      Html(s"""${getLabel(field.form_field_id.getLabel)}<select ${getNameAndIDAttribute(field.form_field_id.getName, field.id.toString, field.is_array_field())} ${getAttributes(field.form_field_id.getAttrValidationsList)}>${getOptionTags(field.form_field_id.getSelect_options)}</select>""")
    }
    case FormFieldTypes.textarea => {
      Html(s"""${getLabel(field.form_field_id.getLabel)}<textarea ${hybrid(field.form_field_id.getName, field.form_field_id.getAttrValidationsList, field.id.toString, field.is_array_field())}>${getTextAreaDefaultValue(field.form_field_id.getDefault_value)}</textarea>""")
    }

    case tag if tag.getValue.contains("input") => getInputTag(field)
    case _ => "not supported"
  }

  def isRequired(answer: Boolean) = if (answer) "required" else ""

  def getTextAreaDefaultValue(value: String) = {
    val response = getDefaultValue(value).split("=")(1);
    response.substring(1, response.length - 1)
  }

  def getDefaultValue(value: String) = if (value != null) s"""value="$value"""" else ""

  def getLabel(label: String) = if (label != null) s"""<label>$label</label>""" else ""

  // use if needed
  def hybrid(name: String, attributes: JavaList[FormFieldAttrValidations], fieldId: String, isArrayField: Boolean) =
    s"""${getNameAndIDAttribute(name, fieldId, isArrayField)} ${getAttributes(attributes)}"""

  def getInputTag(field: AppFormField) = {
    Html(s"""${getLabel(field.form_field_id.getLabel)}<input type="${field.form_field_id.getField_type.getValue.split(" ")(1)}" ${getNameAndIDAttribute(field.form_field_id.getName, field.id.toString, field.is_array_field())} ${getAttributes(field.form_field_id.getAttrValidationsList)}${getDefaultValue(field.form_field_id.getDefault_value)} ${isRequired(field.is_required())} /> """)
  }

  def getAttributes(attributes: JavaList[FormFieldAttrValidations]) = {
    if (attributes.nonEmpty)
      attributes.map { attribute => s"""${attribute.getKey}="${attribute.getValue}"""" }.toArray.mkString(" ")
    else ""
  }

  def getOptionTags(options: JavaMap[String, String]): String = {
    if (options.nonEmpty) {
      val optionTags = for ((v, k) <- options) yield { s"""<option value="$v">$k</option>"""}
      options.clear()
      optionTags.mkString("")
    }
    else ""
  }
}
