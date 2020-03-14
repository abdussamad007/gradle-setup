package com.abdus.tutorial.gradlespringbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

    //ApplicationContext ctx =
    System.out.println("--------*********Context is starting");
    SpringApplication.run(Application.class, args);

    System.out.println("--------*********Context started");

    /*String[] beanNames = ctx.getBeanDefinitionNames();

    Arrays.sort(beanNames);

    for (String beanName : beanNames)
    {
      System.out.println(beanName);
    }*/


	}

}
