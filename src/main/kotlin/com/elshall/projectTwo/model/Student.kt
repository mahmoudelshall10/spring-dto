package com.elshall.projectTwo.model

import jakarta.persistence.*

@Entity
@Table(name = "student")
data class Student(
    @Id
    val id: Long,
    val name: String,
    val age: Double
) {

}