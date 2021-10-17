package com.sckan.restapi.database;

import com.sckan.restapi.entity.Task;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
	
}
