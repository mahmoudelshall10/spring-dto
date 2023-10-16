package com.elshall.projectTwo.controller

import com.elshall.projectTwo.dto.CourseDTO
import com.elshall.projectTwo.model.Course
import com.elshall.projectTwo.service.CourseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/courses")
class CourseController (private val courseService : CourseService){

    @GetMapping("/all")
    fun getAllCourses () : List<CourseDTO> = courseService.getCourses()

    @GetMapping("/{id}")
    fun getCourseById (@PathVariable id: Long) : ResponseEntity<Course> {
        val course = courseService.findCourseId(id)
        return if(course.isPresent){
            ResponseEntity.ok(course.get())
        }else{
            ResponseEntity.notFound().build()
        }
    }
}
