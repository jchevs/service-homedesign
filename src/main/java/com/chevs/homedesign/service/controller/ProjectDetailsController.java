package com.chevs.homedesign.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chevs.homedesign.service.api.ProjectDetailsService;
import com.chevs.homedesign.service.dto.ProjectDetailsRequest;
import com.chevs.homedesign.service.dto.ProjectDetailsRespose;

@RestController
@RequestMapping("/project")
public class ProjectDetailsController {

	@Autowired
	ProjectDetailsService service;

	@PostMapping
	public ResponseEntity<ProjectDetailsRespose> createProjectEntity(@RequestBody ProjectDetailsRequest request) {
		return new ResponseEntity<ProjectDetailsRespose> (service.createProject(request),HttpStatus.CREATED);
	}
	
}
