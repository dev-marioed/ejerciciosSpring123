package com.example.obejercicio.spring1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ObEjercicioSpring1Application {

	public static void main(String[] args) {
		SpringApplication.run(ObEjercicioSpring1Application.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserService user= (UserService) context.getBean("userService");

		user.notification.imprimirSaludo();

	}

}
