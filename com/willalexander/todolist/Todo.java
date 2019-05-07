package com.willalexander.todolist;

import java.util.UUID;

/**
 * 
 * @author William Alexander
 * Copyright 2019 All rights reserved
 */
public class Todo {
	
	private String uniqueId;
	private String description;
	private int date;
	private int priority;
	private TodoStatus status;
	
	/**
	 * 
	 * @param description String represents a description of the task
	 * @param date Int represents the unix due date of a task
	 * @param priority Int represents the importance compared to other tasks
	 * Constructor default status is set to NOTSTARTED
	 */
	Todo(String description, int date, int priority){
		this.uniqueId = UUID.randomUUID().toString();
		this.description = description;
		this.date = date;
		this.priority = priority;
		this.status = TodoStatus.NOTSTARTED;
	}
	
	/**
	 * @return the uniqueId
	 */
	public String getUniqueId() {
		return uniqueId;
	}

	/**
	 * @param uniqueId the uniqueId to set
	 */
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the date
	 */
	public int getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(int date) {
		this.date = date;
	}

	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	/**
	 * @return the status
	 */
	public TodoStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(TodoStatus status) {
		this.status = status;
	}
	
	
}
