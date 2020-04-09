package com.liang.hotelreservation.SendMsg;

import java.util.List;

public class AddHotelParams {
    private Integer id;

    private String name;

    private String address;

    private String imageUrl;

    private String desc;

    private List<AddHotelSkuParams> skus;

    public Integer getId() { return  id;}

    public void setId(Integer id) { this.id = id;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<AddHotelSkuParams> getSkus () { return  skus;}

    public void  setSkus(List<AddHotelSkuParams> skus) { this.skus = skus;}
}
