package com.example.admin.dongtv.bean.httpbean;

import com.example.admin.dongtv.util.DecimalFormatUtil;

import java.util.List;

/**
 * Created by admin on 2017/9/23.
 */

public class Recommend {

    private List<RoomBean> room;
    private List<?> ad;

    public List<RoomBean> getRoom() {
        return room;
    }

    public void setRoom(List<RoomBean> room) {
        this.room = room;
    }

    public List<?> getAd() {
        return ad;
    }

    public void setAd(List<?> ad) {
        this.ad = ad;
    }

    public static class RoomBean {
        /**
         * id : 0
         * name : 精彩推荐
         * is_default : 1
         * icon :
         * slug :
         * category_more :
         * type : 1
         * screen : 0
         * list : [{"beauty_cover":"http://static01.quanmin.tv/201709/d2387087-74f3-480b-84d7-36ba9993d02a.jpg","no":14844829,"first_play_at":"1970-01-01 08:00:00","category_name":"王者荣耀","gender":1,"thumb":"http://static01.quanmin.tv/201709/d2387087-74f3-480b-84d7-36ba9993d02a.jpg","oldNo":"","room_tag":"","last_play_at":"1970-01-01 08:00:00","screen":0,"video":"http://thumb.quanmin.tv/2044312096.mp4?t=1506164700","title":"王者荣耀巅峰挑战赛 半决赛！","recommend_image":"","is_shield":false,"nick":"队长骚小年","uid":2044312096,"view":"250475","category_id":17,"stream":"http://flv.quanmin.tv/live/2044312096.flv","slug":null,"live_thumb":"http://snap.quanmin.tv/2044312096-1506164916-393.jpg?imageView2/2/w/390/","love_cover":"http://static01.quanmin.tv/201709/d2387087-74f3-480b-84d7-36ba9993d02a.jpg","level":0,"like":0,"video_quality":"","weight":0,"starlight":81492,"check":true,"avatar":"http://a.img.shouyintv.cn/oNik101-normal","follow":59038,"play_count":0,"play_true":0,"fans":0,"block_image":"","max_view":0,"default_image":"","last_end_at":"1970-01-01 08:00:00","position":"外太空","create_at":"2017-09-23 16:52:01","last_thumb":"2044312096-1506087275-190.jpg","landscape":1,"category_slug":"wangzhe","anniversary":0,"play_status":true,"status":2,"cid":6,"coin":81492,"frame":"","link":"http://www.quanmin.tv/14844829"},{"beauty_cover":"","no":21876824,"first_play_at":"1970-01-01 08:00:00","category_name":"Showing","gender":0,"thumb":"http://a.img.shouyintv.cn/Lwex201-big","oldNo":"","room_tag":"","last_play_at":"1970-01-01 08:00:00","screen":1,"video":"http://thumb.quanmin.tv/1153149492.mp4?t=1506164700","title":"总会有人来 总会有人离开🦄","recommend_image":"","is_shield":false,"nick":"_486","uid":1153149492,"view":"7067","category_id":29,"stream":"http://flv.quanmin.tv/live/1153149492.flv","slug":null,"live_thumb":"http://a.img.shouyintv.cn/Lwex201-big","love_cover":"","level":0,"like":0,"video_quality":null,"weight":0,"starlight":127797,"check":true,"avatar":"http://a.img.shouyintv.cn/Lwex201-normal","follow":6957,"play_count":0,"play_true":0,"fans":0,"block_image":"","max_view":0,"default_image":"","last_end_at":"1970-01-01 08:00:00","position":"上海市","create_at":"2017-09-23 16:45:29","last_thumb":"1153149492-1506156282-264.jpg","landscape":0,"category_slug":"showing","anniversary":0,"play_status":true,"status":2,"cid":6,"coin":127797,"frame":"","link":"http://www.quanmin.tv/21876824"},{"beauty_cover":"","no":3056249,"first_play_at":"1970-01-01 08:00:00","category_name":"全民星秀","gender":0,"thumb":"http://snap.quanmin.tv/3056249-1506164888-162.jpg?imageView2/2/w/390/","oldNo":"","room_tag":"","last_play_at":"1970-01-01 08:00:00","screen":0,"video":"http://thumb.quanmin.tv/3056249.mp4?t=1506164700","title":"来听歌吖","recommend_image":"","is_shield":false,"nick":"萌萌、站起来","uid":3056249,"view":"6230","category_id":4,"stream":"http://flv.quanmin.tv/live/3056249.flv","slug":"","live_thumb":"http://snap.quanmin.tv/3056249-1506164888-162.jpg?imageView2/2/w/390/","love_cover":"","level":0,"like":0,"video_quality":"","weight":0,"starlight":106150,"check":true,"avatar":"http://a.img.shouyintv.cn/Q3Gm201-normal","follow":15832,"play_count":0,"play_true":0,"fans":0,"block_image":"","max_view":0,"default_image":"","last_end_at":"1970-01-01 08:00:00","position":"资阳市","create_at":"2017-09-23 14:32:10","last_thumb":"3056249-1506079866-849.jpg","landscape":1,"category_slug":"beauty","anniversary":0,"play_status":true,"status":2,"cid":6,"coin":106150,"frame":"","link":"http://www.quanmin.tv/3056249"},{"beauty_cover":"","no":9775460,"first_play_at":"1970-01-01 08:00:00","category_name":"穿越火线","gender":1,"thumb":"http://snap.quanmin.tv/9775460-1506164885-325.jpg?imageView2/2/w/390/","oldNo":"","room_tag":"","last_play_at":"1970-01-01 08:00:00","screen":0,"video":"http://thumb.quanmin.tv/9775460.mp4?t=1506164700","title":"山西百城冠军·枪王第一 1个守护者上宗师","recommend_image":"","is_shield":false,"nick":"Minecy枫","uid":9775460,"view":"52082","category_id":26,"stream":"http://flv.quanmin.tv/live/9775460_L3.flv","slug":"v1cy","live_thumb":"http://snap.quanmin.tv/9775460-1506164885-325.jpg?imageView2/2/w/390/","love_cover":"","level":0,"like":0,"video_quality":"432","weight":0,"starlight":218392,"check":true,"avatar":"http://a.img.shouyintv.cn/Mfb3201-normal","follow":45763,"play_count":0,"play_true":0,"fans":0,"block_image":"","max_view":0,"default_image":"","last_end_at":"1970-01-01 08:00:00","position":"","create_at":"2017-09-23 15:13:07","last_thumb":"9775460-1506099725-879.jpg","landscape":1,"category_slug":"cfpc","anniversary":0,"play_status":true,"status":2,"cid":6,"coin":218392,"frame":"","link":"http://www.quanmin.tv/v/v1cy"},{"first_play_at":"1970-01-01 08:00:00","category_name":"全民户外","oldNo":"","room_tag":"猎奇","recommend_new_image":"http://static01.quanmin.tv/201709/751ac230-e873-4344-928f-ac5680dde937.jpg","screen":0,"view":"45234","slug":"","live_thumb":"http://snap.quanmin.tv/9264931-1506164885-629.jpg?imageView2/2/w/390/","love_cover":"","level":0,"like":0,"video_quality":"","weight":0,"starlight":3498,"check":true,"play_count":0,"play_true":0,"block_image":"","default_image":"","position":"外太空","status":2,"cid":6,"coin":3498,"frame":"","beauty_cover":"","no":9264931,"gender":1,"thumb":"http://snap.quanmin.tv/9264931-1506164885-629.jpg?imageView2/2/w/390/","last_play_at":"1970-01-01 08:00:00","video":"http://thumb.quanmin.tv/9264931.mp4?t=1506164700","title":"寒冷的秋天带你们找小姐姐","recommend_image":"","is_shield":false,"nick":"黑牛","uid":9264931,"category_id":13,"stream":"http://flv.quanmin.tv/live/9264931.flv","avatar":"http://a.img.shouyintv.cn/WQrb201-normal","follow":10182,"fans":0,"max_view":0,"last_end_at":"1970-01-01 08:00:00","app_shuffling_image":"http://static01.quanmin.tv/201709/287bcbdf-8f97-42cc-ae0d-7111ed21da24.jpg","create_at":"2017-09-23 17:59:05","last_thumb":"9264931-1506087907-645.jpg","landscape":1,"category_slug":"huwai","anniversary":0,"play_status":true,"link":"http://www.quanmin.tv/9264931"},{"beauty_cover":"","no":22034381,"first_play_at":"1970-01-01 08:00:00","category_name":"DNF","gender":0,"thumb":"http://snap.quanmin.tv/1087933550-1506164928-881.jpg?imageView2/2/w/390/","oldNo":"","room_tag":"","last_play_at":"1970-01-01 08:00:00","screen":0,"video":"http://thumb.quanmin.tv/1087933550.mp4?t=1506164700","title":"落落：十里春风不如你","recommend_image":"","is_shield":false,"nick":"Only丶落落","uid":1087933550,"view":"16666","category_id":10,"stream":"http://flv.quanmin.tv/live/1087933550.flv","slug":null,"live_thumb":"http://snap.quanmin.tv/1087933550-1506164928-881.jpg?imageView2/2/w/390/","love_cover":"","level":0,"like":0,"video_quality":null,"weight":0,"starlight":36046,"check":true,"avatar":"http://a.img.shouyintv.cn/qtbr203-normal","follow":8723,"play_count":0,"play_true":0,"fans":0,"block_image":"","max_view":0,"default_image":"","last_end_at":"1970-01-01 08:00:00","position":"外太空","create_at":"2017-09-23 15:25:00","last_thumb":"1087933550-1506091240-41.jpg","landscape":1,"category_slug":"dnf","anniversary":0,"play_status":true,"status":2,"cid":6,"coin":36046,"frame":"","link":"http://www.quanmin.tv/22034381"}]
         */

