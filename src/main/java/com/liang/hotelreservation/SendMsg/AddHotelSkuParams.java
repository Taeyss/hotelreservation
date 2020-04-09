package com.liang.hotelreservation.SendMsg;

import java.math.BigDecimal;

public class AddHotelSkuParams {
    private BigDecimal price;

    private Integer maxNumber;

    private String imageUrl;

    private String title;

    public  BigDecimal getPrice() { return price; }

    public  void  setPrice(BigDecimal price) { this.price = price; }

    public  Integer getMaxNumber() { return maxNumber; }

    public  void  setMaxNumber(Integer maxNumber) { this.maxNumber = maxNumber; }

    public  String getImageUrl() { return imageUrl; }

    public  void  setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public  String getTitle() { return title; }

    public  void  setTitle(String title) { this.title = title; }
}
