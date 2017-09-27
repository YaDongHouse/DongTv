package com.example.admin.dongtv.bean.httpbean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by admin on 2017/9/23.
 */

public class AppStart {

    /**
     * id : 1781
     * title : 一斟红酒液 养身有养心
     * thumb : http://image.quanmin.tv/2ba4ded1b0d041856c974a8103f68cbcpng
     * link : http://xmlife.smi170.com/resources/wap-shop/pages/goods_shopping.html?subjectId=399&title=Aglassofredwine&sourid=quanminzhibo
     * create_at : 2017-03-12 23:50:03
     * status : 1
     * fk :
     * subtitle :
     * content :
     * ext : {"type":"html","time":"3","end_time":1489507199}
     * slot_id : 111
     * priority : 0
     */
    //AndroidstartBean是一个上面json的列表
    private List<AndroidstartBean> androidstart;

    @SerializedName("app-focus")
    private List<Banner> banners;

    public List<AndroidstartBean> getAndroidstart() {
        return androidstart;
    }

    public void setAndroidstart(List<AndroidstartBean> androidstart) {
        this.androidstart = androidstart;
    }

    public List<Banner> getBanners() {
        return banners;
    }

    public void setBanners(List<Banner> banners) {
        this.banners = banners;
    }

    public static class AndroidstartBean{

        /**
         * id : 1742
         * title : 全民直播桃花节
         * thumb : http://image.quanmin.tv/8bc03fc728b59636c28d9adea26913eajpg
         * link : http://m.quanmin.tv/static/v2/m/boot/special/flower/flower.html
         * create_at : 2017-01-26 00:06:11
         * status : 1
         * fk :
         * subtitle :
         * content :
         * ext : {"type":"html","time":"3","end_time":1464710400}
         * slot_id : 111
         * priority : 0
         */

        private int id;
        private String title;
        private String thumb;
        private String link;
        private String create_at;
        private int status;
        private String fk;
        private String subtitle;
        private String content;
        private ExtBean ext;
        private int slot_id;
        private int priority;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getCreate_at() {
            return create_at;
        }

        public void setCreate_at(String create_at) {
            this.create_at = create_at;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getFk() {
            return fk;
        }

        public void setFk(String fk) {
            this.fk = fk;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public ExtBean getExt() {
            return ext;
        }

        public void setExt(ExtBean ext) {
            this.ext = ext;
        }

        public int getSlot_id() {
            return slot_id;
        }

        public void setSlot_id(int slot_id) {
            this.slot_id = slot_id;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public static class ExtBean {
            /**
             * type : html
             * time : 3
             * end_time : 1464710400
             */

            private String type;
            private String time;
            private int end_time;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public int getEnd_time() {
                return end_time;
            }

            public void setEnd_time(int end_time) {
                this.end_time = end_time;
            }
        }
    }
}
