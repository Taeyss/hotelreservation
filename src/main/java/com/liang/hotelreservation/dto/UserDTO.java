package com.liang.hotelreservation.dto;

import javax.persistence.Table;

@Table(name = "user")
public class UserDTO {

    private String phone;
    private Integer uid;
    private String name;

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone;}

    public Integer getUid() { return uid; }

    public void setUid(Integer uid) { this.uid = uid; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name;}
}
