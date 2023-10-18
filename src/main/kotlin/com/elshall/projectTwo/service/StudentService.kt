package com.elshall.projectTwo.service

import com.elshall.projectTwo.dto.StudentDTO
import com.elshall.projectTwo.dto.StudentNameDTO
import com.elshall.projectTwo.model.Student
import com.elshall.projectTwo.repo.StudentRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class StudentService() {
    @Autowired
    private lateinit var studentRepo: StudentRepo
    fun getStudents() : List<StudentDTO>{
        /* get all students from student repo*/
        val students: List<Student> = studentRepo.findAll()
        /* init student dto*/
        val studentDTOs: MutableList<StudentDTO> = mutableListOf()
        for (student in students) {
            /* init single studentDTO  and pass repo into dto */
            val studentDTO = StudentDTO(
                id = student.id,
                name = student.name,
            )
            /* add dto to dtos */
            studentDTOs.add(studentDTO)
        }
        return studentDTOs
    }



//    fun findStudentId(id: Long): Optional<Student> = studentRepo.findById(id)
    fun findStudentId(id: Long): Student  = studentRepo.findById(id).get()
    fun findStudentIdByName (id: Long) : StudentNameDTO {
        val student : Student = studentRepo.findById(id).get()
        val snd  = StudentNameDTO(name = student.name)
        return snd
    }
}