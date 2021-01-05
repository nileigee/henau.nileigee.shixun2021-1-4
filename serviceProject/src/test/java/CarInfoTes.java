import com.henau.nileigee.carInfo;
import com.henau.nileigee.service.carInfoService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class CarInfoTes {

        @Test
        public void test1() throws IOException {
            ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
            carInfoService carInfoService1 = app.getBean(carInfoService.class);
            List<carInfo> carInfos = carInfoService1.queryAllCars();
            System.out.println(carInfos);
        }

}
