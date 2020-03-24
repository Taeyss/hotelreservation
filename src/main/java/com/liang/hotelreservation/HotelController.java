package com.liang.hotelreservation;

import com.liang.hotelreservation.SendMsg.IHotelService;
import com.liang.hotelreservation.vo.HotelListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {

	@Autowired
	private IHotelService service;



	@PostMapping("/list")
	public List<HotelListVO> list(@RequestParam("name") String name) {
		return service.list(name);
	}

	@PostMapping("/list1")
	public List<HotelListVO> list1(@RequestBody HotelListVO vo) {
		return null;
	}
}
