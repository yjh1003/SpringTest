package com.yjh.test.jsp.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yjh.test.jsp.dao.SellerDAO;

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
}
