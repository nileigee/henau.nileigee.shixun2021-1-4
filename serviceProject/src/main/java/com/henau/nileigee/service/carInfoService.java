package com.henau.nileigee.service;

import com.henau.nileigee.carInfo;

import java.io.IOException;
import java.util.List;

public interface carInfoService {
    public List<carInfo> queryAllCars() throws IOException;
}
