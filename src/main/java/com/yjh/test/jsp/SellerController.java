package com.yjh.test.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yjh.test.jsp.bo.SellerBO;

@Controller
@RequestMapping("/jsp/seller")
public class SellerController {

	@Autowired
	private SellerBO SellerBO;
	
	
	@GetMapping("/add")
	@ResponseBody
	public String addSeller(
			@RequestParam("nickname") String nickname
			, @RequestParam("temperature") double temperature
			, @RequestParam("profileImage") String profileImage) {
		
		int count = SellerBO.addSeller(nickname, temperature, profileImage);
		
		return "입력성공" + count;
	}
	
	@GetMapping("/input")
	public String sellerInput() {
		return"jsp/sellerinput";
	}
}
