package com.example.SB_crud2

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository:JpaRepository<Employee,Int>{
    fun finyByemail():Boolean
}