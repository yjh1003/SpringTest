package com.yjh.test.mybatis.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yjh.test.mybatis.dao.RealestateDAO;
import com.yjh.test.mybatis.model.Realestate;

@Service
public class RealestateBO {
	
	@Autowired
	private RealestateDAO realestateDAO;
	
	// 전달 받은 id 데이터 조회 리턴
	public Realestate getRealestate(int id) {
		Realestate realestate = realestateDAO.selectRealestate(id);
		
		return realestate;
	}
	
	// 전달 받은 월세보다 낮은 매물 리스트 리턴
	public List<Realestate> getRealEstateListByRent(int rentPrice) {
		List<Realestate> realestateList = realestateDAO.selectRealEstateByRent(rentPrice);
		
		return realestateList;
	}
	
	
	public List<Realestate> getRealEstateListByAreaPrice(int area, int price) {
		return realestateDAO.selectRealEstateByAreaPrice(area, price);
	}
	
	// 객체를 기반으로 한행을 저장하는 기능
	public int addRealEstateByObject(Realestate realestate) {
		
		return realestateDAO.insertRealEstateByObject(realestate);
		
	}
	
	// 저장할 값을 모두 전달 받고 저장하는 기능
	public int addRealEstate(
			int realtorId
			, String address
			, int area
			, String type
			,int price
			, int rentPrice) {
		
		return realestateDAO.insertRealEstate(realtorId, address, area, type, price, rentPrice);
		
	}
	
	// 변경할 대상 id, 변경할 type, 변경할 price
	public int updateRealEstate(int id, String type, int price) {
		return realestateDAO.updateRealEstate(id, type, price);
	}
	
	public int deleteRealEstate(int id) {
		return realestateDAO.deleteRealEstate(id);
	}
	
}
