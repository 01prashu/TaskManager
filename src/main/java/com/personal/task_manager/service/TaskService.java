package com.personal.task_manager.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.task_manager.configurations.ErrorCode;
import com.personal.task_manager.dto.TaskRequestDto;
import com.personal.task_manager.dto.TaskResponseDto;
import com.personal.task_manager.entity.Task;
import com.personal.task_manager.repository.XYZ;

@Service
public class TaskService {
	@Autowired
	XYZ taskRepository;
	public TaskResponseDto saveTask(TaskRequestDto requestDto)
	{
		Task t1 = new Task();
		TaskResponseDto response = new TaskResponseDto();
		try {
			t1.setName(requestDto.getTitle());
			t1.setDescription(requestDto.getDescription());
			Task saved = taskRepository.save(t1);
			response.setTitle(saved.getName());
			response.setDescription(saved.getDescription());
			response.setMessage("Record Saved");
			return response;
		}catch(Exception e)
		{
			response.setMessage(ErrorCode.INSERTION_FAILURE);
			return response;
		}
	}
}
