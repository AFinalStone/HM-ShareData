package com.hm.iou.sharedata.model;

/**
 * Created by syl on 18/4/26.<br>
 */
public class UserExtendInfo {

    private UserThirdPlatformInfo thirdPlatformInfo;//用户绑定的第三方平台信息

    private boolean haveOpenDebtList;//是否打开过记债本列表

    public UserThirdPlatformInfo getThirdPlatformInfo() {
        return thirdPlatformInfo;
    }

    public void setThirdPlatformInfo(UserThirdPlatformInfo thirdPlatformInfo) {
        this.thirdPlatformInfo = thirdPlatformInfo;
    }

    public boolean getHaveOpenDebtList() {
        return haveOpenDebtList;
    }

    public void setHaveOpenDebtList(boolean haveOpenDebtList) {
        this.haveOpenDebtList = haveOpenDebtList;
    }
}