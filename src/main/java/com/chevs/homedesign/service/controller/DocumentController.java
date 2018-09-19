package com.chevs.homedesign.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.chevs.homedesign.service.api.ProjectDocumentsService;
import com.chevs.homedesign.service.dto.ProjectDocumentRequest;
import com.chevs.homedesign.service.dto.ProjectDocumentResponse;

@RestController
@RequestMapping("/document")
public class DocumentController {

	@Autowired
	ProjectDocumentsService service;
	
	@RequestMapping(path = "/upload", method = RequestMethod.POST, headers = "Content-Type=multipart/form-data")
	public ResponseEntity<ProjectDocumentResponse> uploadFile(
			@RequestParam(value = "file", required = true) MultipartFile file) {
		ProjectDocumentRequest request = new ProjectDocumentRequest();
		request.setDoc(file);
		return new ResponseEntity<ProjectDocumentResponse>(service.createDocument(request), HttpStatus.OK);
	}
}

