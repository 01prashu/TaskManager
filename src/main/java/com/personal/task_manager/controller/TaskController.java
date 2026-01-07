package com.personal.task_manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personal.task_manager.config.ErrorCode;
import com.personal.task_manager.dto.TaskRequestDto;
import com.personal.task_manager.dto.TaskResponseDto;
import com.personal.task_manager.service.TaskService;

@RestController
@RequestMapping("/api")
public class TaskController {
	@Autowired
	TaskService taskService;
	@PostMapping("/add")
	ResponseEntity<TaskResponseDto>addTask(@RequestBody TaskRequestDto taskRequest)
	{
		TaskResponseDto response = taskService.saveTask(taskRequest);
		if(response != null && response.getMessage().equalsIgnoreCase(ErrorCode.INSERTION_FAILURE))
		{
			return ResponseEntity.internalServerError().body(response);
		}
		return ResponseEntity.accepted().body(response);
	}
}
