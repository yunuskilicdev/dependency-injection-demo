package tr.com.yunuskilic.dependencyinjectiondemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import tr.com.yunuskilic.dependencyinjectiondemo.services.GreetingService;

@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
