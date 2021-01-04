package com.henau.nileigee;

public class routeInfo {
    private int routeId;
    private String routeName;
    private String routeType;
    private String belongCompany;
    private String routeStatus;
    private double routeUpDistance;
    private double routeDownDistance;
    private String routeUpStartTime;
    private String routeUpEndTime;
    private String routeDownStartTime;
    private String routeDownEndTime;

    public routeInfo() {
    }

    public routeInfo(int routeId, String routeName, String routeType, String belongCompany, String routeStatus, double routeUpDistance, double routeDownDistance, String routeUpStartTime, String routeUpEndTime, String routeDownStartTime, String routeDownEndTime) {
        this.routeId = routeId;
        this.routeName = routeName;
        this.routeType = routeType;
        this.belongCompany = belongCompany;
        this.routeStatus = routeStatus;
        this.routeUpDistance = routeUpDistance;
        this.routeDownDistance = routeDownDistance;
        this.routeUpStartTime = routeUpStartTime;
        this.routeUpEndTime = routeUpEndTime;
        this.routeDownStartTime = routeDownStartTime;
        this.routeDownEndTime = routeDownEndTime;
    }

    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String getRouteType() {
        return routeType;
    }

    public void setRouteType(String routeType) {
        this.routeType = routeType;
    }

    public String getBelongCompany() {
        return belongCompany;
    }

    public void setBelongCompany(String belongCompany) {
        this.belongCompany = belongCompany;
    }

    public String getRouteStatus() {
        return routeStatus;
    }

    public void setRouteStatus(String routeStatus) {
        this.routeStatus = routeStatus;
    }

    public double getRouteUpDistance() {
        return routeUpDistance;
    }

    public void setRouteUpDistance(double routeUpDistance) {
        this.routeUpDistance = routeUpDistance;
    }

    public double getRouteDownDistance() {
        return routeDownDistance;
    }

    public void setRouteDownDistance(double routeDownDistance) {
        this.routeDownDistance = routeDownDistance;
    }

    public String getRouteUpStartTime() {
        return routeUpStartTime;
    }

    public void setRouteUpStartTime(String routeUpStartTime) {
        this.routeUpStartTime = routeUpStartTime;
    }

    public String getRouteUpEndTime() {
        return routeUpEndTime;
    }

    public void setRouteUpEndTime(String routeUpEndTime) {
        this.routeUpEndTime = routeUpEndTime;
    }

    public String getRouteDownStartTime() {
        return routeDownStartTime;
    }

    public void setRouteDownStartTime(String routeDownStartTime) {
        this.routeDownStartTime = routeDownStartTime;
    }

    public String getRouteDownEndTime() {
        return routeDownEndTime;
    }

    public void setRouteDownEndTime(String routeDownEndTime) {
        this.routeDownEndTime = routeDownEndTime;
    }

    @Override
    public String toString() {
        return "routeInfo{" +
                "routeId=" + routeId +
                ", routeName='" + routeName + '\'' +
                ", routeType='" + routeType + '\'' +
                ", belongCompany='" + belongCompany + '\'' +
                ", routeStatus='" + routeStatus + '\'' +
                ", routeUpDistance=" + routeUpDistance +
                ", routeDownDistance=" + routeDownDistance +
                ", routeUpStartTime='" + routeUpStartTime + '\'' +
                ", routeUpEndTime='" + routeUpEndTime + '\'' +
                ", routeDownStartTime='" + routeDownStartTime + '\'' +
                ", routeDownEndTime='" + routeDownEndTime + '\'' +
                '}';
    }
}
