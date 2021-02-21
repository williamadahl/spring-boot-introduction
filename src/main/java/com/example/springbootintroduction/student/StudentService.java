package com.example.springbootintroduction.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudent(){
        return List.of(
                new Student(
                        1L,
                        "Nina",
                        "public-anal",
                        LocalDate.of(2000, Month.FEBRUARY, 5),
                        21

                )
        );
    }
}
