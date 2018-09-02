package tr.com.yunuskilic.dependencyinjectiondemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "injected by constructor";
    }
}
