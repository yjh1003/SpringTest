package com.yjh.test.jstl.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yjh.test.jstl.model.weatherHistory;

@Repository
public interface weatherHistoryDAO {
	
	public List<weatherHistory> selectWeatherHistory();

}
