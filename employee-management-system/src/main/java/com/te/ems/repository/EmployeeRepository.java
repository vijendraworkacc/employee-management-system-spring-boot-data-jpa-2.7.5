package com.te.ems.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.ems.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	public abstract Optional<Employee> findByEmpEmail(String empEmail);

	public abstract Optional<Employee> findByEmpId(Integer empId);
}
