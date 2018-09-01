package tr.com.yunuskilic.dependencyinjectiondemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImp implements GreetingService {

    public static final String HELLO = "HELLLLOOO";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
