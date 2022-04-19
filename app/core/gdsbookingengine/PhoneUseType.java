/**
 * Created by Ibrahim Olanrewaju on 4/11/2016.
 */

package core.gdsbookingengine;

public enum PhoneUseType {
  HOME("Home"),
  OFFICE("Office"),
  H("H"),
  O("O");
  private final String value;

  PhoneUseType (String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static PhoneUseType fromValue(String v) {
    for (PhoneUseType phoneUseType: PhoneUseType.values()) {
      if (phoneUseType.value.equals(v)) {
        return phoneUseType;
      }
    }
    throw new IllegalArgumentException(v);
  }
}
