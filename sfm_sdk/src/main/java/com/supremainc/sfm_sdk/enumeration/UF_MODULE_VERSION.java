/*
 * Copyright (c) 2001 - 2019. Suprema Inc. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for details.
 */

package com.supremainc.sfm_sdk.enumeration;

/**
 * Please refer to the SFM Protocol Manual for the details.
 */
public enum UF_MODULE_VERSION {
    UF_VERSION_1_0(0),
    UF_VERSION_1_1(1),
    UF_VERSION_1_2(2),
    UF_VERSION_1_3(3),
    UF_VERSION_1_4(4),
    UF_VERSION_1_5(5),
    UF_VERSION_1_6(6),
    UF_VERSION_1_7(7),
    UF_VERSION_1_8(8),
    UF_VERSION_1_9(9),
    UF_VERSION_2_0(20),
    UF_VERSION_2_1(21),
    UF_VERSION_2_2(22),
    UF_VERSION_2_3(23),
    UF_VERSION_2_4(24),
    UF_VERSION_3_0(30),
    UF_VERSION_3_1(31),
    UF_VERSION_3_2(32),
    UF_VERSION_3_3(33),
    UF_VERSION_3_4(34),
    UF_VERSION_3_5(35),
    UF_VERSION_3_6(36),
    UF_VERSION_3_7(37),
    UF_VERSION_UNKNOWN(-1),
    ;
    private int value;

    UF_MODULE_VERSION(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }

    public static UF_MODULE_VERSION ToObjectType(int i) {
        UF_MODULE_VERSION result = null;

        for (UF_MODULE_VERSION iter : UF_MODULE_VERSION.values()) {
            if (i == iter.getValue()) {
                result = iter;
            }
        }
        return result;
    }

}
