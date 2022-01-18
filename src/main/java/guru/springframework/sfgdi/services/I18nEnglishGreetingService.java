package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
<<<<<<< HEAD
@Profile("EN")//After set the @Profile, you have to set the property of the active profile in the file application.properties in the resources directory
@Service("i18nService")//We assign a name to the service, but if there are two o more service with the same name, Spring will give an error, because it doesn't know which one to inject, so we use the @profile tag to diversify the two or more Service
public class I18nEnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world - EN";
=======

/**
 * Created by jt on 12/27/19.
 */
@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
>>>>>>> 153c4d18e2ba05a60a7bd61a91f0a7561d5877e9
    }
}
