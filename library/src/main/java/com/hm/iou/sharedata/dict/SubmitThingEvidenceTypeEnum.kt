package com.hm.iou.sharedata.dict;

enum class SubmitThingEvidenceTypeEnum(val type: Int, val des: String) {

    Nothing(0, "无"),
    AliPay(10, "支付宝"),
    WeiXin(11, "微信"),
    BankCard(12, "银行卡"),
    Express(30, "快递单号"),
    Camera(31, "摄像拍照"),
    Other(32, "其他");

    companion object {
        fun getInstanceByDesc(typeDesc: String): SubmitThingEvidenceTypeEnum {
            return when (typeDesc) {
                Nothing.des -> Nothing
                AliPay.des -> AliPay
                WeiXin.des -> WeiXin
                BankCard.des -> BankCard
                Express.des -> Express
                Camera.des -> Camera
                Other.des -> Other
                else -> Nothing
            }
        }

        fun getInstanceByType(type: Int): SubmitThingEvidenceTypeEnum {
            return when (type) {
                Nothing.type -> Nothing
                AliPay.type -> AliPay
                WeiXin.type -> WeiXin
                BankCard.type -> BankCard
                Express.type -> Express
                Camera.type -> Camera
                Other.type -> Other
                else -> Nothing
            }
        }
    }
}