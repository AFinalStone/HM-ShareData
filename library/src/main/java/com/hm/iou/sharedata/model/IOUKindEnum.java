//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.hm.iou.sharedata.model;

import java.io.Serializable;

public enum IOUKindEnum implements Serializable {
    ElecBorrowReceipt(1),
    FunReceipt(3),
    PlatformReceipt(5),
    PaperBorrowerReceipt(7),
    PaperReceiveReceipt(8),
    ElecReceiveReceipt(9),
    EelecBorrowV2_0(11),
    FdContract(12),             //房贷合同
    FzContract(13),             //房租合同
    CreditCard(14),             //银行卡债务
    Qiantiao(15);               //欠条

    int value;

    private IOUKindEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}