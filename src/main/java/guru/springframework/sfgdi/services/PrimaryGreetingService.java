package guru.springframework.sfgdi.services;


//@Primary//this bean is gonna be the primary bean. ATTENTION: @Qualifier has the priority over the @Primary, so when there is no @qualifier, Spring will use the @Primary Bean
public class PrimaryGreetingService implements  GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY Bean";
    }
}
