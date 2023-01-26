package com.yjh.test.jstl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
	

}
