package com.henau.nileigee;
import java.util.Objects;

public class carInfo {
    private int carId;
    private String carName;
    private String carColor;
    private String carType;
    private int belongCompany;
    private int seatNum;
    private String carStatus;
    private int carMasterId;
    private int provinceId;
    private int cityId;
    private int countyId;
    private int fleetId;

    public carInfo() {
    }

    public carInfo(int carId, String carName, String carColor, String carType, int belongCompany, int seatNum, String carStatus, int carMasterId, int provinceId, int cityId, int countyId) {
        this.carId = carId;
        this.carName = carName;
        this.carColor = carColor;
        this.carType = carType;
        this.belongCompany = belongCompany;
        this.seatNum = seatNum;
        this.carStatus = carStatus;
        this.carMasterId = carMasterId;
        this.provinceId = provinceId;
        this.cityId = cityId;
        this.countyId = countyId;
    }

    public carInfo(int carId, String carName, String carColor, String carType, int belongCompany, int seatNum, String carStatus, int carMasterId, int provinceId, int cityId, int countyId, int fleetId) {
        this.carId = carId;
        this.carName = carName;
        this.carColor = carColor;
        this.carType = carType;
        this.belongCompany = belongCompany;
        this.seatNum = seatNum;
        this.carStatus = carStatus;
        this.carMasterId = carMasterId;
        this.provinceId = provinceId;
        this.cityId = cityId;
        this.countyId = countyId;
        this.fleetId = fleetId;
    }

    public int getFleetId() {
        return fleetId;
    }

    public void setFleetId(int fleetId) {
        this.fleetId = fleetId;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getBelongCompany() {
        return belongCompany;
    }

    public void setBelongCompany(int belongCompany) {
        this.belongCompany = belongCompany;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public String getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(String carStatus) {
        this.carStatus = carStatus;
    }

    public int getCarMasterId() {
        return carMasterId;
    }

    public void setCarMasterId(int carMasterId) {
        this.carMasterId = carMasterId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        carInfo carInfo = (carInfo) o;
        return carId == carInfo.carId &&
                belongCompany == carInfo.belongCompany &&
                seatNum == carInfo.seatNum &&
                carMasterId == carInfo.carMasterId &&
                provinceId == carInfo.provinceId &&
                cityId == carInfo.cityId &&
                countyId == carInfo.countyId &&
                Objects.equals(carName, carInfo.carName) &&
                Objects.equals(carColor, carInfo.carColor) &&
                Objects.equals(carType, carInfo.carType) &&
                Objects.equals(carStatus, carInfo.carStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carId, carName, carColor, carType, belongCompany, seatNum, carStatus, carMasterId, provinceId, cityId, countyId);
    }

    @Override
    public String toString() {
        return "carInfo{" +
                "carId=" + carId +
                ", carName='" + carName + '\'' +
                ", carColor='" + carColor + '\'' +
                ", carType='" + carType + '\'' +
                ", belongCompany=" + belongCompany +
                ", seatNum=" + seatNum +
                ", carStatus='" + carStatus + '\'' +
                ", carMasterId=" + carMasterId +
                ", provinceId=" + provinceId +
                ", cityId=" + cityId +
                ", countyId=" + countyId +
                ", fleetId=" + fleetId +
                '}';
    }
}