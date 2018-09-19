
package com.chevs.homedesign.service.model;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "project_documents")
public class ProjectDocuments extends BaseEntity{

	private String projectId;
	
	private String doctId;
	
	private String docType;
	
	private String docTitle;
	
	private String docFormat;
	
	private boolean isCover;
	
	private boolean visibilityStatus;
	
	@Lob
    private byte[] doc;
	

	public ProjectDocuments() {
		super();
	}

	public ProjectDocuments(String projectId, String doctId, String docType, String docTitle, String docFormat,
			boolean isCover, boolean visibilityStatus, byte[] doc) {
		super();
		this.projectId = projectId;
		this.doctId = doctId;
		this.docType = docType;
		this.docTitle = docTitle;
		this.docFormat = docFormat;
		this.isCover = isCover;
		this.visibilityStatus = visibilityStatus;
		this.doc = doc;
	}

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

	public byte[] getDoc() {
		return doc;
	}

	public void setDoc(byte[] doc) {
		this.doc = doc;
	}

}
