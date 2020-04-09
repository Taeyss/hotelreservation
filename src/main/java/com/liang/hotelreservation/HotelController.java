package com.liang.hotelreservation;

import com.liang.hotelreservation.SendMsg.*;
import com.liang.hotelreservation.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/hotel")
@CrossOrigin("http://localhost:8081")
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

	@PostMapping("/myreservation")
	public List<HotelOrderVO> myreservation(@RequestBody BaseParams params) {
		return service.myreservation(params);
	}

	@PostMapping("/skuinfo")
	public HotelSKUVO skuinfo(@RequestParam("skuid") Integer skuid){
		return service.hotelsku(skuid);
	}

	@PostMapping("/login")
	public UserInfoVO login(@RequestBody LoginParams params) {
		return service.login(params);
	}

	@PostMapping("/addhotel")
	public Integer addhotel(@RequestBody AddHotelParams params) {
		return service.addhotel(params);
	}

	@PostMapping("/deletehotel")
	public String deletehotel(@RequestParam("hotelid") Integer hotelid) {
		service.deletehotel(hotelid);
		return "";
	}

	@PostMapping("/updatehotel")
	public String updatehotel(@RequestBody AddHotelParams params) {
		service.updatehotel(params);
		return "";
	}
}
