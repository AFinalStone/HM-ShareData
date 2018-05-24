package com.hm.iou.sharedata.model;

import java.io.Serializable;

public enum SexEnum implements Serializable {

    FEMALE(0, "女"), MALE(1, "男"), UNKNOWN(3, "未知");

    int value;
    String name;

    SexEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static String getNameByValue(int value) {
        if (value == FEMALE.value) {
            return FEMALE.name;
        } else if (value == MALE.value) {
            return MALE.name;
        }
        return UNKNOWN.name;
    }

}
