package com.elshall.projectTwo.repo
import com.elshall.projectTwo.model.Student
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepo : JpaRepository<Student,Long> {
}