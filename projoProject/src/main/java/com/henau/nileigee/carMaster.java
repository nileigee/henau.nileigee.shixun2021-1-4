package com.henau.nileigee;
import java.util.Objects;

public class carMaster {
    private int carMasterId;
    private String carMasterName;
    private String carMasterPhoneNum;
    private String carMasterPassword;

    public carMaster() {
    }

    public carMaster(int carMasterId, String carMasterName, String carMasterPhoneNum, String carMasterPassword) {
        this.carMasterId = carMasterId;
        this.carMasterName = carMasterName;
        this.carMasterPhoneNum = carMasterPhoneNum;
        this.carMasterPassword = carMasterPassword;
    }

    public int getCarMasterId() {
        return carMasterId;
    }

    public void setCarMasterId(int carMasterId) {
        this.carMasterId = carMasterId;
    }

    public String getCarMasterName() {
        return carMasterName;
    }

    public void setCarMasterName(String carMasterName) {
        this.carMasterName = carMasterName;
    }

    public String getCarMasterPhoneNum() {
        return carMasterPhoneNum;
    }

    public void setCarMasterPhoneNum(String carMasterPhoneNum) {
        this.carMasterPhoneNum = carMasterPhoneNum;
    }

    public String getCarMasterPassword() {
        return carMasterPassword;
    }

    public void setCarMasterPassword(String carMasterPassword) {
        this.carMasterPassword = carMasterPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        carMaster carMaster = (carMaster) o;
        return carMasterId == carMaster.carMasterId &&
                Objects.equals(carMasterName, carMaster.carMasterName) &&
                Objects.equals(carMasterPhoneNum, carMaster.carMasterPhoneNum) &&
                Objects.equals(carMasterPassword, carMaster.carMasterPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carMasterId, carMasterName, carMasterPhoneNum, carMasterPassword);
    }

    @Override
    public String toString() {
        return "carMaster{" +
                "carMasterId=" + carMasterId +
                ", carMasterName='" + carMasterName + '\'' +
                ", carMasterPhoneNum='" + carMasterPhoneNum + '\'' +
                ", carMasterPassword='" + carMasterPassword + '\'' +
                '}';
    }
}

