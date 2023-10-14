package com.elshall.projectTwo.model

import jakarta.persistence.*

@Entity
class Student(@Id private val id: Long, private val name: String, private val age: Double) {

}