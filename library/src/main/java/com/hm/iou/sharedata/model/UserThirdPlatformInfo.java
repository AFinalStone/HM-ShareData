package com.hm.iou.sharedata.model;

/**
 * Created by hjy on 2018/7/2.
 */

public class UserThirdPlatformInfo {

    /**
     * bankInfoResp : {"bankCard":"string","bankCardType":"string","bankName":"string","bankPhone":"string","isBinded":0}
     * customerInfoResp : {"isRealNamed":0,"name":"string","sex":0}
     */

    private BankInfoRespBean bankInfoResp;
    private CustomerInfoRespBean customerInfoResp;

    public BankInfoRespBean getBankInfoResp() {
        return bankInfoResp;
    }

    public void setBankInfoResp(BankInfoRespBean bankInfoResp) {
        this.bankInfoResp = bankInfoResp;
    }

    public CustomerInfoRespBean getCustomerInfoResp() {
        return customerInfoResp;
    }

    public void setCustomerInfoResp(CustomerInfoRespBean customerInfoResp) {
        this.customerInfoResp = customerInfoResp;
    }

    public static class BankInfoRespBean {
        /**
         * bankCard : string
         * bankCardType : string
         * bankName : string
         * bankPhone : string
         * isBinded : 0
         */

        private String bankCard;
        private String bankCardType;
        private String bankName;
        private String bankPhone;
        private int isBinded;

        public String getBankCard() {
            return bankCard;
        }

        public void setBankCard(String bankCard) {
            this.bankCard = bankCard;
        }

        public String getBankCardType() {
            return bankCardType;
        }

        public void setBankCardType(String bankCardType) {
            this.bankCardType = bankCardType;
        }

        public String getBankName() {
            return bankName;
        }

        public void setBankName(String bankName) {
            this.bankName = bankName;
        }

        public String getBankPhone() {
            return bankPhone;
        }

        public void setBankPhone(String bankPhone) {
            this.bankPhone = bankPhone;
        }

        public int getIsBinded() {
            return isBinded;
        }

        public void setIsBinded(int isBinded) {
            this.isBinded = isBinded;
        }

        @Override
        public String toString() {
            return "BankInfoRespBean{" +
                    "bankCard='" + bankCard + '\'' +
                    ", bankCardType='" + bankCardType + '\'' +
                    ", bankName='" + bankName + '\'' +
                    ", bankPhone='" + bankPhone + '\'' +
                    ", isBinded=" + isBinded +
                    '}';
        }
    }

    public static class CustomerInfoRespBean {
        /**
         * isRealNamed : 0
         * name : string
         * sex : 0
         */

        private int isRealNamed;
        private String name;
        private int sex;

        public int getIsRealNamed() {
            return isRealNamed;
        }

        public void setIsRealNamed(int isRealNamed) {
            this.isRealNamed = isRealNamed;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }
    }
}
