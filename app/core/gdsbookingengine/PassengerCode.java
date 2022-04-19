package core.gdsbookingengine;

public enum PassengerCode {
    ADULT("ADT"), CHILD("CHD"), SABRE_CHILD("CNN"), INFANT("INF");

    private String value;

    PassengerCode(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static PassengerCode fromValue(String v) {
        for (PassengerCode p : PassengerCode.values()) {
            if (p.value.equals(v)) {
                return p;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
