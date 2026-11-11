package com.mecerintered.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/Students")
public class StudentController {
    @GetMapping
    public List<Student> getStudents() {
        return List.of(
                new Student(1, "Motsei", "Sefanyetso", "Mo@gmail.com", "JavaEE"),
                new Student(2, "Lethabo", "Monama", "Lebza@gmail.com", "JAVA"),
                new Student(3, "Siya", "Mnethu", "Siya123@gmail.com", "Cybersecurity")
        );
    }

    @GetMapping("/{id}")
    public Student findStudent(@PathVariable int id) {
        List<Student> studentList = getStudents();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).id() == id) {
                return studentList.get(i);
            }
        }
        return null;
    }
}
