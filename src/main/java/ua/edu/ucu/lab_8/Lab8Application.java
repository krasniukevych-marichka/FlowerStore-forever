package ua.edu.ucu.lab_8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class Lab8Application {

    public static void main(String[] args) {
       TimeZone.setDefault(TimeZone.getTimeZone("Europe/Kyiv"));
       SpringApplication.run(Lab8Application.class, args);
    }

}
