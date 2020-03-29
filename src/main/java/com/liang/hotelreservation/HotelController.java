package com.liang.hotelreservation;

import com.liang.hotelreservation.SendMsg.IHotelService;
import com.liang.hotelreservation.SendMsg.ReservationHotelParams;
import com.liang.hotelreservation.vo.HotelInfoVO;
import com.liang.hotelreservation.vo.HotelListVO;
import com.liang.hotelreservation.vo.HotelSKUVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/hotel")
public class HotelController {

	@Autowired
	private IHotelService service;



//	@PostMapping("/list")
//	public List<HotelListVO> list(@RequestParam("name") String name) {
//		return service.list(name);
//	}

	@PostMapping("/list")
	public List<HotelListVO> list() {
		return service.list();
	}

	@PostMapping("/hotelskulist")
	public List<HotelSKUVO> hotelskulist(@RequestParam("hotelid") Integer hotelid) {
		return service.hotelskulist(hotelid);
	}

	@PostMapping("/reservation")
	public String reservation(@RequestBody ReservationHotelParams params) {
		service.reservationHotel(params);
		return "";
	}
}
