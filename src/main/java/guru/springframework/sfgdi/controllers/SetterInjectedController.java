package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

<<<<<<< HEAD
@Controller
public class SetterInjectedController {
    private GreetingService greetingService;
    @Autowired
    @Qualifier("setterInjectedGreetingService")//with this, Spring knows where to inject, without this it doesn't know which one of these beans to wire into witch controller
=======
/**
 * Created by jt on 12/26/19.
 */
@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    @Qualifier("setterInjectedGreetingService")
    @Autowired
>>>>>>> 153c4d18e2ba05a60a7bd61a91f0a7561d5877e9
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

<<<<<<< HEAD
    public String getGreeting() {
=======
    public String getGreeting(){
>>>>>>> 153c4d18e2ba05a60a7bd61a91f0a7561d5877e9
        return greetingService.sayGreeting();
    }
}
