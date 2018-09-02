package tr.com.yunuskilic.dependencyinjectiondemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import tr.com.yunuskilic.dependencyinjectiondemo.services.GreetingService;

@Controller
public class PropertyInjectedController {
    @Autowired
    @Qualifier("greetingServiceImp")
    public GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
