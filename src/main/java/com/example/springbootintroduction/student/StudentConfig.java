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
                    "Peach",
                    LocalDate.of(2000, FEBRUARY, 10)

            );
            Student dimesque = new Student(
                    "Dimesque",
                    "Valentina",
                    LocalDate.of(2005, AUGUST, 5)
            );
            Student sarah = new Student(
                    "Sarah",
                    "Femboi",
                    LocalDate.of(2007, DECEMBER, 12)

            );
            repository.saveAll(
                    List.of(nina, dimesque , sarah)
            );
        };
    }
}
