package at.andi.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("at.andi.controllers")
public class SampleProjectIntelliJApplication {
    public static void main(String[] args) {
        SpringApplication.run(SampleProjectIntelliJApplication.class, args);
    }
}
