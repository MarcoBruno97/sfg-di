package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {
    //it's better this method

    private final GreetingService greetingService;//Use private final, so the object will not change inside the object code
    //@Autowired//this is optional, is no longer required from Spring 4.2
    public ConstructorInjectionController(@Qualifier("constructorGreetingService") GreetingService greetingService) {//with this, Spring knows where to inject, without this it doesn't know which one of these beans to wire into witch controller
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
