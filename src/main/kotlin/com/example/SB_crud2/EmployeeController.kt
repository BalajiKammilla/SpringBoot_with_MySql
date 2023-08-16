package com.example.SB_crud2

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class EmployeeController(@Autowired private val employeeRepository: EmployeeRepository) {

                   // API POST
    @GetMapping
    fun getall(): MutableIterable<Employee> {
        return employeeRepository.findAll()
    }


    @GetMapping("/{id}")
    fun getById(@PathVariable("id") id: Int): Employee {
        return employeeRepository.findById(id).orElse(null)
    }


    @PostMapping("/post")
    fun create(@RequestBody employee: Employee): Employee {
        return employeeRepository.save(employee)
    }


    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id:Int){
        employeeRepository.deleteById(id)
    }


}
