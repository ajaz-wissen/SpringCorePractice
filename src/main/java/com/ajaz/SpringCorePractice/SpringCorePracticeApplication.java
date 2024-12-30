package com.ajaz.SpringCorePractice;

import com.ajaz.SpringCorePractice.models.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ajaz.bank", "com.ajaz.SpringCorePractice"})
public class SpringCorePracticeApplication {

	public static void main(String[] args) {

		BeanFactory beanFactory = SpringApplication.run(SpringCorePracticeApplication.class, args);

		Employee emp1 = beanFactory.getBean(Employee.class);
		Employee emp2 = beanFactory.getBean(Employee.class);
		Employee emp3 = beanFactory.getBean(Employee.class);

		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);

		Employee emp4 = beanFactory.getBean(Employee.class);

		System.out.println(emp4);


	}

}
