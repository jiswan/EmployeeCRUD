package com.Employee.register.repository;

import com.Employee.register.entity.employeeentity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeerepository extends JpaRepository<employeeentity, Long> {

}
