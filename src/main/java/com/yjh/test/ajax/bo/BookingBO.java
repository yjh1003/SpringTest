package com.yjh.test.ajax.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yjh.test.ajax.dao.BookingDAO;
import com.yjh.test.ajax.model.Booking;

@Service
public class BookingBO {
	
	@Autowired
	private BookingDAO bookingDAO;
	
	public List<Booking> getBookingList() {
		
		return bookingDAO.selectBookingList();
	}
	
	public int addBooking(
			String name
			, String date
			, int day
			, int headcount
			, String phoneNumber) {
		
		return bookingDAO.insertBooking(name, date, day, headcount, phoneNumber, "대기중");
		
	}
	
	public Booking findBooking(String name, String phoneNumber) {
		
		return bookingDAO.selectBookingByNamePhoneNumber(name, phoneNumber);
		
	}
	
	
	public int deleteBooking(int id) {
		
		return bookingDAO.deleteBooking(id);
	}
	
	
}
