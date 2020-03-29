package com.liang.hotelreservation.SendMsg;

public class ReservationHotelParams extends BaseParams {
    private String startDate;
    private String endDate;
    private Integer hotelid;

    public Integer getHotelid() {
        return hotelid;
    }

    public void setHotelid(Integer hotelid) {
        this.hotelid = hotelid;
    }

    public String getStartDate() { return  startDate; }

    public  void  setStartDate(String startDate) { this.startDate = startDate;}

    public String getEndDate() { return  endDate; }

    public  void  setEndDate(String endDate) { this.endDate = endDate;}

}
