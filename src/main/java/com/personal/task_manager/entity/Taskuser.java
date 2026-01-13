package com.personal.task_manager.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Taskuser {
	@Column(name ="taskid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private long id;
	
	@Column(name="username")
	private String userName;
	
	@Column(name="emailid")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="task")
	@ManyToOne
	private Task task;
	public Taskuser() {
		super();
	}
	
	public Taskuser(long id, String userName, String email, String password, Task task) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.task = task;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
