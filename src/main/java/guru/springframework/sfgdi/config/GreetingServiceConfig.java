package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.repositories.GreetingRepository;
import guru.springframework.sfgdi.repositories.GreetingRepositoryEnglishImpl;
import guru.springframework.sfgdi.repositories.GreetingRepositorySpanishImpl;
import guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingRepository englishGreetingRepository(){
        return new GreetingRepositoryEnglishImpl();
    }

    @Bean
    GreetingRepository spanishGreetingRepository(){
        return new GreetingRepositorySpanishImpl();
    }
    @Profile({"EN","default"})
    @Bean
    I18nEnglishGreetingService i18nService(GreetingRepository englishGreetingRepository){
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Profile("ES")
    @Bean("i18nService")//"i18nService" will be the bean name
    I18nSpanishGreetingService i18nSSpanishService(GreetingRepository spanishGreetingRepository){
        return  new I18nSpanishGreetingService(spanishGreetingRepository);
    }


    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }
    @Bean
    ConstructorGreetingService constructorGreetingService(){
        //bean name will ben the name of method that creates the instance(constructorGreetingService)
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }
}
