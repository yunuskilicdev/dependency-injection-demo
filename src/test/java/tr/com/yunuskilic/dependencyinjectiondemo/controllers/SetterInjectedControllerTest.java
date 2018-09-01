package tr.com.yunuskilic.dependencyinjectiondemo.controllers;

import org.junit.Before;
import org.junit.Test;
import tr.com.yunuskilic.dependencyinjectiondemo.services.GreetingServiceImp;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImp());
    }

    @Test
    public void sayGreeting() {
        assertEquals(GreetingServiceImp.HELLO, setterInjectedController.sayHello());
    }
}
