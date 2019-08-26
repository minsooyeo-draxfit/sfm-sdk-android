package com.supremainc.sfm_sdk;

public enum UF_ENROLL_MODE {
    UF_ENROLL_ONE_TIME(0x30),
    UF_ENROLL_TWO_TIMES1(0x31),
    UF_ENROLL_TWO_TIMES2(0x32),
    UF_ENROLL_TWO_TEMPLATES1(0x41),
    UF_ENROLL_TWO_TEMPLATES2(0x42),
    ;
    private int value;

    UF_ENROLL_MODE(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
