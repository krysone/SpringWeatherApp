package com.krys;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;



@Configuration
@ComponentScan("com.krys")
@PropertySource("app.properties")
public class App {
    public static void main(String[] args) {
        System.out.println("hejoh");
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        context.getBean(Userinterface.class).start();

    }
}
