package com.henau.nileigee;

public class fleetInfo {
    private int fleetId;
    private String fleetName;
    private int fleetMasterId;
    private int belongCompany;
    private String fleetDescribe;

    public fleetInfo() {
    }

    public fleetInfo(int fleetId, String fleetName, int fleetMasterId, int belongCompany, String fleetDescribe) {
        this.fleetId = fleetId;
        this.fleetName = fleetName;
        this.fleetMasterId = fleetMasterId;
        this.belongCompany = belongCompany;
        this.fleetDescribe = fleetDescribe;
    }

    public int getFleetId() {
        return fleetId;
    }

    public void setFleetId(int fleetId) {
        this.fleetId = fleetId;
    }

    public String getFleetName() {
        return fleetName;
    }

    public void setFleetName(String fleetName) {
        this.fleetName = fleetName;
    }

    public int getFleetMasterId() {
        return fleetMasterId;
    }

    public void setFleetMasterId(int fleetMasterId) {
        this.fleetMasterId = fleetMasterId;
    }

    public int getBelongCompany() {
        return belongCompany;
    }

    public void setBelongCompany(int belongCompany) {
        this.belongCompany = belongCompany;
    }

    public String getFleetDescribe() {
        return fleetDescribe;
    }

    public void setFleetDescribe(String fleetDescribe) {
        this.fleetDescribe = fleetDescribe;
    }

    @Override
    public String toString() {
        return "fleetInfo{" +
                "fleetId=" + fleetId +
                ", fleetName='" + fleetName + '\'' +
                ", fleetMasterId=" + fleetMasterId +
                ", belongCompany=" + belongCompany +
                ", fleetDescribe='" + fleetDescribe + '\'' +
                '}';
    }
}
