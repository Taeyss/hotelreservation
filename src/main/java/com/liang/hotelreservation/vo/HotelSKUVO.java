package com.liang.hotelreservation.vo;

import java.math.BigDecimal;

public class HotelSKUVO {
    private Integer id;

    private Integer hotelId;

    private BigDecimal price;

    private Integer maxNumber;

    private String imageUrl;

    private String title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public  Integer getHotelId() { return hotelId; }

    public  void  setHotelId(Integer hotelId) { this.hotelId = hotelId; }

    public  BigDecimal getPrice() { return price; }

    public  void  setPrice(BigDecimal price) { this.price = price; }

    public  Integer getMaxNumber() { return maxNumber; }

    public  void  setMaxNumber(Integer maxNumber) { this.maxNumber = maxNumber; }

    public  String getImageUrl() { return imageUrl; }

    public  void  setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public  String getTitle() { return title; }

    public  void  setTitle(String title) { this.title = title; }
}
