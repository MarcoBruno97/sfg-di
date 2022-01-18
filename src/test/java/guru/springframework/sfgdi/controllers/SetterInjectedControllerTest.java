package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;
<<<<<<< HEAD
=======

>>>>>>> 153c4d18e2ba05a60a7bd61a91f0a7561d5877e9
    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
<<<<<<< HEAD
=======

>>>>>>> 153c4d18e2ba05a60a7bd61a91f0a7561d5877e9
    }
}