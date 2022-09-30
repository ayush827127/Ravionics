package com.ravionics.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravionics.entities.College;

public interface Dao extends JpaRepository<College,Long> {

}
