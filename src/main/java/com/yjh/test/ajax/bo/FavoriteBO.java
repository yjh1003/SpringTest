package com.yjh.test.ajax.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yjh.test.ajax.dao.FavoriteDAO;
import com.yjh.test.ajax.model.Favorite;

@Service
public class FavoriteBO {

	@Autowired
	private FavoriteDAO favoriteDAO;
	
	public List<Favorite> getFavoriteList() {
		return favoriteDAO.selectFavoriteList();
	}
	
	public int addFavorite(String name, String url) {
		return favoriteDAO.insertFavorite(name, url);
	}
	
	public boolean isDuplicateUrl(String url) {
		int count = favoriteDAO.selectCountUrl(url);
		
		if(count == 0) { // 중복되지 않음
			return false;
		} else { // 중복됨
			return true;
		}
	}
	
	public int deleteFavorite(int id) {
		
		return favoriteDAO.deleteFavorite(id);
		
	}
	
}
