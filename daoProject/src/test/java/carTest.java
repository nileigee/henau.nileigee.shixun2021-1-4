import com.henau.nileigee.carInfo;
import com.henau.nileigee.impl.carInfoDaoImpl;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;
import java.util.List;

public class carTest {
    @Test
    public void find(){
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        carInfoDaoImpl carInfoDao = app.getBean(carInfoDaoImpl.class);
        List<carInfo> carInfos = carInfoDao.queryAllCar();
        System.out.println(carInfos);
    }
    @Test
    public void testtt() throws PropertyVetoException {
        ComboPooledDataSource dataSource =new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/traffic?serverTimezone=UTC");
        dataSource.setUser("root");
        dataSource.setPassword("root");
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        //设置数据源对象 知道数据库在哪
        jdbcTemplate.setDataSource(dataSource);

        List<carInfo> carInfos = jdbcTemplate.query("select * from carinfo", new BeanPropertyRowMapper<carInfo>(carInfo.class));
        System.out.println(carInfos);
    }
    @Test
    public void test3(){
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = app.getBean(JdbcTemplate.class);
        List<carInfo> carInfos = jdbcTemplate.query("select * from carinfo", new BeanPropertyRowMapper<carInfo>(carInfo.class));
        System.out.println(carInfos);
    }

    @Test
    public void add(){
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        carInfoDaoImpl carInfoDao = app.getBean(carInfoDaoImpl.class);
        carInfo car=new carInfo();
        car.setCarName("山A222222");
        car.setCarColor("蓝色");
        car.setCarType("小客车");
        car.setBelongCompany(1);
        car.setSeatNum(15);
        car.setCarStatus("停运");
        car.setCarMasterId(1);
        car.setProvinceId(1);
        car.setCityId(1);
        car.setCountyId(1);
        car.setFleetId(1);
        int addCar = carInfoDao.addCar(car);
        System.out.println(addCar);
    }
    @Test
    public void del(){
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        carInfoDaoImpl carInfoDao = app.getBean(carInfoDaoImpl.class);
        carInfo car=new carInfo();
        car.setCarName("山A222222");
        car.setCarColor("蓝色");
        car.setCarType("小客车");
        car.setBelongCompany(1);
        car.setSeatNum(15);
        car.setCarStatus("停运");
        car.setCarMasterId(1);
        car.setProvinceId(1);
        car.setCityId(1);
        car.setCountyId(1);
        /*无id，删除失败*/
        int delCar = carInfoDao.delCar(car);
        System.out.println(delCar);
    }
}
