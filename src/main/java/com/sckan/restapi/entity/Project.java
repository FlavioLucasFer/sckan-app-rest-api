package com.sckan.restapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, columnDefinition = "VARCHAR(255)")
	private String name;
	@Column(columnDefinition = "VARCHAR(500)")
	private String description;
	@Column(columnDefinition = "VARCHAR(255)")
	private String cloneLink;
	@Column(nullable = false, columnDefinition = "CHAR(1) DEFAULT 'A'")
	private String active;

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

	public String getCloneLink() {
		return cloneLink;
	}

	public void setCloneLink(String cloneLink) {
		this.cloneLink = cloneLink;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}
}
