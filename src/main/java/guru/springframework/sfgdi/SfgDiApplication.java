package guru.springframework.sfgdi;

import guru.springframework.sfgdi.config.SfgConfiguration;
import guru.springframework.sfgdi.config.SfgConstructorConfig;
import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.datasource.FakeDataSource;
import guru.springframework.sfgdi.services.PrototypeBean;
import guru.springframework.sfgdi.services.SingletonBean;
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

		System.out.println("Bean Scopes");
		SingletonBean singletonBean = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean.getMyScope());
		SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean2.getMyScope());
		PrototypeBean prototypeBean = (PrototypeBean) ctx.getBean("prototypeBean");
		System.out.println(prototypeBean.getMyScope());
		PrototypeBean prototypeBean2 = (PrototypeBean) ctx.getBean("prototypeBean");
		System.out.println(prototypeBean2.getMyScope());


		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getJdbcurl());


		System.out.println("/-------SfgConfiguration---------/");
		SfgConfiguration sfgConfiguration = ctx.getBean(SfgConfiguration.class);
		System.out.println(sfgConfiguration.getJdbcurl());
		System.out.println(sfgConfiguration.getPassword());
		System.out.println(sfgConfiguration.getUsername());

		System.out.println("------------Constructor Binding");
		SfgConstructorConfig sfgConstructorConfig = ctx.getBean(SfgConstructorConfig.class);
		System.out.println(sfgConstructorConfig.getUsername());
		System.out.println(sfgConstructorConfig.getPassword());
		System.out.println(sfgConstructorConfig.getJdbcurl());

	}

}
