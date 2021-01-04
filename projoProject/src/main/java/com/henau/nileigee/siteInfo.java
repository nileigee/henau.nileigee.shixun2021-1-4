package com.henau.nileigee;

public class siteInfo {
    private int siteId;
    private String siteName;
    private String siteDirection;
    private String siteType;
    private double siteInLongitude;
    private double siteInLatitude;
    private double siteLongitude;
    private double siteLatitude;
    private double siteOutLongitude;
    private double siteOutLatitude;
    private double limitSpeed;
    private int provinceId;
    private int cityId;
    private int countyId;
    private String describe;

    public siteInfo() {
    }

    public siteInfo(int siteId, String siteName, String siteDirection, String siteType, double siteInLongitude, double siteInLatitude, double siteLongitude, double siteLatitude, double siteOutLongitude, double siteOutLatitude, double limitSpeed, int provinceId, int cityId, int countyId, String describe) {
        this.siteId = siteId;
        this.siteName = siteName;
        this.siteDirection = siteDirection;
        this.siteType = siteType;
        this.siteInLongitude = siteInLongitude;
        this.siteInLatitude = siteInLatitude;
        this.siteLongitude = siteLongitude;
        this.siteLatitude = siteLatitude;
        this.siteOutLongitude = siteOutLongitude;
        this.siteOutLatitude = siteOutLatitude;
        this.limitSpeed = limitSpeed;
        this.provinceId = provinceId;
        this.cityId = cityId;
        this.countyId = countyId;
        this.describe = describe;
    }

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSiteDirection() {
        return siteDirection;
    }

    public void setSiteDirection(String siteDirection) {
        this.siteDirection = siteDirection;
    }

    public String getSiteType() {
        return siteType;
    }

    public void setSiteType(String siteType) {
        this.siteType = siteType;
    }

    public double getSiteInLongitude() {
        return siteInLongitude;
    }

    public void setSiteInLongitude(double siteInLongitude) {
        this.siteInLongitude = siteInLongitude;
    }

    public double getSiteInLatitude() {
        return siteInLatitude;
    }

    public void setSiteInLatitude(double siteInLatitude) {
        this.siteInLatitude = siteInLatitude;
    }

    public double getSiteLongitude() {
        return siteLongitude;
    }

    public void setSiteLongitude(double siteLongitude) {
        this.siteLongitude = siteLongitude;
    }

    public double getSiteLatitude() {
        return siteLatitude;
    }

    public void setSiteLatitude(double siteLatitude) {
        this.siteLatitude = siteLatitude;
    }

    public double getSiteOutLongitude() {
        return siteOutLongitude;
    }

    public void setSiteOutLongitude(double siteOutLongitude) {
        this.siteOutLongitude = siteOutLongitude;
    }

    public double getSiteOutLatitude() {
        return siteOutLatitude;
    }

    public void setSiteOutLatitude(double siteOutLatitude) {
        this.siteOutLatitude = siteOutLatitude;
    }

    public double getLimitSpeed() {
        return limitSpeed;
    }

    public void setLimitSpeed(double limitSpeed) {
        this.limitSpeed = limitSpeed;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getCountyId() {
        return countyId;
    }

    public void setCountyId(int countyId) {
        this.countyId = countyId;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "siteInfo{" +
                "siteId=" + siteId +
                ", siteName='" + siteName + '\'' +
                ", siteDirection='" + siteDirection + '\'' +
                ", siteType='" + siteType + '\'' +
                ", siteInLongitude=" + siteInLongitude +
                ", siteInLatitude=" + siteInLatitude +
                ", siteLongitude=" + siteLongitude +
                ", siteLatitude=" + siteLatitude +
                ", siteOutLongitude=" + siteOutLongitude +
                ", siteOutLatitude=" + siteOutLatitude +
                ", limitSpeed=" + limitSpeed +
                ", provinceId=" + provinceId +
                ", cityId=" + cityId +
                ", countyId=" + countyId +
                ", describe='" + describe + '\'' +
                '}';
    }
}
