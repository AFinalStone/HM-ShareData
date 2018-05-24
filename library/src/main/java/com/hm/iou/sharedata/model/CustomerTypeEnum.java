package com.hm.iou.sharedata.model;


import java.io.Serializable;

public enum CustomerTypeEnum implements Serializable {
    CSub(1), CPlus(2), BSub(3), BPlus(4), ASub(5), APlus(6);

    int value;

    private CustomerTypeEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static boolean consist(int value) {
        for (CustomerTypeEnum customerTypeEnum : CustomerTypeEnum.values()) {
            if (value == customerTypeEnum.getValue())
                return true;
        }
        return false;
    }

    public CustomerTypeEnum getByValue(int value) {
        for (CustomerTypeEnum customerTypeEnum : CustomerTypeEnum.values()) {
            if (value == customerTypeEnum.getValue())
                return customerTypeEnum;
        }
        return null;
    }
}
