/**
 * Created by Ibrahim Olanrewaju on 4/8/2016.
 */

package core.gdsbookingengine;

public enum Gender {
  MALE("Male"),
  FEMALE("Female"),
  M("M"),
  F("F"),
  UNKNOWN("Unknown");
  private final String value;

  Gender(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static Gender fromValue(String v) {
    for (Gender gender: Gender.values()) {
      if (gender.value.equals(v)) {
        return gender;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
