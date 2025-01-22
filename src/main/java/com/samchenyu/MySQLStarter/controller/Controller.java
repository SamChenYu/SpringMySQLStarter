package com.samchenyu.MySQLStarter.controller;

import com.samchenyu.MySQLStarter.model.Student;
import com.samchenyu.MySQLStarter.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/*
    * This is a controller class that handles all the HTTP requests.
    * It defines the endpoints for the API.
    * The controller class interacts with the repository to process the requests.
    *
 */


@RestController
@RequestMapping("/students")
public class Controller {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    /*
        Postman Endpoint:
        GET http://localhost:8080/students/all
     */

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id) {
        Optional<Student> student = studentRepository.findById(id);
        return student.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    /*
        Postman Endpoint:
        GET http://localhost:8080/students/1
    */

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }
    /*
        Postman Endpoint:
        POST http://localhost:8080/students/create
        {
          "id": 1,
          "mark": 85,
          "name": "John Doe"
        }

     */

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable int id, @RequestBody Student studentDetails) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            student.setMark(studentDetails.getMark());
            student.setName(studentDetails.getName());
            return ResponseEntity.ok(studentRepository.save(student));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    /*
        Postman Endpoint:
        PUT http://localhost:8080/students/1
        {
          "id": 1,
          "mark": 90,
          "name": "John Doe"
        }
     */

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    /*
        Postman Endpoint:
        DELETE http://localhost:8080/students/1
     */
}
