package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {
    @Qualifier("propertyInjectedGreetingService")//with this, Spring knows where to inject, without this it doesn't know which one of these beans to wire into witch controller
    @Autowired//this tells Spring to  inject and instance of greetingService,
    // but if there is no @Service in GreetingService, Spring gives an error, because we haven't told Spring that GreetingService is a managed component
    public GreetingService greetingService;


    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
