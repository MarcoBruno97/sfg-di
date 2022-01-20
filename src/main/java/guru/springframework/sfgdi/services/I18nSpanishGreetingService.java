package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositories.GreetingRepository;

//@Profile("ES")//you can also set default profile, like this Profile({"ES","default"})
//@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService{
    private final GreetingRepository greetingRepository;

    public I18nSpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGreeting();
    }
}
