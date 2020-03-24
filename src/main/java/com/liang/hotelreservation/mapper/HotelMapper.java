package com.liang.hotelreservation.mapper;

import com.liang.hotelreservation.dto.HotelDTO;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface HotelMapper extends Mapper<HotelDTO> {
	List<HotelDTO> list(@Param("name") String name);
}