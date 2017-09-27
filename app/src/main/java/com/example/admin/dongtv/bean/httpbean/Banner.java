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
    private LinkObjectBean link_object;
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

    public LinkObjectBean getLink_object() {
        return link_object;
    }

    public void setLink_object(LinkObjectBean link_object) {
        this.link_object = link_object;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
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

    public static class LinkObjectBean {
        /**
         * no : 177
         * nick : RIOT拳头游戏
         * avatar : http://a.img.shouyintv.cn/E6It201-normal
         * follow : 485659
         * id : 100987
         * uid : 177
         * title : 2017全球总决赛DW vs ONE
         * category_id : 1
         * slug : riot
         * intro :
         * announcement :
         * cover : 177-1506163624-819.jpg
         * play_at : 2017-09-14 11:44:51
         * last_play_at :
         * view : 1553527
         * views : 32544
         * status : 2
         * priv : 0
         * landscape : 1
         * position :
         * weight : 0
         * check : 1
         * recommend_image : http://static01.quanmin.tv/201705/149410997535172ac86c5820a973be03f04b47e901668.jpg
         * videoQuality : 234
         * category_name : 英雄联盟
         * screen : 0
         * thumb : http://static01.quanmin.tv/201709/7d4f1588-a40c-4342-8564-ccb4b0916371.jpg
         * video : http://thumb.quanmin.tv/177.mp4?t=1506163500
         * start_time : 1506139417.776
         * source : ws
         * stream : http://liveal.quanmin.tv/live/177_quanmin576.flv
         * channelId : 0
         * liveId : 21521720
         * updatetime : 2017-09-22 16:25:04
         * rectifyType : 0
         * app_shuffling_image : http://static01.quanmin.tv/201709/7d4f1588-a40c-4342-8564-ccb4b0916371.jpg
         * categoryId : 1
         * live_thumb : http://snap.quanmin.tv/177-1506163624-819.jpg?imageView2/2/w/390/
         * hidden : false
         * play_status : true
         * love_cover :
         */

        private String no;
        private String nick;
        private String avatar;
        private String follow;
        private String id;
        private String uid;
        private String title;
        private String category_id;
        private String slug;
        private String intro;
        private String announcement;
        private String cover;
        private String play_at;
        private String last_play_at;
        private String view;
        private String views;
        private String status;
        private String priv;
        private String landscape;
        private String position;
        private String weight;
        private String check;
        private String recommend_image;
        private String videoQuality;
        private String category_name;
        private int screen;
        private String thumb;
        private String video;
        private String start_time;
        private String source;
        private String stream;
        private String channelId;
        private String liveId;
        private String updatetime;
        private String rectifyType;
        private String app_shuffling_image;
        private String categoryId;
        private String live_thumb;
        private boolean hidden;
        private boolean play_status;
        private String love_cover;

        public String getNo() {
            return no;
        }

        public void setNo(String no) {
            this.no = no;
        }

        public String getNick() {
            return nick;
        }

        public void setNick(String nick) {
            this.nick = nick;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getFollow() {
            return follow;
        }

        public void setFollow(String follow) {
            this.follow = follow;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getCategory_id() {
            return category_id;
        }

        public void setCategory_id(String category_id) {
            this.category_id = category_id;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getIntro() {
            return intro;
        }

        public void setIntro(String intro) {
            this.intro = intro;
        }

        public String getAnnouncement() {
            return announcement;
        }

        public void setAnnouncement(String announcement) {
            this.announcement = announcement;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getPlay_at() {
            return play_at;
        }

        public void setPlay_at(String play_at) {
            this.play_at = play_at;
        }

        public String getLast_play_at() {
            return last_play_at;
        }

        public void setLast_play_at(String last_play_at) {
            this.last_play_at = last_play_at;
        }

        public String getView() {
            return view;
        }

        public void setView(String view) {
            this.view = view;
        }

        public String getViews() {
            return views;
        }

        public void setViews(String views) {
            this.views = views;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getPriv() {
            return priv;
        }

        public void setPriv(String priv) {
            this.priv = priv;
        }

        public String getLandscape() {
            return landscape;
        }

        public void setLandscape(String landscape) {
            this.landscape = landscape;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getWeight() {
            return weight;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }

        public String getCheck() {
            return check;
        }

        public void setCheck(String check) {
            this.check = check;
        }

        public String getRecommend_image() {
            return recommend_image;
        }

        public void setRecommend_image(String recommend_image) {
            this.recommend_image = recommend_image;
        }

        public String getVideoQuality() {
            return videoQuality;
        }

        public void setVideoQuality(String videoQuality) {
            this.videoQuality = videoQuality;
        }

        public String getCategory_name() {
            return category_name;
        }

        public void setCategory_name(String category_name) {
            this.category_name = category_name;
        }

        public int getScreen() {
            return screen;
        }

        public void setScreen(int screen) {
            this.screen = screen;
        }

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public String getVideo() {
            return video;
        }

        public void setVideo(String video) {
            this.video = video;
        }

        public String getStart_time() {
            return start_time;
        }

        public void setStart_time(String start_time) {
            this.start_time = start_time;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getStream() {
            return stream;
        }

        public void setStream(String stream) {
            this.stream = stream;
        }

        public String getChannelId() {
            return channelId;
        }

        public void setChannelId(String channelId) {
            this.channelId = channelId;
        }

        public String getLiveId() {
            return liveId;
        }

        public void setLiveId(String liveId) {
            this.liveId = liveId;
        }

        public String getUpdatetime() {
            return updatetime;
        }

        public void setUpdatetime(String updatetime) {
            this.updatetime = updatetime;
        }

        public String getRectifyType() {
            return rectifyType;
        }

        public void setRectifyType(String rectifyType) {
            this.rectifyType = rectifyType;
        }

        public String getApp_shuffling_image() {
            return app_shuffling_image;
        }

        public void setApp_shuffling_image(String app_shuffling_image) {
            this.app_shuffling_image = app_shuffling_image;
        }

        public String getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(String categoryId) {
            this.categoryId = categoryId;
        }

        public String getLive_thumb() {
            return live_thumb;
        }

        public void setLive_thumb(String live_thumb) {
            this.live_thumb = live_thumb;
        }

        public boolean isHidden() {
            return hidden;
        }

        public void setHidden(boolean hidden) {
            this.hidden = hidden;
        }

        public boolean isPlay_status() {
            return play_status;
        }

        public void setPlay_status(boolean play_status) {
            this.play_status = play_status;
        }

        public String getLove_cover() {
            return love_cover;
        }

        public void setLove_cover(String love_cover) {
            this.love_cover = love_cover;
        }
    }
}
