package com.yjh.test.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yjh.test.jsp.bo.SellerBO;
import com.yjh.test.jsp.model.Seller;

@Controller
@RequestMapping("/jsp/seller")
public class SellerController {

	@Autowired
	private SellerBO SellerBO;
	
	
	@PostMapping("/add")
	@ResponseBody
	public String addSeller(
			@RequestParam("nickname") String nickname
			, @RequestParam("temperature") double temperature
			, @RequestParam("profileImage") String profileImage) {
		
		int count = SellerBO.addSeller(nickname, temperature, profileImage);
		
		return "삽입 결과 : " + count;
	}
	
	@GetMapping("/input")
	public String sellerInput() {
		return"jsp/sellerinput";
	}
	
	@GetMapping("/info")
	public String sellerInfo(
			@RequestParam(value = "id", required=false) Integer id
			, Model model) {
		
//		Seller seller = null;
//		if(id == null) {
//			 seller = SellerBO.getLastSeller();		
//		} else {
//			 seller = SellerBO.getSeller(id);
//		}
		
		Seller seller = SellerBO.getSeller(id);
		
		model.addAttribute("seller", seller);
		
		return "jsp/sellerinfo";
	}
	
	@GetMapping("/info/id")
	public String sellerInfoById(@RequestParam("id") int id, Model model) {
		
		Seller seller = SellerBO.getSeller(id);
		model.addAttribute("seller", seller);
		
		return "jsp/sellerInfo";
	}
}
