package com.yjh.test.database.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yjh.test.database.dao.storeDAO;
import com.yjh.test.database.model.store;

@Service
public class storeBO {
	
	@Autowired
	private storeDAO storeDAO;
	
	public List<store> getstoreList() {
		List<store> storeList = storeDAO.selectstoreList();
		
		return storeList;
	}
	
	
	
}
