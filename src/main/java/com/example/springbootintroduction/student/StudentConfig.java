package com.example.springbootintroduction.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository){
        return args -> {
            Student nina = new Student(
                    "Nina",
                    "dog",
                    LocalDate.of(2000, FEBRUARY, 10)

            );
            Student miriam = new Student(
                    "Miriam",
                    "horse",
                    LocalDate.of(2005, AUGUST, 5)
            );
            Student maya = new Student(
                    "Maya",
                    "cat",
                    LocalDate.of(2007, DECEMBER, 12)

            );
            repository.saveAll(
                    List.of(nina, miriam, maya)
            );
        };
    }
}
