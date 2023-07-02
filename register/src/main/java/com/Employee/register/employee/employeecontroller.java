package com.Employee.register.employee;

import com.Employee.register.employeeservice.employeeservice;
import com.Employee.register.entity.employeeentity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class employeecontroller {


    @Autowired
    public employeeservice service;
    @RequestMapping("/employees")
    public List<employeeentity> allemployees()
    {
        return service.allemployee();
    }
    @PostMapping("/addemployee")
    public employeeentity addemployee(@RequestBody employeeentity e)
    {
        return service.saveemployee(e);
    }

    @GetMapping("/employee/{id}")
    public employeeentity employeeById(@PathVariable ("id") long id)
    {
        return service.getemployeeById(id);
    }

    @PutMapping("/employee/{id}")
    public employeeentity updateEmployeebyId(@PathVariable("id") long id ,@RequestBody employeeentity e)
    {
        e.setId(id);
        return service.updateEmployeebyId(e);
    }

    @DeleteMapping("/employee/{id}")
    public ResponseEntity<List<employeeentity>> deletebyid(@PathVariable("id") long id)
    {
       service.deletebyid(id);
       List<employeeentity> updatedemployees = service.allemployee();
       return new ResponseEntity<>(updatedemployees, HttpStatus.OK);
    }
}
