package guru.springframework.sfgdi.repositories;

public class GreetingRepositoryEnglishImpl implements GreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello World -ENnnnnn";
    }
}
