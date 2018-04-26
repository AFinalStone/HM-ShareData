package com.hm.iou.sharedata.event;

/**
 * Created by hjy on 18/4/26.<br>
 * 定义通用的业务通知事件
 */

public class CommBizEvent {

    /**
     * 业务通知方自定定义该业务事件的关键字
     */
    public String key;

    /**
     * 业务通知事件所带的额外内容
     */
    public String content;

    public CommBizEvent(String key, String content) {
        this.key = key;
        this.content = content;
    }
}
