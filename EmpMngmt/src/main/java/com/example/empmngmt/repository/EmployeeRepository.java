package com.example.empmngmt.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.empmngmt.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
