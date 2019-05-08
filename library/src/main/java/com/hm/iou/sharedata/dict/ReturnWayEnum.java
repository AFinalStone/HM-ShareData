package com.hm.iou.sharedata.dict;

/**
 * @author : syl
 * @Date : 2018/6/13 12:01
 * @E-Mail : shiyaolei@dafy.com
 */
public enum ReturnWayEnum {
    Entire(1, "一次性全部归还"), Split(2, "分期归还");

    private int value;
    private String desc;

    ReturnWayEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }
}
