package com.liang.hotelreservation.SendMsg;

import com.liang.hotelreservation.dto.HotelDTO;
import com.liang.hotelreservation.mapper.HotelMapper;
import com.liang.hotelreservation.vo.HotelListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelServiceImpl implements IHotelService {

	@Autowired
	private HotelMapper hotelMapper;

	@Override
	public List<HotelListVO> list(String name) {
		List<HotelListVO> response = new ArrayList<>();
		List<HotelDTO> result = hotelMapper.list(name);
		if (!CollectionUtils.isEmpty(result)) {
			for (HotelDTO item : result) {
				HotelListVO hotel = new HotelListVO();
				hotel.setLatitude(item.getLatitude());
				hotel.setLongitude(item.getLongitude());
				hotel.setName(item.getName());
				response.add(hotel);
			}
		}
		return response;
	}
}