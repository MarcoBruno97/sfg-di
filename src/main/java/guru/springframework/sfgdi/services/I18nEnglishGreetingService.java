package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile({"EN","default"})//After set the @Profile, you have to set the property of the active profile in the file application.properties in the resources directory
@Service("i18nService")//We assign a name to the service, but if there are two o more service with the same name, Spring will give an error, because it doesn't know which one to inject, so we use the @profile tag to diversify the two or more Service
public class I18nEnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world - EN";
    }
}
