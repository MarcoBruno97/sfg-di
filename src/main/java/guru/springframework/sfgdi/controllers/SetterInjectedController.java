package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    @Autowired
    @Qualifier("setterInjectedGreetingService")
//with this, Spring knows where to inject, without this it doesn't know which one of these beans to wire into witch controller

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }



    public String getGreeting () {
        return greetingService.sayGreeting();
    }
}
