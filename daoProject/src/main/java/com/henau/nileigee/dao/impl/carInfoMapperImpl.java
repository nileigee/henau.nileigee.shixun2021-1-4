package com.henau.nileigee.dao.impl;

import com.henau.nileigee.carInfo;
import com.henau.nileigee.dao.carInfoMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class carInfoMapperImpl implements carInfoMapper {
    public List<carInfo> queryAllCars() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<carInfo> cars = sqlSession.selectList("carInfoMapper.queryAllCars");
        return cars;
    }
}
