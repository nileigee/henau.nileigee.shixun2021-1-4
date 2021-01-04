package com.henau.nileigee;

public class fleetMaster {
    private int fleetMasterId;
    private String fleetMasterName;
    private String fleetMasterPhoneNum;
    private String fleetMasterPassword;

    public fleetMaster() {
    }

    public fleetMaster(int fleetMasterId, String fleetMasterName, String fleetMasterPhoneNum, String fleetMasterPassword) {
        this.fleetMasterId = fleetMasterId;
        this.fleetMasterName = fleetMasterName;
        this.fleetMasterPhoneNum = fleetMasterPhoneNum;
        this.fleetMasterPassword = fleetMasterPassword;
    }

    public int getFleetMasterId() {
        return fleetMasterId;
    }

    public void setFleetMasterId(int fleetMasterId) {
        this.fleetMasterId = fleetMasterId;
    }

    public String getFleetMasterName() {
        return fleetMasterName;
    }

    public void setFleetMasterName(String fleetMasterName) {
        this.fleetMasterName = fleetMasterName;
    }

    public String getFleetMasterPhoneNum() {
        return fleetMasterPhoneNum;
    }

    public void setFleetMasterPhoneNum(String fleetMasterPhoneNum) {
        this.fleetMasterPhoneNum = fleetMasterPhoneNum;
    }

    public String getFleetMasterPassword() {
        return fleetMasterPassword;
    }

    public void setFleetMasterPassword(String fleetMasterPassword) {
        this.fleetMasterPassword = fleetMasterPassword;
    }

    @Override
    public String toString() {
        return "fleetMaster{" +
                "fleetMasterId=" + fleetMasterId +
                ", fleetMasterName='" + fleetMasterName + '\'' +
                ", fleetMasterPhoneNum='" + fleetMasterPhoneNum + '\'' +
                ", fleetMasterPassword='" + fleetMasterPassword + '\'' +
                '}';
    }
}
