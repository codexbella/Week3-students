package de.codexbella.week3students;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<Student> students = new ArrayList<>();

    public Student getStudentByID(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
            return new Student("No can do", 30000000);
        }
        return new Student("Nope", 40000000);
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public boolean addStudent(Student studentToAdd) {
        return students.add(studentToAdd);
    }
}
