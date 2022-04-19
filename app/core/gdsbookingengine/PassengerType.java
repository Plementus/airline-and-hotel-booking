package core.gdsbookingengine;

import core.gdsbookingengine.PassengerCode;

/**
 * Created by Ibrahim Olanrewaju. on 1/26/16 6:57 PM.
 */

public class PassengerType {
    private Integer quantity;
    private PassengerCode code;

    public PassengerType() {}

    public PassengerType(PassengerCode code, Integer quantity) {
        this();
        this.code = code;
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public PassengerCode getCode() {
        return code;
    }

    public void setCode(PassengerCode code) {
        this.code = code;
    }
}
