package com.eden6187.toy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ToyApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ToyApplication.class);
        app.addListeners(new ApplicationPidFileWriter());
        app.run(args);
    }

}
