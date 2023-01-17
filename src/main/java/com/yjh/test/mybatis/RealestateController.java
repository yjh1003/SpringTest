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
@RequestMapping("/mybatis")
public class RealestateController {

	@Autowired
	private RealestateBO realestateBO;
	
	// id를 리퀘스트 파라미터로 전달 받고, 조회결과를 json으로 response에 담는다.
	@RequestMapping("/test01/1")
	@ResponseBody
	public Realestate realestate(@RequestParam("id") int id) {
		Realestate realestate = realestateBO.getRealestate(id);
		
		return realestate;
	}
	
	// 전달된 월세보다 낮은 매물 리스트 json으로 response 담는다.
	@RequestMapping("/test01/2")
	@ResponseBody
	public List<Realestate> realEstateByRent(@RequestParam("rent") int rentPrice) {
		
		List<Realestate> realestateList = realestateBO.getRealEstateListByRent(rentPrice);
		
		return realestateList;
	}
	
	// 넓이와 매매 가격을 전달 받고, 이에 상응하는 리스트를 json으로 response에 담는다.
	@RequestMapping("/test01/3")
	@ResponseBody
	public List<Realestate> realEstateByAreaPrice(
			@RequestParam("area") int area
			, @RequestParam("price") int price) {
		
		return realestateBO.getRealEstateListByAreaPrice(area, price);
		
	}
	
	@RequestMapping("/test02/1")
	@ResponseBody
	public String addRealEstateByObject() {
		
		Realestate realEstate = new Realestate();
		realEstate.setRealtorId(3);
		realEstate.setAddress("푸르지용 리버 303동 1104호");
		realEstate.setArea(89);
		realEstate.setType("매매");
		realEstate.setPrice(100000);
		
		int count = realestateBO.addRealEstateByObject(realEstate);
		
		return "삽입결과 : " + count;
		
		
	}
	
	@RequestMapping("/test02/2")
	@ResponseBody
	public String addRealEstate(@RequestParam("realtorId") int realtorId) {
		
		int count = realestateBO.addRealEstate(realtorId, "썅떼빌리버 오피스텔 814호", 45, "월세", 100000, 120);
		
		return "삽입결과 : " + count;
	}
	
	@RequestMapping("/test03")
	@ResponseBody
	public String updateRealEstate() {
		
		// id가 21인 매물의 타입인 전세 price 70000
		int count = realestateBO.updateRealEstate(21, "전세", 70000);
		
		return "수정사항 : " + count;
		
	}
	
	@RequestMapping("/test04")
	@ResponseBody
	public String deleteRealEstate(@RequestParam("id") int id) {
		
		int count = realestateBO.deleteRealEstate(id);
		
		return "삭제 : " + count;
	}
	
}
