package com.hm.iou.sharedata.dict;

public enum ReturnWayEnumV2 {

    OneMonth("m1", "一月一付"),
    TwoMonth("m2", "二月一付"),
    ThreeMonth("m3", "三月一付"),
    SixMonth("m6", "六月一付"),
    Year("y1", "一年一付");

    private String type;
    private String name;

    ReturnWayEnumV2(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public static ReturnWayEnumV2 getInstance(String type) {
        if (OneMonth.getType().equals(type)) {
            return OneMonth;
        } else if (TwoMonth.getType().equals(type)) {
            return TwoMonth;
        } else if (ThreeMonth.getType().equals(type)) {
            return ThreeMonth;
        } else if (SixMonth.getType().equals(type)) {
            return SixMonth;
        } else if (Year.getType().equals(type)) {
            return Year;
        }
        return OneMonth;
    }
}