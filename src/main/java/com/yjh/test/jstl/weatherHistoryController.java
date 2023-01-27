package com.yjh.test.jstl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yjh.test.jstl.bo.weatherHistoryBO;
import com.yjh.test.jstl.model.weatherHistory;

@Controller
@RequestMapping("/jstl")
public class weatherHistoryController {
	
	@Autowired
	private weatherHistoryBO weatherHistoryBO;
	
	@GetMapping("/test05")
	public String test05(Model model) {
		
		//weatherHistory 리스트를 모델에 추가한다.
		List<weatherHistory> weatherHistory = weatherHistoryBO.getWeatherHistory();
		
		model.addAttribute("weatherHistory", weatherHistory);
		
		return "jstl/test05";
	}
	
	@GetMapping("/add")
	@ResponseBody
	public String addWeather(
			@DateTimeFormat(pattern="yyyy년 M월 d일")
			@RequestParam("date") Date date
			, @RequestParam("weather") String weather
			, @RequestParam("temperatures") double temperatures
			, @RequestParam("precipitation") double precipitation
			, @RequestParam("microDust") String microDust
			, @RequestParam("windSpeed") double windSpeed) {
		
		int count = weatherHistoryBO.addWeather(date, weather, temperatures, precipitation, microDust, windSpeed);
		
		return "redirect:/jstl/test05";
	}
	
	@GetMapping("/input")
	public String weatherInput() {
		return "jstl/weather/weatherinput";
	}
	

}
