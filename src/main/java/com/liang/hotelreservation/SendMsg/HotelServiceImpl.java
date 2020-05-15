package com.liang.hotelreservation.SendMsg;

import com.liang.hotelreservation.dto.*;
import com.liang.hotelreservation.mapper.HotelMapper;
import com.liang.hotelreservation.mapper.HotelOrderMapper;
import com.liang.hotelreservation.mapper.HotelSKUMapper;
import com.liang.hotelreservation.mapper.UserMapper;
import com.liang.hotelreservation.vo.*;
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
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<HotelListVO> list(FindHotelParams params) {
		List<HotelListVO> response = new ArrayList<>();
		List<HotelListDTO> result = hotelMapper.list(params);
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
	public List<HotelListVO> hotelList() {
		List<HotelListVO> response = new ArrayList<>();
		List<HotelListDTO> result = hotelMapper.hotelList();
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
	public Integer addhotel(AddHotelParams params) {
		//先新增酒店
		Integer result = hotelMapper.addhotel(params);
		//新增酒店下的sku
		hotelSKUMapper.addhotelskus(params.getSkus(), params.getId());
		return params.getId();
	}

	@Override
	public void updatehotel(AddHotelParams params) {
		//先更新酒店基础信息
		hotelMapper.updatehotel(params);
		//删除原酒店下的sku
		hotelSKUMapper.deletehotelskus(params.getId());
		//新增sku
		hotelSKUMapper.addhotelskus(params.getSkus(), params.getId());
	}

	@Override
	public void deletehotel(Integer hotelid) {
		hotelMapper.deletehotel(hotelid);
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

	@Override
	public List<HotelOrderVO> myreservation(BaseParams params) {
		List<HotelOrderDTO> result = hotelOrderMapper.myreservation(params.getUserid());
		List<HotelOrderVO> response = new ArrayList<>();
		if (!CollectionUtils.isEmpty(result)) {
			for (HotelOrderDTO item : result) {
				HotelOrderVO order = new HotelOrderVO();
				order.setPrice(item.getPrice());
				order.setId(item.getId());
				order.setUserid(item.getUserid());
				order.setStartDate(item.getStartDate());
				order.setEndDate(item.getEndDate());
				order.setSkuid(item.getHotelskuid());
				HotelListVO h = new HotelListVO();
				h.setImageUrl(item.getImageUrl());
				h.setAddress(item.getHotelAddress());
				h.setName(item.getHotelname());
				h.setDesc(item.getHotelDesc());
				h.setPrice(item.getPrice());
				h.setLongitude(item.getLongitude());
				h.setLatitude(item.getLatitude());
				order.setHotelinfo(h);
				response.add(order);
			}
		}
		return response;
	}

	@Override
	public HotelSKUVO hotelsku(Integer skuid) {
		HotelSKUDTO result = hotelSKUMapper.skuinfo(skuid);
		HotelSKUVO sku = new HotelSKUVO();
		sku.setTitle(result.getTitle());
		sku.setPrice(result.getPrice());
		sku.setMaxNumber(result.getMaxNumber());
		sku.setId(result.getId());
		sku.setHotelId(result.getHotelId());
		sku.setImageUrl(result.getImageUrl());
		return sku;
	}

	@Override
	public UserInfoVO login(LoginParams params) {
		UserDTO userDTO = userMapper.login(params);
		UserInfoVO userInfoVO = new UserInfoVO();
		userInfoVO.setPhone(userDTO.getPhone());
		userInfoVO.setName(userDTO.getName());
		userInfoVO.setUid(userDTO.getUid());
		return userInfoVO;
	}
}