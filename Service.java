package com.ravionics.services;

import java.util.List;
import java.util.Optional;

import com.ravionics.entities.College;
import com.springrest.springrest.entities.Course;

public interface Service {

	public List<College> getCollegeDetail();
	public Optional<College> getCollegeDetail(Long id);
	public College addCollege(College college);
	public College updateCollege(College college);
	public void deleteCollege(long parseLong);

}
