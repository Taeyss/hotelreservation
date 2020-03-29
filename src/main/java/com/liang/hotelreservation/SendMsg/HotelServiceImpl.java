package com.liang.hotelreservation.SendMsg;

import com.liang.hotelreservation.dto.HotelDTO;
import com.liang.hotelreservation.dto.HotelListDTO;
import com.liang.hotelreservation.dto.HotelSKUDTO;
import com.liang.hotelreservation.mapper.HotelMapper;
import com.liang.hotelreservation.mapper.HotelOrderMapper;
import com.liang.hotelreservation.mapper.HotelSKUMapper;
import com.liang.hotelreservation.vo.HotelInfoVO;
import com.liang.hotelreservation.vo.HotelListVO;
import com.liang.hotelreservation.vo.HotelSKUVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class HotelServiceImpl implements IHotelService {

	@Autowired
	private HotelMapper hotelMapper;
	@Autowired
	private HotelSKUMapper hotelSKUMapper;
	@Autowired
	private HotelOrderMapper hotelOrderMapper;

	@Override
	public List<HotelListVO> list() {
		List<HotelListVO> response = new ArrayList<>();
		List<HotelListDTO> result = hotelMapper.list();
		if (!CollectionUtils.isEmpty(result)) {
			for (HotelListDTO item : result) {
				HotelListVO hotel = new HotelListVO();
				hotel.setImageUrl(item.getImageUrl());
				hotel.setLatitude(item.getLatitude());
				hotel.setLongitude(item.getLongitude());
				hotel.setName(item.getName());
				hotel.setAddress(item.getAddress());
				hotel.setDesc(item.getDesc());
				hotel.setId(item.getId());
				hotel.setPrice(item.getPrice());
				response.add(hotel);
			}
		}
		return response;
	}

	@Override
	public List<HotelSKUVO> hotelskulist(Integer hotelid) {
		List<HotelSKUDTO> result = hotelSKUMapper.hotelskulist(hotelid);
		List<HotelSKUVO> response = new ArrayList<>();
		if (!CollectionUtils.isEmpty(result)) {
			for (HotelSKUDTO item : result) {
				HotelSKUVO sku = new HotelSKUVO();
				sku.setTitle(item.getTitle());
				sku.setPrice(item.getPrice());
				sku.setMaxNumber(item.getMaxNumber());
				sku.setId(item.getId());
				sku.setHotelId(item.getHotelId());
				sku.setImageUrl(item.getImageUrl());
				response.add(sku);
			}
		}
		return response;
	}

	@Override
	public void reservationHotel(ReservationHotelParams params) {
		hotelOrderMapper.reservation(params);
	}
}