/**
 * Created by Ibrahim Olanrewaju on 3/25/2016.
 */

package models;

public enum FlightType {
  NONSTOP("Nonstop"),
  DIRECT("Direct"),
  CONNECTION("Connection");
  private final String value;

  FlightType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static FlightType fromValue(String v) {
    for (FlightType f : FlightType.values()) {
      if (f.value.equals(v)) {
        return f;
      }
    }
    throw new IllegalArgumentException(v);
  }
}