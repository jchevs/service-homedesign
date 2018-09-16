package com.chevs.homedesign.service.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chevs.homedesign.service.model.ProjectDetails;

@Repository
public interface ProjectDetailsRepository extends JpaRepository<ProjectDetails, Long> {

}
