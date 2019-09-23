package com.hm.iou.sharedata.dict

enum class IOUStatusEnum(val value: Int) {

    Draft(1),   //草稿
    Offical(2),  //正常的
    Del(3), //删除或隐藏的
    Close(4), //关闭
    Finish(5), //已结清
    WaitConfirm(12), //等待确认
    TimeoutUnSign(13), //超时未签
    JustComplete(14), //刚完成
    Refused(15); //被拒绝

}