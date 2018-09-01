package tr.com.yunuskilic.dependencyinjectiondemo.controllers;

import org.springframework.stereotype.Controller;
import tr.com.yunuskilic.dependencyinjectiondemo.services.GreetingService;
import tr.com.yunuskilic.dependencyinjectiondemo.services.GreetingServiceImp;

@Controller
public class PropertyInjectedController {
    public GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

}
