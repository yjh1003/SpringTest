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
	
	public int insertRealEstateByObject(Realestate realestate);
	
	public int insertRealEstate(
			@Param("realtorId") int realtorId
			, @Param("address") String address
			, @Param("area") int area
			, @Param("type") String type
			, @Param("price") int price
			, @Param("rentPrice") int rentPrice);
	
	public int updateRealEstate(
			@Param("id") int id
			,@Param("type") String type
			,@Param("price") int price);
	
	public int deleteRealEstate(@Param("id") int id);
	
}

