package de.codexbella.week3students;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/allstudents")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
    @GetMapping("/{id}")
    public Student getStudentByID(@PathVariable int id) {
        return studentService.getStudentByID(id);
    }
    @PostMapping
    public boolean addStudent(@RequestBody Student studentToAdd) {
        return studentService.addStudent(studentToAdd);
    }
}
