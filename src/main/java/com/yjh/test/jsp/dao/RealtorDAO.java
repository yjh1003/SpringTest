package com.yjh.test.jsp.dao;

import org.springframework.stereotype.Repository;

import com.yjh.test.jsp.model.Realtor;

@Repository
public interface RealtorDAO {

	public int insertRealtor(Realtor realtor);

}
