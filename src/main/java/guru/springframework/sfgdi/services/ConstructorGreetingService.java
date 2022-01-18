package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

<<<<<<< HEAD
@Service
public class ConstructorGreetingService implements GreetingService{


    @Override
    public String sayGreeting() {
        return "Hello World! - Constructor";
=======
/**
 * Created by jt on 12/26/19.
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
>>>>>>> 153c4d18e2ba05a60a7bd61a91f0a7561d5877e9
    }
}
