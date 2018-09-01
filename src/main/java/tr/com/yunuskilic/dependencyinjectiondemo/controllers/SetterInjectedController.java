package tr.com.yunuskilic.dependencyinjectiondemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import tr.com.yunuskilic.dependencyinjectiondemo.services.GreetingService;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }
}
