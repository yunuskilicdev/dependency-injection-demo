package tr.com.yunuskilic.dependencyinjectiondemo.controllers;

import org.junit.Before;
import org.junit.Test;
import tr.com.yunuskilic.dependencyinjectiondemo.services.GreetingServiceImp;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImp());
    }

    @Test
    public void sayGreeting() {
        assertEquals(GreetingServiceImp.HELLO, constructorInjectedController.sayHello());
    }
}
