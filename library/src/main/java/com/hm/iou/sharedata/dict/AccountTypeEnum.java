package com.hm.iou.sharedata.dict;

public enum AccountTypeEnum {
    AliPay(1, "支付宝"), Bank(2, "银行卡");

    private int type;
    private String name;

    AccountTypeEnum(int type, String name) {
        this.type = type;
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public static AccountTypeEnum getInstance(int type) {
        if (1 == type) {
            return AliPay;
        } else if (2 == type) {
            return Bank;
        }
        return Bank;
    }
}