package com.henau.nileigee.impl;

import com.henau.nileigee.carInfo;
import com.henau.nileigee.carInfoDao;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class carInfoDaoImpl implements carInfoDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<carInfo> queryAllCar() {
        List<carInfo> carList = jdbcTemplate.query("select * from carinfo", new BeanPropertyRowMapper<carInfo>(carInfo.class));
        System.out.println(carList);
        return carList;
    }

    public carInfo queryCarById() {
        carInfo car1 = jdbcTemplate.queryForObject("select * form carinfo where carId=?", new BeanPropertyRowMapper<carInfo>(carInfo.class), 1);

        return car1;
    }

    public int addCar(carInfo car) {
        int addNum = jdbcTemplate.update("insert into carinfo values (?,?,?,?,?,?,?,?,?,?,?,?)", null, car.getCarName(), car.getCarColor(),
                car.getCarType(), car.getBelongCompany(), car.getSeatNum(), car.getCarStatus(), car.getCarMasterId(), car.getProvinceId(),
                car.getCityId(), car.getCountyId(), car.getFleetId());
        return addNum;
    }

    public int delCar(carInfo car) {
        int delNum = jdbcTemplate.update("delete from carinfo where id=?",car.getCarId());
        return delNum;
    }
}
