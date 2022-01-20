package guru.springframework.sfgdi.repositories;

public class GreetingRepositorySpanishImpl implements  GreetingRepository{
    @Override
    public String getGreeting() {
        return "Hello World -ESsss";
    }
}
