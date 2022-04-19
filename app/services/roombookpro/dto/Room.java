/**
 * Created by Ibrahim Olanrewaju on 2/11/2016.
 */

package services.roombookpro.dto;

import java.util.List;

public class Room {
  private Integer id;
  private String code;
  private String name;
  private Boolean smoking;
  private String bedType;
  private String description;
  private String payType;
  private Price price;
  private String lastCancelDate;
  private List<Inclusion> inclusions;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Boolean isSmoking() {
    return smoking;
  }

  public void setSmoking(Boolean smoking) {
    this.smoking = smoking;
  }

  public String getBedType() {
    return bedType;
  }

  public void setBedType(String bedType) {
    this.bedType = bedType;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getPayType() {
    return payType;
  }

  public void setPayType(String payType) {
    this.payType = payType;
  }

  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public String getLastCancelDate() {
    return lastCancelDate;
  }

  public void setLastCancelDate(String lastCanceDate) {
    this.lastCancelDate = lastCanceDate;
  }

  public List<Inclusion> getInclusions() {
    return inclusions;
  }

  public void setInclusions(List<Inclusion> inclusions) {
    this.inclusions = inclusions;
  }
}

