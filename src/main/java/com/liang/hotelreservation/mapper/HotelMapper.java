package com.liang.hotelreservation.mapper;

import com.liang.hotelreservation.SendMsg.AddHotelParams;
import com.liang.hotelreservation.SendMsg.FindHotelParams;
import com.liang.hotelreservation.dto.HotelDTO;
import com.liang.hotelreservation.dto.HotelListDTO;
import com.liang.hotelreservation.dto.HotelSKUDTO;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface HotelMapper extends Mapper<HotelDTO> {
	List<HotelListDTO> list(FindHotelParams params);
	Integer addhotel(AddHotelParams params);
	void deletehotel(Integer hotelid);
	void updatehotel(AddHotelParams params);
}