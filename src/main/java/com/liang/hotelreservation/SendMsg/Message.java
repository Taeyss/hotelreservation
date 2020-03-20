package com.liang.hotelreservation.SendMsg;

public class Message {
    private String phone;
    private String code;
    private long expireTime;

    public Message(String phone) {
        this.phone = phone;
        this.code = GenerateCode.randCode();
        this.expireTime = System.currentTimeMillis() + 60 * 1000;
    }

    public String getCode() {
        return code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(long expireTime) {
        this.expireTime = expireTime;
    }

}
