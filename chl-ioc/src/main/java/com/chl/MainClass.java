package com.chl;

import com.chl.bean.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.chl")
public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MainClass.class);
		UserServiceImpl bean = context.getBean(UserServiceImpl.class);
		bean.sayHi();
	}


}
