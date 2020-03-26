package com.liang.hotelreservation.vo;

import javax.persistence.Column;

public class HotelListVO
{
	private Integer id;

	private String name;

	private String longitude;

	private String latitude;

	private String address;

	private String imageUrl;

	private String desc;

	private HotelSKUVO firstSKU;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public HotelSKUVO getFirstSKU() { return  firstSKU; }

	public void setFirstSKU(HotelSKUVO firstSKU) { this.firstSKU = firstSKU; }
}
