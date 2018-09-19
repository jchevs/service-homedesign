package com.chevs.homedesign.service.dto;

import javax.persistence.Lob;

import org.springframework.web.multipart.MultipartFile;

public class ProjectDocumentRequest {
private String projectId;
	
	private String doctId;
	
	private String docType;
	
	private String docTitle;
	
	private String docFormat;
	
	private boolean isCover;
	
	private boolean visibilityStatus;
	
    private MultipartFile doc;

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getDoctId() {
		return doctId;
	}

	public void setDoctId(String doctId) {
		this.doctId = doctId;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public String getDocTitle() {
		return docTitle;
	}

	public void setDocTitle(String docTitle) {
		this.docTitle = docTitle;
	}

	public String getDocFormat() {
		return docFormat;
	}

	public void setDocFormat(String docFormat) {
		this.docFormat = docFormat;
	}

	public boolean isCover() {
		return isCover;
	}

	public void setCover(boolean isCover) {
		this.isCover = isCover;
	}

	public boolean isVisibilityStatus() {
		return visibilityStatus;
	}

	public void setVisibilityStatus(boolean visibilityStatus) {
		this.visibilityStatus = visibilityStatus;
	}

	public MultipartFile getDoc() {
		return doc;
	}

	public void setDoc(MultipartFile doc) {
		this.doc = doc;
	}
    
    
}
