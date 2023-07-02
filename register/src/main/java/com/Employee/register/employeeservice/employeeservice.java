package com.Employee.register.employeeservice;

import com.Employee.register.entity.employeeentity;
import com.Employee.register.repository.employeerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class employeeservice {


    @Autowired
    public employeerepository repository;
    public employeeentity saveemployee(employeeentity e)
    {
        return repository.save(e);
    }
    public List<employeeentity> allemployee()
    {
        return repository.findAll();
    }

    public employeeentity getemployeeById(long id) {
        return repository.findById(id).orElse(null);
    }

    public employeeentity updateEmployeebyId( employeeentity e) {
        return repository.save(e);
    }

    public void deletebyid(long id) {
        repository.deleteById(id);
    }

    public void testjiswan()
    {

    }
}
