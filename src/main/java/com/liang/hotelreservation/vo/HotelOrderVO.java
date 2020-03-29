package com.liang.hotelreservation.vo;

import java.math.BigDecimal;
import java.util.Date;

public class HotelOrderVO {
    private Integer id;

    private Date startDate;

    private Date endDate;

    private HotelListVO hotelinfo;

    private BigDecimal price;

    private Integer userid;

    private Integer skuid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public HotelListVO getHotelinfo() { return hotelinfo; }

    public void setHotelinfo(HotelListVO hotelinfo) { this.hotelinfo = hotelinfo;}

    public BigDecimal getPrice() { return  price;}

    public void setPrice(BigDecimal price) { this.price = price;}

    public Date getStartDate() { return startDate;}

    public void setStartDate(Date startDate) { this.startDate = startDate;}

    public Date getEndDate() { return endDate;}

    public void setEndDate(Date endDate) { this.endDate = endDate;}

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getSkuid() {
        return skuid;
    }

    public void setSkuid(Integer skuid) {
        this.skuid = skuid;
    }
}
