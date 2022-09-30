package com.ravionics.services;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.ravionics.dao.Dao;
import com.ravionics.entities.College;
import com.springrest.springrest.entities.Course;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

	@Autowired
	private Dao dao;

	@Override
	public List<College> getCollegeDetail() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Optional<College> getCollegeDetail(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public College addCollege(College college) {
		// TODO Auto-generated method stub
		dao.save(college);
		return college;
	}

	@Override
	public College updateCollege(College college) {
		// TODO Auto-generated method stub
		dao.save(college);
		return college;
	}

	@Override
	public void deleteCollege(long parseLong) {
		// TODO Auto-generated method stub
		College cl = dao.getReferenceById(parseLong);
		dao.delete(cl);

	}

}
