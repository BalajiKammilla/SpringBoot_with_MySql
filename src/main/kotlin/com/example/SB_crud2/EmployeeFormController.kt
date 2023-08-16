package com.example.SB_crud2

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/form")
class EmployeeFormController( @Autowired private val employeeRepository: EmployeeRepository) {

    //Form To DB
    @PostMapping("/submit")
    fun submitForm(@RequestParam("id") id:Int, @RequestParam("fullname") fullname:String,
                   @RequestParam("fathername") fathername:String, @RequestParam("mobilenumber") mobileNum:String,
                   @RequestParam("email") email:String, @RequestParam("address") address:String): Any {

        val form=Employee(id = id, fullname = fullname, fathername = fathername, mobilenumber = mobileNum,
                email = email, address =address)

       return if (email==email){
            employeeRepository.save(form)
        }
         else{
             "Not Found"
       }
    }

    @GetMapping("/get")
    fun GetForm():List<Employee>{
        return employeeRepository.findAll()
    }


    @GetMapping("/get/{id}")
    fun getById(@PathVariable("id") id:Int): Optional<Employee> {
        return employeeRepository.findById(id)
    }
}