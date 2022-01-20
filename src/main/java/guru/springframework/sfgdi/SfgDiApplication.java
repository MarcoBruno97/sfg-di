package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = {"guru.springframework.sfgdi", "com.springframework.pets"})//Here we tell to Spring boot default component scan path to look on these packages
@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);//SpringApplication.run returned the Context

		PetController petController = (PetController) ctx.getBean(("petController"));
		System.out.println(petController.whichPetIsTheBest());
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());
		MyController myController = (MyController) ctx.getBean("myController");//Here we are taking the bean of the class MyController, by default it is the name of the class but beginning with a  lower case. The bean is in the ApplicationContext
		// So Spring creates a new  instance for MyController, and puts it in the Context. If I want it, Spring will give it to me
		System.out.println("====Primary Bean");
		System.out.println(myController.sayHello());


		System.out.println("------Property");

		PropertyInjectionController propertyInjectionController =
				(PropertyInjectionController) ctx.getBean("propertyInjectionController");// This will give an error, if the class PropertyInjectionController is not annotated with @Controller

		System.out.println(propertyInjectionController.getGreeting());//this will give an error if there isn't the annotation @Autowired GreetingService, inside PropertyInjectionController


		System.out.println("------Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------Constructor");

		ConstructorInjectionController constructorInjectionController = (ConstructorInjectionController) ctx.getBean("constructorInjectionController");

		System.out.println(constructorInjectionController.getGreeting());

	}

}
