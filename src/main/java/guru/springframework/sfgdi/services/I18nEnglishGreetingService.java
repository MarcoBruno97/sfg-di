package guru.springframework.sfgdi.services;


import guru.springframework.sfgdi.repositories.GreetingRepository;

//@Profile({"EN","default"})//After set the @Profile, you have to set the property of the active profile in the file application.properties in the resources directory
//@Service("i18nService")//We assign a name to the service, but if there are two o more service with the same name, Spring will give an error, because it doesn't know which one to inject, so we use the @profile tag to diversify the two or more Service
public class I18nEnglishGreetingService implements GreetingService{

    private final GreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(GreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return englishGreetingRepository.getGreeting();
    }
}
