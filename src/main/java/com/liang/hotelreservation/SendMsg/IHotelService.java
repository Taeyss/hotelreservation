package com.liang.hotelreservation.SendMsg;

import com.liang.hotelreservation.vo.HotelInfoVO;
import com.liang.hotelreservation.vo.HotelListVO;
import com.liang.hotelreservation.vo.HotelSKUVO;

import java.util.List;
import java.util.Map;

public interface IHotelService {

	List<HotelListVO> list();

	List<HotelSKUVO> hotelskulist(Integer hotelid);

	void reservationHotel(ReservationHotelParams params);
}
