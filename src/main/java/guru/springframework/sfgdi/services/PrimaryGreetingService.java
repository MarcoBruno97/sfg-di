package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
<<<<<<< HEAD
@Primary//this bean is gonna be the primary bean. ATTENTION: @Qualifier has the priority over the @Primary, so when there is no @qualifier, Spring will use the @Primary Bean
@Service
public class PrimaryGreetingService implements  GreetingService{
=======

/**
 * Created by jt on 12/27/19.
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
>>>>>>> 153c4d18e2ba05a60a7bd61a91f0a7561d5877e9

    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY Bean";
    }
}
