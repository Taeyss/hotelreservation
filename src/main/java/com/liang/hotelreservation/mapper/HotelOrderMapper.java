package com.liang.hotelreservation.mapper;

import com.liang.hotelreservation.SendMsg.BaseParams;
import com.liang.hotelreservation.SendMsg.ReservationHotelParams;
import com.liang.hotelreservation.dto.HotelOrderDTO;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface HotelOrderMapper extends Mapper<HotelOrderDTO> {
    void reservation(ReservationHotelParams params);

    List<HotelOrderDTO> myreservation(Integer userid);
}
