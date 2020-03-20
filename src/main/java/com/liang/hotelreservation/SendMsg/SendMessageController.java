package com.liang.hotelreservation.SendMsg;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageController {
    @RequestMapping("/sendCode")
    public String sendCode(@RequestBody PhoneModel inputPhone) {
        //手机号校验等、省略
        //直接生成随机的验证码，返回给客户端
        Message message = new Message(inputPhone.phone);
        return message.getCode();
    }
}
