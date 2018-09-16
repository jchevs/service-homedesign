package com.chevs.homedesign.service.api;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.chevs.homedesign.service.dto.ProjectDetailsRequest;
import com.chevs.homedesign.service.model.ProjectDetails;

@Component
public class ProjectMapper {

	@Autowired
	ModelMapper mapper;
	
	public ProjectMapper () {
		this.mapper = new ModelMapper();
		this.mapper.addMappings(new PropertyMap<ProjectDetails,ProjectDetailsRequest>(){
			@Override
	        protected void configure() {
				map().setArea(source.getArea());
				map().setGarage(source.getGarage());
				map().setNoOfBathRooms(source.getNoOfBathRooms());
				map().setNoOfBedRooms(source.getNoOfBedRooms());
				map().setNoOfLivingRooms(source.getNoOfLivingRooms());
				map().setProjectId(source.getProjectId());
				map().setProjectName(source.getProjectName());
				map().setProjectType(source.getProjectType());
				map().setStories(source.getStories());
				map().setSummary(source.getSummary());
				map().setUserId(source.getUserId());
			}
			
		});
		
		this.mapper.addMappings(new PropertyMap<ProjectDetailsRequest,ProjectDetails>(){
			@Override
	        protected void configure() {
				map().setArea(source.getArea());
				map().setGarage(source.getGarage());
				map().setNoOfBathRooms(source.getNoOfBathRooms());
				map().setNoOfBedRooms(source.getNoOfBedRooms());
				map().setNoOfLivingRooms(source.getNoOfLivingRooms());
				map().setProjectId(source.getProjectId());
				map().setProjectName(source.getProjectName());
				map().setProjectType(source.getProjectType());
				map().setStories(source.getStories());
				map().setSummary(source.getSummary());
				map().setUserId(source.getUserId());
			}
			
		});
	}
	
	public ProjectDetailsRequest convertToDTO (ProjectDetails details) {
		ProjectDetailsRequest dto = mapper.
				map(details, ProjectDetailsRequest.class);
		
		return dto;
	}
	
	public ProjectDetails convertToEntity (ProjectDetailsRequest dto) {
		ProjectDetails entity = mapper.map(dto, ProjectDetails.class);
		return entity;
	}
	
	
}
