package com.chevs.homedesign.service.api;

import com.chevs.homedesign.service.dto.ProjectDetailsRequest;
import com.chevs.homedesign.service.dto.ProjectDetailsRespose;

public interface ProjectDetailsService {

	ProjectDetailsRespose createProject(ProjectDetailsRequest request);
}
