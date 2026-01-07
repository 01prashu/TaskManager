package com.personal.task_manager.entity;

import java.sql.Timestamp;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

enum STATUS{
	PENDING,COMPLETED,CANCALLED
}

@Entity
public class Task {
	@Column(name="task_id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="title")
	private String name;
	
	@Column(name="description")
	private String description;

	@Column(name="status")
	private STATUS status=STATUS.PENDING;
	
	@Column(name="start_time")
	private Timestamp startFrom;
	
	@Column(name="end_time")
	private Timestamp endTo;
	
	
	public Task() {
		super();
		
	}

	public Task(Long id, String name, String description, STATUS status, Timestamp startFrom, Timestamp endTo) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.status = status;
		this.startFrom = startFrom;
		this.endTo = endTo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

	public Timestamp getStartFrom() {
		return startFrom;
	}

	public void setStartFrom(Timestamp startFrom) {
		this.startFrom = startFrom;
	}

	public Timestamp getEndTo() {
		return endTo;
	}

	public void setEndTo(Timestamp endTo) {
		this.endTo = endTo;
	}
	
}
