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
}
