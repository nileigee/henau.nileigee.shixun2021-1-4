package com.henau.nileigee;

import java.util.List;

public interface carInfoDao {
    List<carInfo> queryAllCar();
    carInfo queryCarById();
    int addCar(carInfo car);
    int delCar(carInfo car);
}
