import com.mushan.DemoServer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by mazhibin on 16/7/30
 */
public class DemoAction {
    private DemoServer server;

    public void setServer(DemoServer server) {
        this.server = server;
    }

    public void action(String name){
        System.out.println(server.sayHello(name));
    }

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"classpath*:spring.xml"});
        context.start();
      //  DemoAction demoAction = (DemoAction) context.getBean("demoAction");
       // demoAction.action("mushan");

        System.in.read(); // press any key to exit







    }
}
