package com.chevs.homedesign.service.dto;

public class ProjectDetailsRequest {

	private String projectId;

	private String userId;

	private String projectName;

	private String projectType;

	private String summary;

	private Double area;

	private Integer noOfBedRooms;

	private Integer noOfBathRooms;

	private Integer noOfLivingRooms;

	private Integer stories;

	private Integer garage;

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

	public Integer getNoOfBedRooms() {
		return noOfBedRooms;
	}

	public void setNoOfBedRooms(Integer noOfBedRooms) {
		this.noOfBedRooms = noOfBedRooms;
	}

	public Integer getNoOfBathRooms() {
		return noOfBathRooms;
	}

	public void setNoOfBathRooms(Integer noOfBathRooms) {
		this.noOfBathRooms = noOfBathRooms;
	}

	public Integer getNoOfLivingRooms() {
		return noOfLivingRooms;
	}

	public void setNoOfLivingRooms(Integer noOfLivingRooms) {
		this.noOfLivingRooms = noOfLivingRooms;
	}

	public Integer getStories() {
		return stories;
	}

	public void setStories(Integer stories) {
		this.stories = stories;
	}

	public Integer getGarage() {
		return garage;
	}

	public void setGarage(Integer garage) {
		this.garage = garage;
	}
}
