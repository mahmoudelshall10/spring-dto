package com.elshall.projectTwo.model
import jakarta.persistence.*
import java.sql.Time

@Entity
class Course(@Id private val id: Long, private val name: String, private val cost: Double, private val time: Time) {

}