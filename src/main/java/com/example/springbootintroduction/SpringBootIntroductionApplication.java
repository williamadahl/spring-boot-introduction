package com.example.springbootintroduction;

import com.example.springbootintroduction.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootIntroductionApplication {

	public static void main(String[] args) {
		System.out.println("hello coronaworld");
		SpringApplication.run(SpringBootIntroductionApplication.class, args);
	}

	@GetMapping
	public List<Student> student(){
		return List.of(
				new Student(
						1L,
						"Nina",
						"anal",
						LocalDate.of(2000, Month.FEBRUARY, 5),
						21

				)
		);
	}
}
