package com.chevs.homedesign.service.api;

import java.io.IOException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chevs.homedesign.service.dto.ProjectDocumentRequest;
import com.chevs.homedesign.service.dto.ProjectDocumentResponse;
import com.chevs.homedesign.service.model.ProjectDocuments;

@Service
public class ProjectDocumentsServiceImpl implements ProjectDocumentsService{

	@Autowired
	ProjectDocumentsRepository repository;
	
	@Override
	public ProjectDocumentResponse createDocument(ProjectDocumentRequest request) {
		ProjectDocuments projectDocument = new ProjectDocuments();
		Date now = new Date();
		projectDocument.setCover(request.isCover());
		projectDocument.setCreatedBy("USER");
		projectDocument.setCreatedDate(now);
		projectDocument.setDocFormat(request.getDoc().getContentType());
		projectDocument.setDoctId("D0001");
		projectDocument.setDocTitle(request.getDocTitle());
		projectDocument.setDocType(request.getDocType());
		projectDocument.setProjectId(request.getProjectId());
		try {
			projectDocument.setDoc(request.getDoc().getBytes());
			repository.save(projectDocument);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
