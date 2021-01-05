package com.henau.nileigee.service.impl;

import com.henau.nileigee.carInfo;
import com.henau.nileigee.dao.carInfoMapper;
import com.henau.nileigee.service.carInfoService;

import java.io.IOException;
import java.util.List;

public class carInfoServiceImpl implements carInfoService {
    private carInfoMapper carInfoMapper1;

    public void setCarInfoMapper1(carInfoMapper carInfoMapper1) {
        this.carInfoMapper1 = carInfoMapper1;
    }

    public List<carInfo> queryAllCars() throws IOException {
        List<carInfo> cars = carInfoMapper1.queryAllCars();
        return cars;
    }
}
