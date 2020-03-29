package com.liang.hotelreservation.mapper;

import com.liang.hotelreservation.dto.HotelSKUDTO;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface HotelSKUMapper extends Mapper<HotelSKUDTO> {

    List<HotelSKUDTO> hotelskulist(Integer hotelid);
    HotelSKUDTO skuinfo(Integer skuid);

}