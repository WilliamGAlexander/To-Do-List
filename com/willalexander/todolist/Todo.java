package com.willalexander.todolist;

/**
 * 
 * @author William Alexander
 * Copyright 2019 All rights reserved
 */
public class Todo {

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
		this.description = description;
		this.date = date;
		this.priority = priority;
		this.status = TodoStatus.NOTSTARTED;
	}

}
