package com.liang.hotelreservation.SendMsg;

import com.liang.hotelreservation.dto.HotelDTO;
import com.liang.hotelreservation.mapper.HotelMapper;
import com.liang.hotelreservation.vo.HotelListVO;
import com.liang.hotelreservation.vo.HotelSKUVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
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
				hotel.setAddress(item.getAddress());
				hotel.setDesc(item.getDesc());
				hotel.setId(item.getId());
				response.add(hotel);
			}
		}
//		HotelListVO d1 = new HotelListVO();
//		d1.setName("酒店1");
//		d1.setAddress("上海长宁区");
//		d1.setDesc("酒店描述");
//		HotelSKUVO sku1 = new HotelSKUVO();
//		sku1.setPrice(new BigDecimal(100));
//		sku1.setMaxNumber(3);
//		sku1.setTitle("大床房");
//		d1.setFirstSKU(sku1);
//		response.add(d1);
		return response;
	}
}