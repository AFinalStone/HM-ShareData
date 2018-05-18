package com.hm.iou.sharedata.model;

/**
 * Created by hjy on 18/4/25.<br>
 * 所有API接口返回的实体类
 */

public class BaseResponse<T> {

    private boolean success;

    private int errorCode;
    private String message;

    //兼容处理，老的叫errorCode，新的叫retCode
    private int retCode = -1;
    private String retMsg;

    private T data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getErrorCode() {
        if (retCode != -1) {
            return retCode;
        }
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        if (retCode != -1) {
            return retMsg;
        }
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
