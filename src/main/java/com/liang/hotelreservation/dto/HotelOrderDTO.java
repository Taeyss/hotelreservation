package com.liang.hotelreservation.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "hotel_order")
public class HotelOrderDTO {
    @Id
    private Integer id;

    @Column(name = "userid")
    private Integer userid;

    @Column(name = "hotel_skuid")
    private Integer hotelskuid;

    @Column(name = "hotel_id")
    private Integer hotelId;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "name")
    private String hotelname;

    @Column(name = "address")
    private String hotelAddress;

    @Column(name = "desc")
    private String hotelDesc;

    @Column(name = "longitude")
    private double longitude;

    @Column(name = "latitude")
    private double latitude;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return hotelskuid
     */
    public Integer getHotelskuid() {
        return hotelskuid;
    }

    /**
     * @param hotelskuid
     */
    public void setHotelskuid(Integer hotelskuid) {
        this.hotelskuid = hotelskuid;
    }

    /**
     * @return hotel_id
     */
    public Integer getHotelId() {
        return hotelId;
    }

    /**
     * @param hotelId
     */
    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    /**
     * @return userid
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * @return start_Date
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return end_Date
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getPrice() { return  price; }

    public void setPrice(BigDecimal price) { this.price = price; }

    public String getImageUrl() { return  imageUrl; }

    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public String getHotelname() { return  hotelname; }

    public void setHotelname(String hotelname) { this.hotelname = hotelname; }

    public String getHotelAddress() { return  hotelAddress; }

    public void setHotelAddress(String hotelAddress) { this.hotelAddress = hotelAddress; }

    public String getHotelDesc() { return  hotelDesc;}

    public void  setHotelDesc(String hotelDesc) { this.hotelDesc = hotelDesc;}

    public double getLatitude() { return  latitude;}

    public void  setLatitude(double latitude) { this.latitude = latitude;}

    public double getLongitude() { return  longitude;}

    public void  setLongitude(double longitude) { this.longitude = longitude;}
}
