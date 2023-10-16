package com.elshall.projectTwo.service

import com.elshall.projectTwo.repo.CourseRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import com.elshall.projectTwo.model.Course
import java.util.Optional

@Service
class CourseService (){
    @Autowired
    private lateinit var courseRepo: CourseRepo
  fun getCourses(): List<Course> = courseRepo.findAll()

    fun findCourseId(id: Long): Optional<Course> = courseRepo.findById(id)

}