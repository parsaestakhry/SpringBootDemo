package com.parsa.springbootdemo;

import com.parsa.springbootdemo.model.Laptop;
import com.parsa.springbootdemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
        LaptopService service = context.getBean(LaptopService.class);
        Laptop laptop = context.getBean(Laptop.class);

        service.addLaptop(laptop);
    }

}
