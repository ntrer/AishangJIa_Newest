package com.shushang.aishangjia.Bean;

import java.io.Serializable;
import java.util.List;

public class ActivityListNew {


    /**
     * ret : 200
     * msg : success
     * data : null
     * dataList : [{"activityId":"402880b7671b255b01671bbf9a680053","activityCode":1196,"activityName":"完整10","eventStart":1541001600000,"eventEnd":1543593599000,"sellCardStart":1541001600000,"sellCardEnd":1543593599000,"sceneStart":1541001600000,"sceneEnd":1543593599000,"chuangjianren":"402880b7653b275e01653b68e4d00046","xiugairen":"402880b7653b275e01653b68e4d00046","cjsj":1542358801000,"xgsj":1542358801000,"del":"0","active":"1","merchantId":"402880b7653b275e01653b68e4cf0045","merchants":[{"merchantId":"402880b766aa93900166adec396a006f","merchantCode":"testsh12","merchantName":"测试商户11万达中心","merchantNum":73,"merchantNickName":"万达中心","shengCode":"140000","shiCode":"140100","quCode":"140101","shengName":"山西省","shiName":"太原市","quName":"市辖区","address":"720","telphone":"123123","managerphone":"13333333333","active":"1","startTime":1538323200000,"endTime":1572537599000,"industryType":"1","induttryCategoryName":"卫浴洁具","industryCategory":"8","industryCategorySubName":"整体卫浴","sortId":0,"type":"2","chuangjianren":"asdfghjkl123qwertg","xiugairen":"asdfghjkl123qwertg","cjsj":1540516232000,"xgsj":1540516232000,"del":"0","imageIds":"402880b766aa93900166adebb3fb006e","imgaes":null,"merchantInfo":"1","merchantHours":"2","merchantVersion":"2","versionStartDate":1538323200000,"versionEndDate":1541001599000,"merchants":null,"leagueTotal":null,"leagueDataEnable":null},{"merchantId":"402880b766aa46090166aa714e860047","merchantCode":"lmsj2","merchantName":"联盟商家2黄河路","merchantNum":71,"merchantNickName":"黄河路","shengCode":"140000","shiCode":"140400","quCode":"140411","shengName":"山西省","shiName":"长治市","quName":"郊区","address":"朝阳路","telphone":"13111111111","managerphone":"13111111111","active":"1","startTime":1538323200000,"endTime":1543593599000,"industryType":"4","induttryCategoryName":"五金水暖","industryCategory":"51","industryCategorySubName":"锁具","sortId":0,"type":"2","chuangjianren":"asdfghjkl123qwertg","xiugairen":"asdfghjkl123qwertg","cjsj":1540457844000,"xgsj":1540978358000,"del":"0","imageIds":"402880b766aa46090166aa710dbf0046","imgaes":null,"merchantInfo":"","merchantHours":"","merchantVersion":"2","versionStartDate":1538323200000,"versionEndDate":1543593599000,"merchants":null,"leagueTotal":null,"leagueDataEnable":null}],"coverImageId":"402880b7671b255b01671bbf8fb80052","shengCode":"420000","shengName":"湖北省","shiCode":"420100","shiName":"武汉市","quCode":null,"quName":null,"qdjpname":"啊","yxjpname":"啊","isUnderLine":"1","isCheck":"0","createState":"1"}]
     * currentPage : 0
     * totalCount : 0
     * maxPage : 0
     * pageSize : 0
     * intcurrentPage : 0
     * intpageSize : 0
     * intmaxCount : 0
     * intmaxPage : 0
     */

    private String ret;
    private String msg;
    private Object data;
    private int currentPage;
    private int totalCount;
    private int maxPage;
    private int pageSize;
    private int intcurrentPage;
    private int intpageSize;
    private int intmaxCount;
    private int intmaxPage;
    private List<DataListBean> dataList;

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getMaxPage() {
        return maxPage;
    }

