package com.elshall.projectTwo.service

import com.elshall.projectTwo.dto.CourseDTO
import com.elshall.projectTwo.repo.CourseRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import com.elshall.projectTwo.model.Course
import java.util.Optional
@Service
class CourseService (){
    @Autowired
    private lateinit var courseRepo: CourseRepo
  fun getCourses(): List<CourseDTO> {
    val Courses : List<Course>  =  courseRepo.findAll()
    val CourseDtos = ArrayList<CourseDTO>()
      for (Course in Courses){
          val CourseDto = CourseDTO(
              id = Course.id,
              name = Course.name
          )
          CourseDtos.add(CourseDto)
      }
      return CourseDtos

  }


    fun findCourseId(id: Long): Optional<Course> = courseRepo.findById(id)

}

