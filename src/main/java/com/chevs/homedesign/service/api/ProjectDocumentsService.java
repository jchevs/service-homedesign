package com.chevs.homedesign.service.api;

import com.chevs.homedesign.service.dto.ProjectDocumentRequest;
import com.chevs.homedesign.service.dto.ProjectDocumentResponse;

public interface ProjectDocumentsService {

	ProjectDocumentResponse createDocument(ProjectDocumentRequest request);
}
