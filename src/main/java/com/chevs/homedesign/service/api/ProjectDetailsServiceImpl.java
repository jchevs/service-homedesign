package com.chevs.homedesign.service.api;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chevs.homedesign.service.dto.ProjectDetailsRequest;
import com.chevs.homedesign.service.dto.ProjectDetailsRespose;
import com.chevs.homedesign.service.model.ProjectDetails;

@Service
public class ProjectDetailsServiceImpl implements ProjectDetailsService {

	@Autowired
	ProjectDetailsRepository repository;


	@Override
	public ProjectDetailsRespose createProject(ProjectDetailsRequest request) {
		ProjectDetailsRespose respose = new ProjectDetailsRespose();
		ProjectDetails entity = setProjectDetails(request);
		repository.save(entity);
		respose.setReponse(request);
		return respose;
	}
	
	private ProjectDetails setProjectDetails(ProjectDetailsRequest request) {
		ProjectDetails entity  = new ProjectDetails();
		entity.setArea(request.getArea());
		entity.setCreatedBy("User");
		Date now = new Date();
		entity.setCreatedDate(now);
		entity.setUpdatedDate(now);
		entity.setGarage(request.getGarage());
		entity.setNoOfBathRooms(request.getNoOfBathRooms());
		entity.setNoOfBedRooms(request.getNoOfBedRooms());
		entity.setNoOfLivingRooms(request.getNoOfLivingRooms());
		entity.setProjectId(request.getProjectId());
		entity.setProjectName(request.getProjectName());
		entity.setProjectType(request.getProjectType());
		entity.setStatusCd("ACTIVE");
		entity.setStories(request.getStories());
		entity.setSummary(request.getSummary());
		entity.setUpdatedBy("USER");
		entity.setUpdatedDate(now);
		entity.setUserId(request.getUserId());
		return entity;
	}

}
