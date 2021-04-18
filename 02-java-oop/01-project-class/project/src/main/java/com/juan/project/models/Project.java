package com.juan.project.models;

public class Project {
	public String name;
	public String description;
	public String getName() {
		return name;
	}
	
	public Project(String name) {
		this.name = name;
	}
	
	public Project(String name, String description) {
		this.name = name;
		this.description = description;
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
	
	// Empty constructor
	public Project() {
	}
}

