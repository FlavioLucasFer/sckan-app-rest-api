package com.sckan.restapi.database;

import com.sckan.restapi.entity.Project;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
	
}
