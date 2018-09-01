package tr.com.yunuskilic.dependencyinjectiondemo.controllers;

import org.junit.Before;
import org.junit.Test;
import tr.com.yunuskilic.dependencyinjectiondemo.services.GreetingServiceImp;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImp();
    }

    @Test
    public void sayGreeting() {
        assertEquals(GreetingServiceImp.HELLO, propertyInjectedController.sayHello());
    }
}
