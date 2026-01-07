package com.personal.task_manager.dto;

import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class TaskResponseDto {
	private String title;
	private String description;
	private String message;
	
	public TaskResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TaskResponseDto(String title, String description, String message) {
		super();
		this.title = title;
		this.description = description;
		this.message = message;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
}
