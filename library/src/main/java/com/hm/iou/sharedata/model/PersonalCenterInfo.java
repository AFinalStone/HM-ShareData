package com.hm.iou.sharedata.model;

/**
 * 用户个人中心信息
 *
 * @author syl
 * @time 2019/3/20 1:31 PM
 */
public class PersonalCenterInfo {


    /**
     * alipayInfoResp : {"alipayAccount":"string","hasAlipayBinded":true}
     * bankCardResp : {"bankCardNo":"string","hasBinded":true}
     * mailInfoResp : {"hasMailBinded":true,"mailAddr":"string"}
     * signResp : {"writeSign":true}
     * userNameInfoResp : {"hasRealNamed":true,"idCardNum":"string","realName":"string","sex":0}
     */

    private AlipayInfoRespBean alipayInfoResp;
    private BankCardRespBean bankCardResp;
    private MailInfoRespBean mailInfoResp;
    private SignRespBean signResp;
    private UserNameInfoRespBean userNameInfoResp;
    private boolean lawyer;

    public AlipayInfoRespBean getAlipayInfoResp() {
        return alipayInfoResp;
    }

    public void setAlipayInfoResp(AlipayInfoRespBean alipayInfoResp) {
        this.alipayInfoResp = alipayInfoResp;
    }

    public BankCardRespBean getBankCardResp() {
        return bankCardResp;
    }

    public void setBankCardResp(BankCardRespBean bankCardResp) {
        this.bankCardResp = bankCardResp;
    }

    public MailInfoRespBean getMailInfoResp() {
        return mailInfoResp;
    }

    public void setMailInfoResp(MailInfoRespBean mailInfoResp) {
        this.mailInfoResp = mailInfoResp;
    }

    public SignRespBean getSignResp() {
        return signResp;
    }

    public void setSignResp(SignRespBean signResp) {
        this.signResp = signResp;
    }

    public UserNameInfoRespBean getUserNameInfoResp() {
        return userNameInfoResp;
    }

    public void setUserNameInfoResp(UserNameInfoRespBean userNameInfoResp) {
        this.userNameInfoResp = userNameInfoResp;
    }

    public boolean isLawyer() {
        return lawyer;
    }

    public void setLawyer(boolean lawyer) {
        this.lawyer = lawyer;
    }

    public static class AlipayInfoRespBean {
        /**
         * alipayAccount : string
         * hasAlipayBinded : true
         */

        private String alipayAccount;
        private boolean hasAlipayBinded;

        public String getAlipayAccount() {
            return alipayAccount;
        }

        public void setAlipayAccount(String alipayAccount) {
            this.alipayAccount = alipayAccount;
        }

        public boolean isHasAlipayBinded() {
            return hasAlipayBinded;
        }

        public void setHasAlipayBinded(boolean hasAlipayBinded) {
            this.hasAlipayBinded = hasAlipayBinded;
        }
    }

    public static class BankCardRespBean {
        /**
         * bankCardNo : string
         * hasBinded : true
         */

        private String bankCardNo;
        private boolean hasBinded;

        public String getBankCardNo() {
            return bankCardNo;
        }

        public void setBankCardNo(String bankCardNo) {
            this.bankCardNo = bankCardNo;
        }

        public boolean isHasBinded() {
            return hasBinded;
        }

        public void setHasBinded(boolean hasBinded) {
            this.hasBinded = hasBinded;
        }
    }

    public static class MailInfoRespBean {
        /**
         * hasMailBinded : true
         * mailAddr : string
         */

        private boolean hasMailBinded;
        private String mailAddr;

        public boolean isHasMailBinded() {
            return hasMailBinded;
        }

        public void setHasMailBinded(boolean hasMailBinded) {
            this.hasMailBinded = hasMailBinded;
        }

        public String getMailAddr() {
            return mailAddr;
        }

        public void setMailAddr(String mailAddr) {
            this.mailAddr = mailAddr;
        }
    }

    public static class SignRespBean {
        /**
         * writeSign : true
         */

        private boolean writeSign;

        public boolean isWriteSign() {
            return writeSign;
        }

        public void setWriteSign(boolean writeSign) {
            this.writeSign = writeSign;
        }
    }

    public static class UserNameInfoRespBean {
        /**
         * hasRealNamed : true
         * idCardNum : string
         * realName : string
         * sex : 0
         */

        private boolean hasRealNamed;
        private String idCardNum;
        private String realName;
        private int sex;

        public boolean isHasRealNamed() {
            return hasRealNamed;
        }

        public void setHasRealNamed(boolean hasRealNamed) {
            this.hasRealNamed = hasRealNamed;
        }

        public String getIdCardNum() {
            return idCardNum;
        }

        public void setIdCardNum(String idCardNum) {
            this.idCardNum = idCardNum;
        }

        public String getRealName() {
            return realName;
        }

        public void setRealName(String realName) {
            this.realName = realName;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }
    }
}
