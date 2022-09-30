package com.ravionics.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class College {

	@Id
	private long c_id;
	private String c_name;
	private boolean ac;
	private long acommodation_fee;

	public long getC_id() {
		return c_id;
	}

	public void setC_id(long c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public long getAcommodation_fee() {
		return acommodation_fee;
	}

	public void setAcommodation_fee(long acommodation_fee) {
		this.acommodation_fee = acommodation_fee;
	}

	public College(long c_id, String c_name, boolean ac, long acommodation_fee) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.ac = ac;
		this.acommodation_fee = acommodation_fee;
	}

	@Override
	public String toString() {
		return "College [c_id=" + c_id + ", c_name=" + c_name + ", ac=" + ac + ", acommodation_fee=" + acommodation_fee
				+ "]";
	}

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Course> course = new ArrayList<>();

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

}
