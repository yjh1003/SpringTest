package com.yjh.test.ajax;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yjh.test.ajax.bo.FavoriteBO;
import com.yjh.test.ajax.model.Favorite;

@Controller
@RequestMapping("ajax/favorite")
public class FavorateController {

	@Autowired
	private FavoriteBO favoriteBO;
	
	
	@GetMapping("/list")
	public String FavoriteList(Model model) {
		
		List<Favorite> favoriteList = favoriteBO.getFavoriteList();
		
		model.addAttribute("favoriteList",favoriteList);
		
		return "/ajax/favorite/list";
	}
	
	// 즐겨찾기 추가 api
	@PostMapping("/add")
	@ResponseBody
	public Map<String, String> addFavorite(
			@RequestParam("name") String name
			, @RequestParam("url") String url) {
		
		int count = favoriteBO.addFavorite(name, url);
		
		// response
		// 성공시 : {"result":"success"}
		// 실패시 : {"result":"fail"}
		
		Map<String, String> map = new HashMap<>();
		if(count == 1) {
			map.put("result", "success");
		} else {
			map.put("result", "fail");
		}
		
		return map;
	}
	
	@GetMapping("/input")
	public String FavoriteInput() {
		return "/ajax/favorite/input";
	}
	
	// url 을 전달받고, 중복여부를 확인하는 API
	@PostMapping("/is_duplicate_url")
	@ResponseBody
	public Map<String, Boolean> isDuplicateUrl(@RequestParam("url") String url) {
		
		Map<String, Boolean> result = new HashMap<>();
		
		// {"is_duplicate_url":true}
		// {"is_duplicate_url":false}

//		if(favoriteBO.isDuplicateUrl(url)) {  // 중복되었다.
//			result.put("is_duplicate_url", true);
//		} else {
//			result.put("is_duplicate_url", false);
//		}
		
		result.put("is_duplicate_url", favoriteBO.isDuplicateUrl(url));
		
		return result;
		
	}
	
	// 삭제 API
	// id를 전달 받고, 해당 행을 삭제하는 API
	@GetMapping("/delete")
	@ResponseBody
	public Map<String, String> deleteFavorite(@RequestParam("id") int id) {
		
		int count = favoriteBO.deleteFavorite(id);
		Map<String, String> map = new HashMap<>();
		// 삭제 성공시 {"result":"success"}
		// 삭제 실패시 {"result":"fail"}
		
		if(count == 1) {
			map.put("result", "success");
		} else {
			map.put("result", "fail");
		}
		
		return map;
		
	}
	
}
