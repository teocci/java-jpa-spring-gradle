package com.github.teocci.javajpaspringgradle.repositories;

import com.github.teocci.javajpaspringgradle.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
}