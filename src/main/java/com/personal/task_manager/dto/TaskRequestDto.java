package com.personal.task_manager.dto;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class TaskRequestDto {
	private String title;
	private String description;
	public TaskRequestDto(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}
	public TaskRequestDto() {
		super();
		
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
	
}
