package com.hm.iou.sharedata.event;

/**
 * Created by hjy on 2018/6/6.
 */

public class IouDeleteEvent {

    public String iouId;

    public IouDeleteEvent(String iouId) {
        this.iouId = iouId;
    }
}
