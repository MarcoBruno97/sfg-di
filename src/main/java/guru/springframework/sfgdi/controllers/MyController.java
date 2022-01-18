package guru.springframework.sfgdi.controllers;


import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    //Here is not specified the @Qualifier, so Spring will use the @Primary Bean
    private final GreetingService greetingService;
    //remember, here @Autowired is optional, because we are using The Constructor method for inject

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();

    }

}
