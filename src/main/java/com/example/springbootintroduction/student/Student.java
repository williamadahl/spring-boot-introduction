package com.example.springbootintroduction.student;
import java.time.LocalDate;

public class Student {
    private Long id;
    private String name;
    private String fetish;
    private LocalDate dob;
    private Integer age;

    public Student(){

    }
    public Student(Long id,
                   String name,
                   String fetish,
                   LocalDate dob,
                   Integer age) {
        this.id = id;
        this.name = name;
        this.fetish = fetish;
        this.dob = dob;
        this.age = age;
    }
    public Student(String name,
                   String fetish,
                   LocalDate dob,
                   Integer age){
        this.name = name;
        this.fetish = fetish;
        this.dob = dob;
        this.age = age;
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

    public String getFetish() {
        return fetish;
    }

    public void setFetish(String fetish) {
        this.fetish = fetish;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

  @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fetish='" + fetish + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
