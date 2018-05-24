package com.hm.iou.sharedata.model;


import java.io.Serializable;

public enum IncomeEnum implements Serializable {
    None(1, "无"), Wages(2, "工资"), Business(3, "生意"), Investment(4, "投资"), Parents(5, "父母资助"), Else(6, "其他");

    int value;
    String name;

    IncomeEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static boolean consist(int value) {
        for (IncomeEnum inComeEnum : IncomeEnum.values()) {
            if (value == inComeEnum.getValue())
                return true;
        }
        return false;
    }

    public IncomeEnum getByValue(int value) {
        for (IncomeEnum inComeEnum : IncomeEnum.values()) {
            if (value == inComeEnum.getValue())
                return inComeEnum;
        }
        return null;
    }
}
