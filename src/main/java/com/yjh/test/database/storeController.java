package com.yjh.test.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yjh.test.database.bo.storeBO;
import com.yjh.test.database.model.store;

@Controller
public class storeController {
	
	@Autowired
	private storeBO storeBO;
	
	@ResponseBody
	@RequestMapping("/database/store/list")
	public List<store> test01() {
		
		List<store> storeList = storeBO.getstoreList();
		
		return storeList;
		
	}
	
	
	
}
