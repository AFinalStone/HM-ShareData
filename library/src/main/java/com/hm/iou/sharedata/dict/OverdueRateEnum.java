package com.hm.iou.sharedata.dict;

import java.io.Serializable;

public enum OverdueRateEnum implements Serializable {

    Default(0, "按国家规定（6.5）", "按国家规定万6.5"),
    Nine(9, "万分之9", "未还金额的万9"),
    Eight(8, "万分之8", "未还金额的万8"),
    Seven(7, "万分之7", "未还金额的万7"),
    Six(6, "万分之6", "未还金额的万6"),
    Five(5, "万分之5", "未还金额的万5"),
    Four(4, "万分之4", "未还金额的万4");

    private int type;
    private String name;
    private String desc;

    OverdueRateEnum(int type, String name, String desc) {
        this.type = type;
        this.name = name;
        this.desc = desc;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static OverdueRateEnum getOverdueRateByType(int type) {
        switch (type) {
            case 9:
                return Nine;
            case 8:
                return Eight;
            case 7:
                return Seven;
            case 6:
                return Six;
            case 5:
                return Five;
            case 4:
                return Four;
        }
        return Default;
    }

}