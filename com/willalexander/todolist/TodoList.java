package com.willalexander.todolist;

import java.util.Comparator;
import java.util.PriorityQueue;
/**
 * 
 * @author William Alexander
 * Copyright 2019 All rights reserved
 */
public class TodoList {

	private PriorityQueue<Todo> queue;
	private String name;
	
	TodoList(String name){
		this.name = name;
		this.queue = new PriorityQueue<>(50, new Comparator<Todo>() {

			@Override
			public int compare(Todo o1, Todo o2) {
				if(o1.getPriority() < o2.getPriority()) {
					return -1;
				}else if(o1.getPriority() > o2.getPriority()) {
					return 1;
				}else {
					return 0;
				}
			}
			
			
		});
	}
	
}
