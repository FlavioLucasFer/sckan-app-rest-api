package com.sckan.restapi;

import java.util.List;

import com.sckan.restapi.database.ProjectRepository;
import com.sckan.restapi.entity.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectREST {
	@Autowired
	private ProjectRepository repository;

	@GetMapping
	public List<Project>List() {
		return repository.findAll();
	}

	@PostMapping
	public void save(@RequestBody Project project) {
		repository.save(project);
	}

	@PutMapping
	public void update(@RequestBody Project project) {
		if (project.getId() > 0)
			repository.save(project);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
