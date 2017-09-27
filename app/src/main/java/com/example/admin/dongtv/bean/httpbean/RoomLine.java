package com.example.admin.dongtv.bean.httpbean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 2017/9/23.
 */

public class RoomLine {

    /**
     * name : al
     * flv : {"3":{"name":"标清","src":"http://liveal.quanmin.tv/live/2333_quanmin576.flv"},"4":{"name":"高清","src":"http://liveal.quanmin.tv/live/2333_quanmin720.flv"},"5":{"name":"超清","src":"http://liveal.quanmin.tv/live/2333.flv"},"main_mobile":3,"main_pc":4}
     * def_mobile : flv
     * def_pc : flv
     * v : 1
     */

    private String name;
    private FlvBean flv;
    private String def_mobile;
    private String def_pc;
    private String v;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FlvBean getFlv() {
        return flv;
    }

    public void setFlv(FlvBean flv) {
        this.flv = flv;
    }

    public String getDef_mobile() {
        return def_mobile;
    }

    public void setDef_mobile(String def_mobile) {
        this.def_mobile = def_mobile;
    }

    public String getDef_pc() {
        return def_pc;
    }

    public void setDef_pc(String def_pc) {
        this.def_pc = def_pc;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public static class FlvBean {
        /**
         * 3 : {"name":"标清","src":"http://liveal.quanmin.tv/live/2333_quanmin576.flv"}
         * 4 : {"name":"高清","src":"http://liveal.quanmin.tv/live/2333_quanmin720.flv"}
         * 5 : {"name":"超清","src":"http://liveal.quanmin.tv/live/2333.flv"}
         * main_mobile : 3
         * main_pc : 4
         */

        @SerializedName("3")
        private _$3Bean _$3;
        @SerializedName("4")
        private _$4Bean _$4;
        @SerializedName("5")
        private _$5Bean _$5;
        private int main_mobile;
        private int main_pc;

        public _$3Bean get_$3() {
            return _$3;
        }

        public void set_$3(_$3Bean _$3) {
            this._$3 = _$3;
        }

        public _$4Bean get_$4() {
            return _$4;
        }

        public void set_$4(_$4Bean _$4) {
            this._$4 = _$4;
        }

        public _$5Bean get_$5() {
            return _$5;
        }

        public void set_$5(_$5Bean _$5) {
            this._$5 = _$5;
        }

        public int getMain_mobile() {
            return main_mobile;
        }

        public void setMain_mobile(int main_mobile) {
            this.main_mobile = main_mobile;
        }

        public int getMain_pc() {
            return main_pc;
        }

        public void setMain_pc(int main_pc) {
            this.main_pc = main_pc;
        }

        public static class _$3Bean {
            /**
             * name : 标清
             * src : http://liveal.quanmin.tv/live/2333_quanmin576.flv
             */

            private String name;
            private String src;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getSrc() {
                return src;
            }

            public void setSrc(String src) {
                this.src = src;
            }
        }

        public static class _$4Bean {
            /**
             * name : 高清
             * src : http://liveal.quanmin.tv/live/2333_quanmin720.flv
             */

            private String name;
            private String src;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getSrc() {
                return src;
            }

            public void setSrc(String src) {
                this.src = src;
            }
        }

        public static class _$5Bean {
            /**
             * name : 超清
             * src : http://liveal.quanmin.tv/live/2333.flv
             */

            private String name;
            private String src;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getSrc() {
                return src;
            }

            public void setSrc(String src) {
                this.src = src;
            }
        }
    }
}
