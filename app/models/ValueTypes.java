/*
 *
 *  * [BRAKET] CONFIDENTIAL
 *  * __________________
 *  *
 *  *  4/12/16 2:48 AM  [BRAKKET] Solutions
 *  *  All Rights Reserved.
 *  *
 *  * NOTICE:  All information contained herein is, and remains
 *  * the property of Brakket Solutions and its suppliers,
 *  * if any.  The intellectual and technical concepts contained
 *  * herein are proprietary to Brakket Solutions
 *  * and its suppliers and may be covered by Nigeria. and Foreign Patents,
 *  * patents in process, and are protected by trade secret or copyright law.
 *  * Dissemination of this information or reproduction of this material
 *  * is strictly forbidden unless prior written permission is obtained
 *  * from Brakket Solutions.
 *
 */

package models;

import com.avaje.ebean.annotation.EnumValue;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by
 * Ibrahim Olanrewaju. on 12/04/2016 2:48 AM.
 */
public enum ValueTypes {
    @EnumValue("PERCENTAGE")
    PERCENTAGE,
    @EnumValue("MONEY")
    MONEY;

    public static Map<String, String> options() {
        Map<String, String> opt = new HashMap<>();
        for (ValueTypes types : ValueTypes.values()) {
            opt.put(types.name(), types.name().toLowerCase());
        }
        return opt;
    }
}
