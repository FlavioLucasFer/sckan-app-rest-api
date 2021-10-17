package com.sckan.restapi;

import java.util.List;

import com.sckan.restapi.database.TaskRepository;
import com.sckan.restapi.entity.Task;

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
@RequestMapping("/task")
public class TaskREST {
	@Autowired
	private TaskRepository repository;

	@GetMapping
	public List<Task> List() {
		return repository.findAll();
	}

	@PostMapping
	public void save(@RequestBody Task task) {
		repository.save(task);
	}

	@PutMapping
	public void update(@RequestBody Task task) {
		if (task.getId() > 0)
			repository.save(task);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
