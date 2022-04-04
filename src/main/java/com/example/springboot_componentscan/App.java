package com.example.springboot_componentscan;

import com.example.model.Boy;
import com.example.springboot_componentscan.others.OtherGirl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(scanBasePackages = "com.example.*")
@SpringBootApplication
@ComponentScan("com.example.*")
public class App {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);

        System.out.println(context.getBean(Girl.class));
        System.out.println(context.getBean(OtherGirl.class));
        System.out.println(context.getBean(Boy.class));
    }

}
