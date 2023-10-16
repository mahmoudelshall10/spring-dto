package com.elshall.projectTwo.service

import com.elshall.projectTwo.model.Student
import com.elshall.projectTwo.repo.StudentRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService() {
    @Autowired
    private lateinit var StudentRepo: StudentRepo
    fun getStudents() : List<Student>{
        return StudentRepo.findAll()
    }
}