        private int id;
        private String name;
        private int is_default;
        private String icon;
        private String slug;
        private String category_more;
        private int type;
        private int screen;
        private List<ListBean> list;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getIs_default() {
            return is_default;
        }

        public void setIs_default(int is_default) {
            this.is_default = is_default;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getCategory_more() {
            return category_more;
        }

        public void setCategory_more(String category_more) {
            this.category_more = category_more;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getScreen() {
            return screen;
        }

        public void setScreen(int screen) {
            this.screen = screen;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * beauty_cover : http://static01.quanmin.tv/201709/d2387087-74f3-480b-84d7-36ba9993d02a.jpg
             * no : 14844829
             * first_play_at : 1970-01-01 08:00:00
             * category_name : 王者荣耀
             * gender : 1
             * thumb : http://static01.quanmin.tv/201709/d2387087-74f3-480b-84d7-36ba9993d02a.jpg
             * oldNo :
             * room_tag :
             * last_play_at : 1970-01-01 08:00:00
             * screen : 0
             * video : http://thumb.quanmin.tv/2044312096.mp4?t=1506164700
             * title : 王者荣耀巅峰挑战赛 半决赛！
             * recommend_image :
             * is_shield : false
             * nick : 队长骚小年
             * uid : 2044312096
             * view : 250475
             * category_id : 17
             * stream : http://flv.quanmin.tv/live/2044312096.flv
             * slug : null
             * live_thumb : http://snap.quanmin.tv/2044312096-1506164916-393.jpg?imageView2/2/w/390/
             * love_cover : http://static01.quanmin.tv/201709/d2387087-74f3-480b-84d7-36ba9993d02a.jpg
             * level : 0
             * like : 0
             * video_quality :
             * weight : 0
             * starlight : 81492
             * check : true
             * avatar : http://a.img.shouyintv.cn/oNik101-normal
             * follow : 59038
             * play_count : 0
             * play_true : 0
             * fans : 0
             * block_image :
             * max_view : 0
             * default_image :
             * last_end_at : 1970-01-01 08:00:00
             * position : 外太空
             * create_at : 2017-09-23 16:52:01
             * last_thumb : 2044312096-1506087275-190.jpg
             * landscape : 1
             * category_slug : wangzhe
             * anniversary : 0
             * play_status : true
             * status : 2
             * cid : 6
             * coin : 81492
             * frame :
             * link : http://www.quanmin.tv/14844829
             * recommend_new_image : http://static01.quanmin.tv/201709/751ac230-e873-4344-928f-ac5680dde937.jpg
             * app_shuffling_image : http://static01.quanmin.tv/201709/287bcbdf-8f97-42cc-ae0d-7111ed21da24.jpg
             */

            private String beauty_cover;
            private int no;
            private String first_play_at;
            private String category_name;
            private int gender;
            private String thumb;
            private String oldNo;
            private String room_tag;
            private String last_play_at;
            private int screen;
            private String video;
            private String title;
            private String recommend_image;
            private boolean is_shield;
            private String nick;
            private int uid;
            private String view;
            private int category_id;
            private String stream;
            private Object slug;
            private String live_thumb;
            private String love_cover;
            private int level;
            private int like;
            private String video_quality;
            private int weight;
            private int starlight;
            private boolean check;
            private String avatar;
            private int follow;
            private int play_count;
            private int play_true;
            private int fans;
            private String block_image;
            private int max_view;
            private String default_image;
            private String last_end_at;
            private String position;
            private String create_at;
            private String last_thumb;
            private int landscape;
            private String category_slug;
            private int anniversary;
            private boolean play_status;
            private int status;
            private int cid;
            private int coin;
            private String frame;
            private String link;
            private String recommend_new_image;
            private String app_shuffling_image;

            public String getBeauty_cover() {
                return beauty_cover;
            }

            public void setBeauty_cover(String beauty_cover) {
                this.beauty_cover = beauty_cover;
            }

            public int getNo() {
                return no;
            }

            public void setNo(int no) {
                this.no = no;
            }

            public String getFirst_play_at() {
                return first_play_at;
            }

            public void setFirst_play_at(String first_play_at) {
                this.first_play_at = first_play_at;
            }

            public String getCategory_name() {
                return category_name;
            }

            public void setCategory_name(String category_name) {
                this.category_name = category_name;
            }

            public int getGender() {
                return gender;
            }

            public void setGender(int gender) {
                this.gender = gender;
            }

            public String getThumb() {
                return thumb;
            }

            public void setThumb(String thumb) {
                this.thumb = thumb;
            }

            public String getOldNo() {
                return oldNo;
            }

            public void setOldNo(String oldNo) {
                this.oldNo = oldNo;
            }

            public String getRoom_tag() {
                return room_tag;
            }

            public void setRoom_tag(String room_tag) {
                this.room_tag = room_tag;
            }

            public String getLast_play_at() {
                return last_play_at;
            }

            public void setLast_play_at(String last_play_at) {
                this.last_play_at = last_play_at;
            }

            public int getScreen() {
                return screen;
            }

            public void setScreen(int screen) {
                this.screen = screen;
            }

            public String getVideo() {
                return video;
            }

            public void setVideo(String video) {
                this.video = video;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getRecommend_image() {
                return recommend_image;
            }

            public void setRecommend_image(String recommend_image) {
                this.recommend_image = recommend_image;
            }

            public boolean isIs_shield() {
                return is_shield;
            }

            public void setIs_shield(boolean is_shield) {
                this.is_shield = is_shield;
            }

            public String getNick() {
                return nick;
            }

            public void setNick(String nick) {
                this.nick = nick;
            }

            public int getUid() {
                return uid;
            }

            public void setUid(int uid) {
                this.uid = uid;
            }

            public String getView() {
                return view;
            }

            public String getViews(){

                try {
                    int views = Integer.parseInt(view);
                    return DecimalFormatUtil.formatW(views);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return view;
            }

            public void setView(String view) {
                this.view = view;
            }

            public int getCategory_id() {
                return category_id;
            }

            public void setCategory_id(int category_id) {
                this.category_id = category_id;
            }

            public String getStream() {
                return stream;
            }

            public void setStream(String stream) {
                this.stream = stream;
            }

            public Object getSlug() {
                return slug;
            }

            public void setSlug(Object slug) {
                this.slug = slug;
            }

            public String getLive_thumb() {
                return live_thumb;
            }

            public void setLive_thumb(String live_thumb) {
                this.live_thumb = live_thumb;
            }

            public String getLove_cover() {
                return love_cover;
            }

            public void setLove_cover(String love_cover) {
                this.love_cover = love_cover;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public int getLike() {
                return like;
            }

            public void setLike(int like) {
                this.like = like;
            }

            public String getVideo_quality() {
                return video_quality;
            }

            public void setVideo_quality(String video_quality) {
                this.video_quality = video_quality;
            }

            public int getWeight() {
                return weight;
            }

            public void setWeight(int weight) {
                this.weight = weight;
            }

            public int getStarlight() {
                return starlight;
            }

            public void setStarlight(int starlight) {
                this.starlight = starlight;
            }

            public boolean isCheck() {
                return check;
            }

            public void setCheck(boolean check) {
                this.check = check;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public int getPlay_count() {
                return play_count;
            }

            public void setPlay_count(int play_count) {
                this.play_count = play_count;
            }

            public int getPlay_true() {
                return play_true;
            }

            public void setPlay_true(int play_true) {
                this.play_true = play_true;
            }

            public int getFans() {
                return fans;
            }

            public void setFans(int fans) {
                this.fans = fans;
            }

            public String getBlock_image() {
                return block_image;
            }

            public void setBlock_image(String block_image) {
                this.block_image = block_image;
            }

            public int getMax_view() {
                return max_view;
            }

            public void setMax_view(int max_view) {
                this.max_view = max_view;
            }

            public String getDefault_image() {
                return default_image;
            }

            public void setDefault_image(String default_image) {
                this.default_image = default_image;
            }

            public String getLast_end_at() {
                return last_end_at;
            }

            public void setLast_end_at(String last_end_at) {
                this.last_end_at = last_end_at;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public String getCreate_at() {
                return create_at;
            }

            public void setCreate_at(String create_at) {
                this.create_at = create_at;
            }

            public String getLast_thumb() {
                return last_thumb;
            }

            public void setLast_thumb(String last_thumb) {
                this.last_thumb = last_thumb;
            }

            public int getLandscape() {
                return landscape;
            }

            public void setLandscape(int landscape) {
                this.landscape = landscape;
            }

            public String getCategory_slug() {
                return category_slug;
            }

            public void setCategory_slug(String category_slug) {
                this.category_slug = category_slug;
            }

            public int getAnniversary() {
                return anniversary;
            }

            public void setAnniversary(int anniversary) {
                this.anniversary = anniversary;
            }

            public boolean isPlay_status() {
                return play_status;
            }

            public void setPlay_status(boolean play_status) {
                this.play_status = play_status;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getCid() {
                return cid;
            }

            public void setCid(int cid) {
                this.cid = cid;
            }

            public int getCoin() {
                return coin;
            }

            public void setCoin(int coin) {
                this.coin = coin;
            }

            public String getFrame() {
                return frame;
            }

            public void setFrame(String frame) {
                this.frame = frame;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getRecommend_new_image() {
                return recommend_new_image;
            }

            public void setRecommend_new_image(String recommend_new_image) {
                this.recommend_new_image = recommend_new_image;
            }

            public String getApp_shuffling_image() {
                return app_shuffling_image;
            }

            public void setApp_shuffling_image(String app_shuffling_image) {
                this.app_shuffling_image = app_shuffling_image;
            }
        }
    }
}
