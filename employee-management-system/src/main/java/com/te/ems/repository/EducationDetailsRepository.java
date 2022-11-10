package com.te.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.ems.entity.EducationalDetails;

@Repository
public interface EducationDetailsRepository extends JpaRepository<EducationalDetails, Integer> {

}
