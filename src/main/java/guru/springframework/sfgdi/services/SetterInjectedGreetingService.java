package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

<<<<<<< HEAD
@Service
public class SetterInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World! - Setter";
    }

=======
/**
 * Created by jt on 12/27/19.
 */
@Service
public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
>>>>>>> 153c4d18e2ba05a60a7bd61a91f0a7561d5877e9
}
