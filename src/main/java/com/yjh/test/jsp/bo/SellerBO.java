package com.yjh.test.jsp.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yjh.test.jsp.dao.SellerDAO;
import com.yjh.test.jsp.model.Seller;

@Service
public class SellerBO {
	
	@Autowired
	private SellerDAO SellerDAO;

	public int addSeller(
			String nickname
			, double temperature
			, String profileImage) {
		
		return SellerDAO.insertSeller(nickname, temperature, profileImage);
	}
	
	public Seller getSeller(Integer id) {
		if(id == null) {
			return SellerDAO.selectLastSeller();
		} else {
			return SellerDAO.selectSeller(id);
		}
	}
	
	public Seller getLastSeller() {
		return SellerDAO.selectLastSeller();
	}
	
	public Seller getSellerById(int id) {
		
		return SellerDAO.selectSeller(id);
	}
}
