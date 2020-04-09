package com.liang.hotelreservation.mapper;

import com.liang.hotelreservation.SendMsg.LoginParams;
import com.liang.hotelreservation.SendMsg.ReservationHotelParams;
import com.liang.hotelreservation.dto.HotelOrderDTO;
import com.liang.hotelreservation.dto.UserDTO;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UserDTO> {
    UserDTO login(LoginParams params);
}
