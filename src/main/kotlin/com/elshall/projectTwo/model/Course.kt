package com.elshall.projectTwo.model
import jakarta.persistence.*
import java.sql.Time

@Entity
@Table(name = "course")
data class Course(
    @Id
    val id: Long,
    val name: String,
    val cost: Double,
    val time: Time
) {

}