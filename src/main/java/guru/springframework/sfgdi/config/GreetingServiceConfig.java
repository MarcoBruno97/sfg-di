package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.datasource.FakeDataSource;
import guru.springframework.sfgdi.repositories.GreetingRepository;
import guru.springframework.sfgdi.repositories.GreetingRepositoryEnglishImpl;
import guru.springframework.sfgdi.repositories.GreetingRepositorySpanishImpl;
import guru.springframework.sfgdi.services.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@PropertySource("classpath:datasource.properties")//This will tell to Spring to look up into the file datasource.properties for external properties. Spring will bring up in the context.Properties file have to stay in resources directory
@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {

    @Bean
    FakeDataSource fakeDataSource(@Value("${guru.username}") String username,//@Value() will inject the value of properties of username in file datasource.properties into username var
                                  @Value("${guru.password}") String password,
                                  @Value("${guru.jdbcurl}") String jdbcurl){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setJdbcurl(jdbcurl);
        return fakeDataSource;
    }

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
    //@Bean
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
