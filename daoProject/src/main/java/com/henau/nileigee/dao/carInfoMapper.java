package com.henau.nileigee.dao;

import com.henau.nileigee.carInfo;

import java.io.IOException;
import java.util.List;

public interface carInfoMapper {
    public List<carInfo> queryAllCars() throws IOException;
}
