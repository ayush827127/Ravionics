package com.ravionics.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	private long id;
	private String course_name;
	private long course_fee;
	private long course_duration;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public long getCourse_fee() {
		return course_fee;
	}

	public void setCourse_fee(long course_fee) {
		this.course_fee = course_fee;
	}

	public long getCourse_duration() {
		return course_duration;
	}

	public void setCourse_duration(long course_duration) {
		this.course_duration = course_duration;
	}

}
