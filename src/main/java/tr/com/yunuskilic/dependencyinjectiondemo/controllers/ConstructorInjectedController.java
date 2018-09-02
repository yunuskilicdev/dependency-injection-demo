package tr.com.yunuskilic.dependencyinjectiondemo.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import tr.com.yunuskilic.dependencyinjectiondemo.services.GreetingService;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;


    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
