package com.henau.nileigee.test;

import com.henau.nileigee.carInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class carInfoTest {

    @Test
    public void test1() throws IOException {
        //1.获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //2.获取session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //3.获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.执行操作  参数=namespace+id
        List<carInfo> carList = sqlSession.selectList("carInfoMapper.queryAllCar");

        //5.打印数据
        System.out.println(carList);
        //6.释放资源
        sqlSession.close();
    }

    @Test
    public void test2() throws IOException {

        //模拟carInfo对象
        carInfo car=new carInfo();
        car.setCarName("京A222222");
        car.setCarColor("黑色");
        car.setCarType("大客车");
        car.setBelongCompany(1);
        car.setSeatNum(15);
        car.setCarStatus("停运");
        car.setCarMasterId(1);
        car.setProvinceId(1);
        car.setCityId(1);
        car.setCountyId(1);
        car.setFleetId(1);


        //1.获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //2.获取session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //3.获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.1执行操作  参数=namespace+id
        int insert = sqlSession.insert("carInfoMapper.addCar",car);

        //4.2mybatis执行更新操作， 必须的提交事务，不然无法更新
        sqlSession.commit();

        //5.打印数据
        System.out.println(insert);
        //6.释放资源
        sqlSession.close();
    }

    @Test
    public void test3() throws IOException {

        carInfo car=new carInfo();
        car.setCarId(5);
        /*car.setCarName("京A222222");
        car.setCarColor("黑色");
        car.setCarType("大客车");*/
        car.setBelongCompany(1);
        car.setSeatNum(35);
        car.setCarStatus("运");
        car.setCarMasterId(1);
        car.setProvinceId(1);
        car.setCityId(1);
        car.setCountyId(1);
        car.setFleetId(1);

        //1.获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //2.获取session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //3.获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.执行操作  参数=namespace+id
        int update = sqlSession.update("carInfoMapper.update", car);


        //4.2mybatis执行更新操作， 必须的提交事务，不然无法更新
        sqlSession.commit();

        //5.打印数据
        System.out.println(update);
        //6.释放资源
        sqlSession.close();
    }

    @Test
    public void test4() throws IOException {


        //1.获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //2.获取session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //3.获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.执行操作  参数=namespace+id
        int delete = sqlSession.delete("carInfoMapper.delCar",5);
        sqlSession.commit();
        //5.打印数据
        System.out.println(delete);
        //6.释放资源
        sqlSession.close();
    }

}
