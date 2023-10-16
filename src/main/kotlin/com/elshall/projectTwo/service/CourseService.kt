package com.elshall.projectTwo.service

import com.elshall.projectTwo.repo.CourseRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import com.elshall.projectTwo.model.Course

@Service
class CourseService (){
    @Autowired
    private lateinit var CourseRepo: CourseRepo
  fun getCourses(): List<Course> {
      return CourseRepo.findAll()
  }

}