package com.chevs.homedesign.service.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chevs.homedesign.service.model.ProjectDocuments;

@Repository
public interface ProjectDocumentsRepository  extends JpaRepository<ProjectDocuments, Long>{

}
