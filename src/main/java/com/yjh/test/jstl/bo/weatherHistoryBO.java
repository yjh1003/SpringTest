package com.yjh.test.jstl.bo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yjh.test.jstl.dao.weatherHistoryDAO;
import com.yjh.test.jstl.model.weatherHistory;

@Service
public class weatherHistoryBO {

	@Autowired
	private weatherHistoryDAO weatherHistoryDAO;
	
	//weatherhistory 의 모든 데이터 조회
	public List<weatherHistory> getWeatherHistory() {
	
		return weatherHistoryDAO.selectWeatherHistory();
		
	}
	
	public int addWeather(
			Date date
			, String weather
			, double temperatures
			, double precipitation
			, String microDust
			, double windSpeed) {
		
		return weatherHistoryDAO.insertWeather(date, weather, temperatures, precipitation, microDust, windSpeed);
		
	}
}
