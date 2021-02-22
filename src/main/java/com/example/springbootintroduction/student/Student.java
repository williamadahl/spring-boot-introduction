package com.example.springbootintroduction.student;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )

    private Long id;
    private String name;
    private String pet;
    private LocalDate dob;
    @Transient
    private Integer age;

    public Student(){

    }
    public Student(Long id,
                   String name,
                   String pet,
                   LocalDate dob) {
        this.id = id;
        this.name = name;
        this.pet = pet;
        this.dob = dob;
    }
    public Student(String name,
                   String pet,
                   LocalDate dob){
        this.name = name;
        this.pet = pet;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPet() { return pet; }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

  @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pet='" + pet + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