    public void setMaxPage(int maxPage) {
        this.maxPage = maxPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getIntcurrentPage() {
        return intcurrentPage;
    }

    public void setIntcurrentPage(int intcurrentPage) {
        this.intcurrentPage = intcurrentPage;
    }

    public int getIntpageSize() {
        return intpageSize;
    }

    public void setIntpageSize(int intpageSize) {
        this.intpageSize = intpageSize;
    }

    public int getIntmaxCount() {
        return intmaxCount;
    }

    public void setIntmaxCount(int intmaxCount) {
        this.intmaxCount = intmaxCount;
    }

    public int getIntmaxPage() {
        return intmaxPage;
    }

    public void setIntmaxPage(int intmaxPage) {
        this.intmaxPage = intmaxPage;
    }

    public List<DataListBean> getDataList() {
        return dataList;
    }

    public void setDataList(List<DataListBean> dataList) {
        this.dataList = dataList;
    }

    public static class DataListBean implements Serializable {
        /**
         * activityId : 402880b7671b255b01671bbf9a680053
         * activityCode : 1196
         * activityName : 完整10
         * eventStart : 1541001600000
         * eventEnd : 1543593599000
         * sellCardStart : 1541001600000
         * sellCardEnd : 1543593599000
         * sceneStart : 1541001600000
         * sceneEnd : 1543593599000
         * chuangjianren : 402880b7653b275e01653b68e4d00046
         * xiugairen : 402880b7653b275e01653b68e4d00046
         * cjsj : 1542358801000
         * xgsj : 1542358801000
         * del : 0
         * active : 1
         * merchantId : 402880b7653b275e01653b68e4cf0045
         * merchants : [{"merchantId":"402880b766aa93900166adec396a006f","merchantCode":"testsh12","merchantName":"测试商户11万达中心","merchantNum":73,"merchantNickName":"万达中心","shengCode":"140000","shiCode":"140100","quCode":"140101","shengName":"山西省","shiName":"太原市","quName":"市辖区","address":"720","telphone":"123123","managerphone":"13333333333","active":"1","startTime":1538323200000,"endTime":1572537599000,"industryType":"1","induttryCategoryName":"卫浴洁具","industryCategory":"8","industryCategorySubName":"整体卫浴","sortId":0,"type":"2","chuangjianren":"asdfghjkl123qwertg","xiugairen":"asdfghjkl123qwertg","cjsj":1540516232000,"xgsj":1540516232000,"del":"0","imageIds":"402880b766aa93900166adebb3fb006e","imgaes":null,"merchantInfo":"1","merchantHours":"2","merchantVersion":"2","versionStartDate":1538323200000,"versionEndDate":1541001599000,"merchants":null,"leagueTotal":null,"leagueDataEnable":null},{"merchantId":"402880b766aa46090166aa714e860047","merchantCode":"lmsj2","merchantName":"联盟商家2黄河路","merchantNum":71,"merchantNickName":"黄河路","shengCode":"140000","shiCode":"140400","quCode":"140411","shengName":"山西省","shiName":"长治市","quName":"郊区","address":"朝阳路","telphone":"13111111111","managerphone":"13111111111","active":"1","startTime":1538323200000,"endTime":1543593599000,"industryType":"4","induttryCategoryName":"五金水暖","industryCategory":"51","industryCategorySubName":"锁具","sortId":0,"type":"2","chuangjianren":"asdfghjkl123qwertg","xiugairen":"asdfghjkl123qwertg","cjsj":1540457844000,"xgsj":1540978358000,"del":"0","imageIds":"402880b766aa46090166aa710dbf0046","imgaes":null,"merchantInfo":"","merchantHours":"","merchantVersion":"2","versionStartDate":1538323200000,"versionEndDate":1543593599000,"merchants":null,"leagueTotal":null,"leagueDataEnable":null}]
         * coverImageId : 402880b7671b255b01671bbf8fb80052
         * shengCode : 420000
         * shengName : 湖北省
         * shiCode : 420100
         * shiName : 武汉市
         * quCode : null
         * quName : null
         * qdjpname : 啊
         * yxjpname : 啊
         * isUnderLine : 1
         * isCheck : 0
         * createState : 1
         */

        private String activityId;
        private int activityCode;
        private String activityName;
        private long eventStart;
        private long eventEnd;
        private long sellCardStart;
        private long sellCardEnd;
        private long sceneStart;
        private long sceneEnd;
        private String chuangjianren;
        private String xiugairen;
        private long cjsj;
        private long xgsj;
        private String del;
        private String active;
        private String merchantId;
        private String coverImageId;
        private String shengCode;
        private String shengName;
        private String shiCode;
        private String shiName;
        private Object quCode;
        private Object quName;
        private String qdjpname;
        private String yxjpname;
        private String isUnderLine;
        private String isCheck;
        private String createState;
        private List<MerchantsBean> merchants;

        public String getActivityId() {
            return activityId;
        }

        public void setActivityId(String activityId) {
            this.activityId = activityId;
        }

        public int getActivityCode() {
            return activityCode;
        }

        public void setActivityCode(int activityCode) {
            this.activityCode = activityCode;
        }

        public String getActivityName() {
            return activityName;
        }

        public void setActivityName(String activityName) {
            this.activityName = activityName;
        }

        public long getEventStart() {
            return eventStart;
        }

        public void setEventStart(long eventStart) {
            this.eventStart = eventStart;
        }

        public long getEventEnd() {
            return eventEnd;
        }

        public void setEventEnd(long eventEnd) {
            this.eventEnd = eventEnd;
        }

        public long getSellCardStart() {
            return sellCardStart;
        }

        public void setSellCardStart(long sellCardStart) {
            this.sellCardStart = sellCardStart;
        }

        public long getSellCardEnd() {
            return sellCardEnd;
        }

        public void setSellCardEnd(long sellCardEnd) {
            this.sellCardEnd = sellCardEnd;
        }

        public long getSceneStart() {
            return sceneStart;
        }

        public void setSceneStart(long sceneStart) {
            this.sceneStart = sceneStart;
        }

        public long getSceneEnd() {
            return sceneEnd;
        }

        public void setSceneEnd(long sceneEnd) {
            this.sceneEnd = sceneEnd;
        }

        public String getChuangjianren() {
            return chuangjianren;
        }

        public void setChuangjianren(String chuangjianren) {
            this.chuangjianren = chuangjianren;
        }

        public String getXiugairen() {
            return xiugairen;
        }

        public void setXiugairen(String xiugairen) {
            this.xiugairen = xiugairen;
        }

        public long getCjsj() {
            return cjsj;
        }

        public void setCjsj(long cjsj) {
            this.cjsj = cjsj;
        }

        public long getXgsj() {
            return xgsj;
        }

        public void setXgsj(long xgsj) {
            this.xgsj = xgsj;
        }

        public String getDel() {
            return del;
        }

        public void setDel(String del) {
            this.del = del;
        }

        public String getActive() {
            return active;
        }

        public void setActive(String active) {
            this.active = active;
        }

        public String getMerchantId() {
            return merchantId;
        }

        public void setMerchantId(String merchantId) {
            this.merchantId = merchantId;
        }

        public String getCoverImageId() {
            return coverImageId;
        }

        public void setCoverImageId(String coverImageId) {
            this.coverImageId = coverImageId;
        }

        public String getShengCode() {
            return shengCode;
        }

        public void setShengCode(String shengCode) {
            this.shengCode = shengCode;
        }

        public String getShengName() {
            return shengName;
        }

        public void setShengName(String shengName) {
            this.shengName = shengName;
        }

        public String getShiCode() {
            return shiCode;
        }

        public void setShiCode(String shiCode) {
            this.shiCode = shiCode;
        }

        public String getShiName() {
            return shiName;
        }

        public void setShiName(String shiName) {
            this.shiName = shiName;
        }

        public Object getQuCode() {
            return quCode;
        }

        public void setQuCode(Object quCode) {
            this.quCode = quCode;
        }

        public Object getQuName() {
            return quName;
        }

        public void setQuName(Object quName) {
            this.quName = quName;
        }

        public String getQdjpname() {
            return qdjpname;
        }

        public void setQdjpname(String qdjpname) {
            this.qdjpname = qdjpname;
        }

        public String getYxjpname() {
            return yxjpname;
        }

        public void setYxjpname(String yxjpname) {
            this.yxjpname = yxjpname;
        }

        public String getIsUnderLine() {
            return isUnderLine;
        }

        public void setIsUnderLine(String isUnderLine) {
            this.isUnderLine = isUnderLine;
        }

        public String getIsCheck() {
            return isCheck;
        }

        public void setIsCheck(String isCheck) {
            this.isCheck = isCheck;
        }

        public String getCreateState() {
            return createState;
        }

        public void setCreateState(String createState) {
            this.createState = createState;
        }

        public List<MerchantsBean> getMerchants() {
            return merchants;
        }

        public void setMerchants(List<MerchantsBean> merchants) {
            this.merchants = merchants;
        }

        public static class MerchantsBean implements Serializable{
            /**
             * merchantId : 402880b766aa93900166adec396a006f
             * merchantCode : testsh12
             * merchantName : 测试商户11万达中心
             * merchantNum : 73
             * merchantNickName : 万达中心
             * shengCode : 140000
             * shiCode : 140100
             * quCode : 140101
             * shengName : 山西省
             * shiName : 太原市
             * quName : 市辖区
             * address : 720
             * telphone : 123123
             * managerphone : 13333333333
             * active : 1
             * startTime : 1538323200000
             * endTime : 1572537599000
             * industryType : 1
             * induttryCategoryName : 卫浴洁具
             * industryCategory : 8
             * industryCategorySubName : 整体卫浴
             * sortId : 0
             * type : 2
             * chuangjianren : asdfghjkl123qwertg
             * xiugairen : asdfghjkl123qwertg
             * cjsj : 1540516232000
             * xgsj : 1540516232000
             * del : 0
             * imageIds : 402880b766aa93900166adebb3fb006e
             * imgaes : null
             * merchantInfo : 1
             * merchantHours : 2
             * merchantVersion : 2
             * versionStartDate : 1538323200000
             * versionEndDate : 1541001599000
             * merchants : null
             * leagueTotal : null
             * leagueDataEnable : null
             */

            private String merchantId;
            private String merchantCode;
            private String merchantName;
            private int merchantNum;
            private String merchantNickName;
            private String shengCode;
            private String shiCode;
            private String quCode;
            private String shengName;
            private String shiName;
            private String quName;
            private String address;
            private String telphone;
            private String managerphone;
            private String active;
            private long startTime;
            private long endTime;
            private String industryType;
            private String induttryCategoryName;
            private String industryCategory;
            private String industryCategorySubName;
            private int sortId;
            private String type;
            private String chuangjianren;
            private String xiugairen;
            private long cjsj;
            private long xgsj;
            private String del;
            private String imageIds;
            private Object imgaes;
            private String merchantInfo;
            private String merchantHours;
            private String merchantVersion;
            private long versionStartDate;
            private long versionEndDate;
            private Object merchants;
            private Object leagueTotal;
            private Object leagueDataEnable;

            public String getMerchantId() {
                return merchantId;
            }

            public void setMerchantId(String merchantId) {
                this.merchantId = merchantId;
            }

            public String getMerchantCode() {
                return merchantCode;
            }

            public void setMerchantCode(String merchantCode) {
                this.merchantCode = merchantCode;
            }

            public String getMerchantName() {
                return merchantName;
            }

            public void setMerchantName(String merchantName) {
                this.merchantName = merchantName;
            }

            public int getMerchantNum() {
                return merchantNum;
            }

            public void setMerchantNum(int merchantNum) {
                this.merchantNum = merchantNum;
            }

            public String getMerchantNickName() {
                return merchantNickName;
            }

            public void setMerchantNickName(String merchantNickName) {
                this.merchantNickName = merchantNickName;
            }

            public String getShengCode() {
                return shengCode;
            }

            public void setShengCode(String shengCode) {
                this.shengCode = shengCode;
            }

            public String getShiCode() {
                return shiCode;
            }

            public void setShiCode(String shiCode) {
                this.shiCode = shiCode;
            }

            public String getQuCode() {
                return quCode;
            }

            public void setQuCode(String quCode) {
                this.quCode = quCode;
            }

            public String getShengName() {
                return shengName;
            }

            public void setShengName(String shengName) {
                this.shengName = shengName;
            }

            public String getShiName() {
                return shiName;
            }

            public void setShiName(String shiName) {
                this.shiName = shiName;
            }

            public String getQuName() {
                return quName;
            }

            public void setQuName(String quName) {
                this.quName = quName;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getTelphone() {
                return telphone;
            }

            public void setTelphone(String telphone) {
                this.telphone = telphone;
            }

            public String getManagerphone() {
                return managerphone;
            }

            public void setManagerphone(String managerphone) {
                this.managerphone = managerphone;
            }

            public String getActive() {
                return active;
            }

            public void setActive(String active) {
                this.active = active;
            }

            public long getStartTime() {
                return startTime;
            }

            public void setStartTime(long startTime) {
                this.startTime = startTime;
            }

            public long getEndTime() {
                return endTime;
            }

            public void setEndTime(long endTime) {
                this.endTime = endTime;
            }

            public String getIndustryType() {
                return industryType;
            }

            public void setIndustryType(String industryType) {
                this.industryType = industryType;
            }

            public String getInduttryCategoryName() {
                return induttryCategoryName;
            }

            public void setInduttryCategoryName(String induttryCategoryName) {
                this.induttryCategoryName = induttryCategoryName;
            }

            public String getIndustryCategory() {
                return industryCategory;
            }

            public void setIndustryCategory(String industryCategory) {
                this.industryCategory = industryCategory;
            }

            public String getIndustryCategorySubName() {
                return industryCategorySubName;
            }

            public void setIndustryCategorySubName(String industryCategorySubName) {
                this.industryCategorySubName = industryCategorySubName;
            }

            public int getSortId() {
                return sortId;
            }

            public void setSortId(int sortId) {
                this.sortId = sortId;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getChuangjianren() {
                return chuangjianren;
            }

            public void setChuangjianren(String chuangjianren) {
                this.chuangjianren = chuangjianren;
            }

            public String getXiugairen() {
                return xiugairen;
            }

            public void setXiugairen(String xiugairen) {
                this.xiugairen = xiugairen;
            }

            public long getCjsj() {
                return cjsj;
            }

            public void setCjsj(long cjsj) {
                this.cjsj = cjsj;
            }

            public long getXgsj() {
                return xgsj;
            }

            public void setXgsj(long xgsj) {
                this.xgsj = xgsj;
            }

            public String getDel() {
                return del;
            }

            public void setDel(String del) {
                this.del = del;
            }

            public String getImageIds() {
                return imageIds;
            }

            public void setImageIds(String imageIds) {
                this.imageIds = imageIds;
            }

            public Object getImgaes() {
                return imgaes;
            }

            public void setImgaes(Object imgaes) {
                this.imgaes = imgaes;
            }

            public String getMerchantInfo() {
                return merchantInfo;
            }

            public void setMerchantInfo(String merchantInfo) {
                this.merchantInfo = merchantInfo;
            }

            public String getMerchantHours() {
                return merchantHours;
            }

            public void setMerchantHours(String merchantHours) {
                this.merchantHours = merchantHours;
            }

            public String getMerchantVersion() {
                return merchantVersion;
            }

            public void setMerchantVersion(String merchantVersion) {
                this.merchantVersion = merchantVersion;
            }

            public long getVersionStartDate() {
                return versionStartDate;
            }

            public void setVersionStartDate(long versionStartDate) {
                this.versionStartDate = versionStartDate;
            }

            public long getVersionEndDate() {
                return versionEndDate;
            }

            public void setVersionEndDate(long versionEndDate) {
                this.versionEndDate = versionEndDate;
            }

            public Object getMerchants() {
                return merchants;
            }

            public void setMerchants(Object merchants) {
                this.merchants = merchants;
            }

            public Object getLeagueTotal() {
                return leagueTotal;
            }

            public void setLeagueTotal(Object leagueTotal) {
                this.leagueTotal = leagueTotal;
            }

            public Object getLeagueDataEnable() {
                return leagueDataEnable;
            }

            public void setLeagueDataEnable(Object leagueDataEnable) {
                this.leagueDataEnable = leagueDataEnable;
            }
        }
    }
}
