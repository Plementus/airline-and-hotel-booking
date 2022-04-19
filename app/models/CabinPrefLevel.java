/**
 * Created by Ibrahim Olanrewaju on 3/25/2016.
 */

package models;

public enum CabinPrefLevel {

  ONLY("Only"),
  UNACCEPTABLE("Unacceptable"),
  PREFERRED("Preferred");

  private final String value;

  CabinPrefLevel(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static CabinPrefLevel fromValue(String v) {
    for (CabinPrefLevel cabinPrefLevel: CabinPrefLevel.values()) {
      if (cabinPrefLevel.value.equals(v)) {
        return cabinPrefLevel;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
