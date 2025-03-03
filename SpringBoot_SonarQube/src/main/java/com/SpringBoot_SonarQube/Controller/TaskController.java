package com.SpringBoot_SonarQube.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot_SonarQube.Model.Task;
import com.SpringBoot_SonarQube.Repository.TaskRepo;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController("task")
public class TaskController {

	@Autowired
	TaskRepo taskRepo;
	
	@GetMapping("/")
	public List<Task> getTasks() {
		return taskRepo.findAll();
	}
	
	@PostMapping("/")
	public Task postTask(@RequestBody Task task) {

		
		return taskRepo.save(task);
	}
	
	
}
