package com.te.ems.dto;

import java.time.LocalDate;

import com.te.ems.entity.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class EmployeeDto {
	private Integer empId;
	private String empName;
	private String empEmail;
	private LocalDate empDOB;
	private LocalDate empDOJ;
	private Gender empGender;
	private SecondaryInfoDto secondaryInfo;
}
