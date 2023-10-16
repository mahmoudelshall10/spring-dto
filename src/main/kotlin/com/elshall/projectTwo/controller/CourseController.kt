package com.elshall.projectTwo.controller

import com.elshall.projectTwo.model.Course
import com.elshall.projectTwo.service.CourseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController()
@RequestMapping("/course")
class CourseController (private val courseService : CourseService){

    @GetMapping("/all-courses")
    fun getAllCourses () : List<Course> = courseService.getCourses()
}