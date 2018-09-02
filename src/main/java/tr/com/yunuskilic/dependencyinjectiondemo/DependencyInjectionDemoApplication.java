package tr.com.yunuskilic.dependencyinjectiondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tr.com.yunuskilic.dependencyinjectiondemo.controllers.ConstructorInjectedController;
import tr.com.yunuskilic.dependencyinjectiondemo.controllers.MyController;
import tr.com.yunuskilic.dependencyinjectiondemo.controllers.PropertyInjectedController;
import tr.com.yunuskilic.dependencyinjectiondemo.controllers.SetterInjectedController;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(DependencyInjectionDemoApplication.class, args);

        System.out.println(applicationContext.getBean(MyController.class).hello());

        System.out.println(applicationContext.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(applicationContext.getBean(SetterInjectedController.class).sayHello());
        System.out.println(applicationContext.getBean(ConstructorInjectedController.class).sayHello());
    }
}
