package com.elshall.projectTwo.service

import com.elshall.projectTwo.model.Student
import com.elshall.projectTwo.repo.StudentRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class StudentService() {
    @Autowired
    private lateinit var studentRepo: StudentRepo
    fun getStudents() : List<Student>{
        return studentRepo.findAll()
    }

    fun findStudentId(id: Long): Optional<Student> = studentRepo.findById(id)
}