package com.elshall.projectTwo.controller


import com.elshall.projectTwo.model.Student
import com.elshall.projectTwo.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController("/student")
class StudentController (private val studentService:StudentService) {

    @GetMapping("/all-students")
    fun getAllStudent () : List<Student> = studentService.getStudents()
}