package com.hm.iou.sharedata.model;

/**
 * Created by hjy on 18/4/26.<br>
 */

public class UserInfo {

    private String userId;
    private String token;
    private String showId;
    private String nickName;
    private String avatarUrl;
    private String mobile;
    private int type;
    private int sex;
    private String name;
    private String mailAddr;
    private String idCardNum;
    private String status;
    private String location;
    private int mainIncome;
    private int secondIncome;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMailAddr() {
        return mailAddr;
    }

    public void setMailAddr(String mailAddr) {
        this.mailAddr = mailAddr;
    }

    public String getIdCardNum() {
        return idCardNum;
    }

    public void setIdCardNum(String idCardNum) {
        this.idCardNum = idCardNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getMainIncome() {
        return mainIncome;
    }

    public void setMainIncome(int mainIncome) {
        this.mainIncome = mainIncome;
    }

    public int getSecondIncome() {
        return secondIncome;
    }

    public void setSecondIncome(int secondIncome) {
        this.secondIncome = secondIncome;
    }
}