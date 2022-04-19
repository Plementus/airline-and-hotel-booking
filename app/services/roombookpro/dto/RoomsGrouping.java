/**
 * Created by Ibrahim Olanrewaju on 2/11/2016.
 */

package services.roombookpro.dto;

import java.util.ArrayList;
import java.util.List;

public class RoomsGrouping {
  private List<Room> room1;
  private List<Room> room2;
  private List<Room> room3;
  private List<Room> room4;

  public List<Room> getRoom1() {
    if(room1 == null) {
      room1 = new ArrayList<>();
    }
    return room1;
  }

  public void setRoom1(List<Room> room1) {
    this.room1 = room1;
  }

  public List<Room> getRoom2() {
    if(room2 == null) {
      room2 = new ArrayList<>();
    }
    return room2;
  }

  public void setRoom2(List<Room> room2) {
    this.room2 = room2;
  }

  public List<Room> getRoom3() {
    if(room3 == null) {
      room3 = new ArrayList<>();
    }
    return room3;
  }

  public void setRoom3(List<Room> room3) {
    this.room3 = room3;
  }

  public List<Room> getRoom4() {
    if(room4 == null) {
      room4 = new ArrayList<>();
    }
    return room4;
  }

  public void setRoom4(List<Room> room4) {
    this.room4 = room4;
  }
}
