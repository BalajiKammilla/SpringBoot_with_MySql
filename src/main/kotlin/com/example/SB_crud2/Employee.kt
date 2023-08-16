package com.example.SB_crud2

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Employee (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        val id:Int,
        @Column(name = "fullname")
        val fullname:String,
        @Column(name = "fathername")
        val fathername:String,
        @Column(name = "mobilenumber")
        val mobilenumber:String,
        @Column(name = "email")
        val email:String="prabhakar@aptiway.com",
        @Column(name = "address")
        val address:String
)