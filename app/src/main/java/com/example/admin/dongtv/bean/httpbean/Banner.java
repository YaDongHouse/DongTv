package com.example.admin.dongtv.bean.httpbean;

/**
 * Created by admin on 2017/9/23.
 */

public class Banner {

    /**
     * title : 2017全球总决赛DW vs ONE
     * link : quanmin://mobile.app/liveroom?live=177
     * fk : 177
     * slot_id : 113
     * ext : {"type":"play"}
     * link_object : {"no":"177","nick":"RIOT拳头游戏","avatar":"http://a.img.shouyintv.cn/E6It201-normal","follow":"485659","id":"100987","uid":"177","title":"2017全球总决赛DW vs ONE","category_id":"1","slug":"riot","intro":"","announcement":"","cover":"177-1506163624-819.jpg","play_at":"2017-09-14 11:44:51","last_play_at":"","view":"1553527","views":"32544","status":"2","priv":"0","landscape":"1","position":"","weight":"0","check":"1","recommend_image":"http://static01.quanmin.tv/201705/149410997535172ac86c5820a973be03f04b47e901668.jpg","videoQuality":"234","category_name":"英雄联盟","screen":0,"thumb":"http://static01.quanmin.tv/201709/7d4f1588-a40c-4342-8564-ccb4b0916371.jpg","video":"http://thumb.quanmin.tv/177.mp4?t=1506163500","start_time":"1506139417.776","source":"ws","stream":"http://liveal.quanmin.tv/live/177_quanmin576.flv","channelId":"0","liveId":"21521720","updatetime":"2017-09-22 16:25:04","rectifyType":"0","app_shuffling_image":"http://static01.quanmin.tv/201709/7d4f1588-a40c-4342-8564-ccb4b0916371.jpg","categoryId":"1","live_thumb":"http://snap.quanmin.tv/177-1506163624-819.jpg?imageView2/2/w/390/","hidden":false,"play_status":true,"love_cover":""}
     * thumb : http://static01.quanmin.tv/201709/7d4f1588-a40c-4342-8564-ccb4b0916371.jpg
     */

    private String title;
    private String link;
    private String fk;
    private int slot_id;
    private ExtBean ext;
    private LiveInfo link_object;
    private String thumb;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getFk() {
        return fk;
    }

    public void setFk(String fk) {
        this.fk = fk;
    }

    public int getSlot_id() {
        return slot_id;
    }

    public void setSlot_id(int slot_id) {
        this.slot_id = slot_id;
    }

    public ExtBean getExt() {
        return ext;
    }

    public void setExt(ExtBean ext) {
        this.ext = ext;
    }

    public LiveInfo getLink_object() {
        return link_object;
    }

    public void setLink_object(LiveInfo link_object) {
        this.link_object = link_object;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public boolean isRoom(){
        if (getExt()!=null){
            return "play".equals(getExt().getType());
        }
        return false;
    }

    public static class ExtBean {
        /**
         * type : play
         */

        private String type;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
