package com.te.ems.service;

import java.util.Optional;

import com.te.ems.dto.EmployeeDto;
import com.te.ems.dto.ProjectDetailsDto;
import com.te.ems.dto.RegistrationDto;

public interface EmsService {

	Optional<Integer> registration(RegistrationDto registrationDto);

	boolean setProjectDetails(String empEmail, ProjectDetailsDto projectDetailsDto);

	Optional<EmployeeDto> getEmployee(Integer empId);

}
