package com.elshall.projectTwo.repo

import com.elshall.projectTwo.model.Course
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CourseRepo : JpaRepository<Course, Long> {
}