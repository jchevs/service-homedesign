package com.chevs.homedesign.service.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "project_details")
public class ProjectDetails extends BaseEntity {

	private String projectId;

	private String userId;

	private String projectName;

	private String projectType;

	private String summary;

	private Double area;

	private int noOfBedRooms;

	private int noOfBathRooms;

	private int noOfLivingRooms;

	private int stories;

	private int garage;

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectType() {
		return projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public int getNoOfBedRooms() {
		return noOfBedRooms;
	}

	public void setNoOfBedRooms(int noOfBedRooms) {
		this.noOfBedRooms = noOfBedRooms;
	}

	public int getNoOfBathRooms() {
		return noOfBathRooms;
	}

	public void setNoOfBathRooms(int noOfBathRooms) {
		this.noOfBathRooms = noOfBathRooms;
	}

	public int getNoOfLivingRooms() {
		return noOfLivingRooms;
	}

	public void setNoOfLivingRooms(int noOfLivingRooms) {
		this.noOfLivingRooms = noOfLivingRooms;
	}

	public int getStories() {
		return stories;
	}

	public void setStories(int stories) {
		this.stories = stories;
	}

	public int getGarage() {
		return garage;
	}

	public void setGarage(int garage) {
		this.garage = garage;
	}

}
