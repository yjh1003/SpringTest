package com.yjh.test.ajax.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.yjh.test.ajax.model.Booking;

@Repository
public interface BookingDAO {
	
	public List<Booking> selectBookingList();
	
	public int insertBooking(
			@Param("name") String name
			, @Param("date") String date
			, @Param("day") int day
			, @Param("headcount") int headcount
			, @Param("phoneNumber") String phoneNumber
			, @Param("state") String state);
	
	public int deleteBooking(@Param("id") int id);
			
}
