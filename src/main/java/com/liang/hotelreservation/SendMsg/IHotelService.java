package com.liang.hotelreservation.SendMsg;

import com.liang.hotelreservation.vo.*;

import java.util.List;
import java.util.Map;

public interface IHotelService {

	List<HotelListVO> list(FindHotelParams params);

	List<HotelListVO> hotelList();

	List<HotelSKUVO> hotelskulist(Integer hotelid);

	HotelSKUVO hotelsku(Integer skuid);

	void reservationHotel(ReservationHotelParams params);

	List<HotelOrderVO> myreservation(BaseParams params);

	UserInfoVO login(LoginParams params);

	Integer addhotel(AddHotelParams params);

	void deletehotel(Integer hotelid);

	void updatehotel(AddHotelParams params);
}
