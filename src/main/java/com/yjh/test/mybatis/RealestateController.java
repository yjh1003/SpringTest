package com.yjh.test.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yjh.test.mybatis.bo.RealestateBO;
import com.yjh.test.mybatis.model.Realestate;

@Controller
@RequestMapping("/mybatis/test01")
public class RealestateController {

	@Autowired
	private RealestateBO realestateBO;
	
	// id를 리퀘스트 파라미터로 전달 받고, 조회결과를 json으로 response에 담는다.
	@RequestMapping("/1")
	@ResponseBody
	public Realestate realestate(@RequestParam("id") int id) {
		Realestate realestate = realestateBO.getRealestate(id);
		
		return realestate;
	}
	
	// 전달된 월세보다 낮은 매물 리스트 json으로 response 담는다.
	@RequestMapping("/2")
	@ResponseBody
	public List<Realestate> realEstateByRent(@RequestParam("rent") int rentPrice) {
		
		List<Realestate> realestateList = realestateBO.getRealEstateListByRent(rentPrice);
		
		return realestateList;
	}
	
	// 넓이와 매매 가격을 전달 받고, 이에 상응하는 리스트를 json으로 response에 담는다.
	@RequestMapping("/3")
	@ResponseBody
	public List<Realestate> realEstateByAreaPrice(
			@RequestParam("area") int area
			, @RequestParam("price") int price) {
		
		return realestateBO.getRealEstateListByAreaPrice(area, price);
		
	}
	
}
