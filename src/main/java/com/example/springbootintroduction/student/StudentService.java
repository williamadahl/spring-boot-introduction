package com.example.springbootintroduction.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudent(){

        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentOptional = studentRepository
                .findStudentByPet(student.getPet());
        if(studentOptional.isPresent()){
            throw new IllegalStateException("Pet taken");
        }
        studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        if(!studentRepository.existsById(id)){
            throw new IllegalStateException(
                    "Student with id" + id + " does not exist"
            );
        }
        studentRepository.deleteById(id);
    }
    @Transactional
    public void updateStudent(Long id, String name, String pet){
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(
                        "Student with  " + id +" does not exist"
                ));
        if (name != null && name.length() > 0 && !Objects.equals(student.getName(), name)){
            student.setName(name);
        }
        if (pet != null && pet.length() > 0 && !Objects.equals(student.getPet(), pet)){
            Optional <Student> studentOptional = studentRepository.findStudentByPet(pet);
            if(studentOptional.isPresent()){
                throw new IllegalStateException("Pet taken");
            }
            student.setPet(pet);
        }
    }

}
