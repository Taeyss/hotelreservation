package com.liang.hotelreservation.SendMsg;

import java.util.Random;

public class GenerateCode {

    public static String randCode() {
        Random random = new Random();
        String result = "";
        for (int i = 0; i < 4; i++) {
            int number = random.nextInt(10);
            result += String.valueOf(number);
        }
        return result;
    }
}
