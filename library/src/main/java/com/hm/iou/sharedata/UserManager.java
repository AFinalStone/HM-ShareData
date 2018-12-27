package com.hm.iou.sharedata;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

import com.google.gson.Gson;
import com.hm.iou.sharedata.model.UserExtendInfo;
import com.hm.iou.sharedata.model.UserInfo;

/**
 * Created by hjy on 18/4/26.<br>
 */

public class UserManager {

    private static UserManager INSTANCE;

    //存放用户信息的SharedPreferences文件名
    private static final String SP_USER_FILE_NAME = "heima_user";
    private static final String KEY_USER_INFO = "user_info";
    private static final String KEY_USER_EXTEND_INFO = "user_extend_info";

    public static UserManager getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (UserManager.class) {
                if (INSTANCE == null) {
                    UserManager userManager = new UserManager(context);
                    INSTANCE = userManager;
                }
            }
        }
        return INSTANCE;
    }

    private Context mContext;
    private SharedPreferences mSpUser;      //存放用户相关信息
    private UserInfo mUserInfo;             //用户信息
    private UserExtendInfo mUserExtendInfo; //用户额外信息

    private UserManager(Context context) {
        mContext = context.getApplicationContext();
        mSpUser = mContext.getSharedPreferences(SP_USER_FILE_NAME, Context.MODE_PRIVATE);
    }

    /**
     * 获取用户信息，如果读取不到会返回一个空的UserInfo对象
     *
     * @return 用户信息
     */
    public UserInfo getUserInfo() {
        //优先返回缓存里的用户信息
        if (mUserInfo != null && !TextUtils.isEmpty(mUserInfo.getUserId())) {
            return mUserInfo;
        }
        //从文件里读取用户信息
        String userStr = mSpUser.getString(KEY_USER_INFO, null);
        if (TextUtils.isEmpty(userStr)) {
            return new UserInfo();
        }
        try {
            mUserInfo = new Gson().fromJson(userStr, UserInfo.class);
            return mUserInfo;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new UserInfo();
    }

    /**
     * 获取用户的额外信息，如果读取不到会返回一个空的UserInfo对象
     *
     * @return
     */
    public UserExtendInfo getUserExtendInfo() {
        //优先返回缓存里的用户额外信息
        if (mUserExtendInfo != null && mUserInfo != null && !TextUtils.isEmpty(mUserInfo.getUserId())) {
            return mUserExtendInfo;
        }
        //从文件里读取用户信息
        String userExtendStr = mSpUser.getString(KEY_USER_EXTEND_INFO, null);
        if (TextUtils.isEmpty(userExtendStr)) {
            return new UserExtendInfo();
        }
        try {
            mUserExtendInfo = new Gson().fromJson(userExtendStr, UserExtendInfo.class);
            return mUserExtendInfo;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new UserExtendInfo();
    }

    public String getUserId() {
        return getUserInfo().getUserId();
    }

    public String getToken() {
        return getUserInfo().getToken();
    }

    /**
     * 保存或者更新用户信息
     *
     * @param userInfo
     * @return
     */
    public boolean updateOrSaveUserInfo(UserInfo userInfo) {
        if (userInfo == null) {
            mSpUser.edit().putString(KEY_USER_INFO, "").commit();
            mUserInfo = null;
            return true;
        }
        String json = new Gson().toJson(userInfo);
        boolean r = mSpUser.edit().putString(KEY_USER_INFO, json).commit();
        if (r) {
            //如果用户信息更新过了，刷新缓存
            mUserInfo = userInfo;
        }
        return r;
    }

    /**
     * 保存或者更新用户额外信息
     *
     * @param userExtendInfo
     * @return
     */
    public boolean updateOrSaveUserExtendInfo(UserExtendInfo userExtendInfo) {
        if (userExtendInfo == null) {
            mSpUser.edit().putString(KEY_USER_EXTEND_INFO, "").commit();
            mUserExtendInfo = null;
            return true;
        }
        String json = new Gson().toJson(userExtendInfo);
        boolean flag = mSpUser.edit().putString(KEY_USER_EXTEND_INFO, json).commit();
        if (flag) {
            //如果用户信息更新过了，刷新缓存
            mUserExtendInfo = userExtendInfo;
        }
        return flag;
    }

    /**
     * 更新头像地址
     *
     * @param avatar 头像地址url
     * @return
     */
    public boolean updateAvatar(String avatar) {
        UserInfo userInfo = getUserInfo();
        userInfo.setAvatarUrl(avatar);
        return updateOrSaveUserInfo(userInfo);
    }

    /**
     * 更新昵称
     *
     * @param nickname 昵称
     * @return
     */
    public boolean updateNickname(String nickname) {
        UserInfo userInfo = getUserInfo();
        userInfo.setNickName(nickname);
        return updateOrSaveUserInfo(userInfo);
    }

    /**
     * 更新手机号
     *
     * @param mobile 手机号
     * @return
     */
    public boolean updateMobile(String mobile) {
        UserInfo userInfo = getUserInfo();
        userInfo.setMobile(mobile);
        return updateOrSaveUserInfo(userInfo);
    }

    /**
     * 更新城市
     *
     * @param city 城市
     * @return
     */
    public boolean updateLocation(String city) {
        UserInfo userInfo = getUserInfo();
        userInfo.setLocation(city);
        return updateOrSaveUserInfo(userInfo);
    }

    /**
     * 更新性别
     *
     * @param sex 性别
     * @return
     */
    public boolean updateSex(int sex) {
        UserInfo userInfo = getUserInfo();
        userInfo.setSex(sex);
        return updateOrSaveUserInfo(userInfo);
    }

    /**
     * 更新主要收入
     *
     * @param mainIncome 主要收入
     * @return
     */
    public boolean updateMainIncome(int mainIncome) {
        UserInfo userInfo = getUserInfo();
        userInfo.setMainIncome(mainIncome);
        return updateOrSaveUserInfo(userInfo);
    }

    /**
     * 更新次要收入
     *
     * @param secondIncome 次要收入
     * @return
     */
    public boolean updateSecondIncome(int secondIncome) {
        UserInfo userInfo = getUserInfo();
        userInfo.setSecondIncome(secondIncome);
        return updateOrSaveUserInfo(userInfo);
    }

    /**
     * 更新token
     *
     * @param token
     * @return
     */
    public boolean updateToken(String token) {
        UserInfo userInfo = getUserInfo();
        userInfo.setToken(token);
        return updateOrSaveUserInfo(userInfo);
    }

    /**
     * 判断用户是否已登录
     *
     * @return
     */
    public boolean isLogin() {
        UserInfo userInfo = getUserInfo();
        if (userInfo != null && !TextUtils.isEmpty(userInfo.getUserId()) && !TextUtils.isEmpty(userInfo.getToken())) {
            return true;
        }
        return false;
    }

    /**
     * 用户登出，清除token、登录状态、用户信息
     *
     * @return
     */
    public boolean logout() {
        mUserInfo = null;
        mUserExtendInfo = null;
        return mSpUser.edit().clear().commit();
    }

    /**
     * 是否实名
     *
     * @return
     */
    public boolean isRealName() {
        UserInfo userInfo = getUserInfo();
        return userInfo.getType() >= 3;
    }

}
