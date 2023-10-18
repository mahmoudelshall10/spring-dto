package com.elshall.projectTwo.controller


import com.elshall.projectTwo.dto.StudentDTO
import com.elshall.projectTwo.model.Course
import com.elshall.projectTwo.model.Student
import com.elshall.projectTwo.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.Optional

@RestController
@RequestMapping("/students")
class StudentController (private val studentService:StudentService) {

    @GetMapping("/all")
//    fun getAllStudent () : List<Student> = studentService.getStudents()
    fun getAllStudent () : List<StudentDTO> = studentService.getStudents()
//    @GetMapping("/{id}")
//    fun getStudentById (@PathVariable id: Long) : ResponseEntity<Student> {
//        val student = studentService.findStudentId(id)
//        return if(student.isPresent){
//            ResponseEntity.ok(student.get())
//        }else{
//            ResponseEntity.notFound().build()
//        }
//    }

    @GetMapping("/{id}")
    fun getStudentById (@PathVariable id: Long) : Student = studentService.findStudentId(id)

    @GetMapping("/get_student")
    fun getStudentByIdByParam(@RequestParam("student_id") id : Long) = studentService.findStudentIdByName(id)

}