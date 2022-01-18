package guru.springframework.sfgdi.controllers;

<<<<<<< HEAD

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    //Here is not specified the @Qualifier, so Spring will use the @Primary Bean
    private final GreetingService greetingService;
    //remember, here @Autowired is optional, because we are using The Constructor method for inject
=======
import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 12/26/19.
 */
@Controller
public class MyController {

    private final GreetingService greetingService;

>>>>>>> 153c4d18e2ba05a60a7bd61a91f0a7561d5877e9
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
<<<<<<< HEAD


    }

=======
    }
>>>>>>> 153c4d18e2ba05a60a7bd61a91f0a7561d5877e9
}
