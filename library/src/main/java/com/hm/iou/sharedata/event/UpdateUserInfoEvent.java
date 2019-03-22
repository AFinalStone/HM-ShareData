package com.hm.iou.sharedata.event;


/**
 * 用户信息变更
 *
 * @author syl
 * @time 2018/5/17 下午2:40
 */
public class UpdateUserInfoEvent {
    /**
     * 业务通知方自定定义该业务事件的关键字
     */
    public String key;

    /**
     * 业务通知事件所带的额外内容
     */
    public String content;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}