package tr.com.yunuskilic.dependencyinjectiondemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "injected by setter";
    }
}
