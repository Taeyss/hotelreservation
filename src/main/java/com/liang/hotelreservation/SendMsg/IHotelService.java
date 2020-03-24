package com.liang.hotelreservation.SendMsg;

import com.liang.hotelreservation.vo.HotelListVO;

import java.util.List;

public interface IHotelService {

	List<HotelListVO> list(String name);
}
