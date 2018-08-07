import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Description:
 * @Date 2018-08-07 14:31
 * @Author ly
 */
public class ProviderTest {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("/application-main.xml");
        applicationContext.start();
        System.in.read();

    }

}
