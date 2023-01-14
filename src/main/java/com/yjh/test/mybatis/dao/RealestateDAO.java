package com.yjh.test.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.yjh.test.mybatis.model.Realestate;

@Repository
public interface RealestateDAO {
	
	public Realestate selectRealestate(@Param("id")int id);
	
	public List<Realestate> selectRealEstateByRent(@Param("rentPrice") int rentPrice);
	
	public List<Realestate> selectRealEstateByAreaPrice(
			@Param("area") int area
			, @Param("price") int price);
}
