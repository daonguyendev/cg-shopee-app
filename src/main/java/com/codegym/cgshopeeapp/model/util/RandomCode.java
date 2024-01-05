package com.codegym.cgshopeeapp.model.util;

import java.util.Random;

public class RandomCode {
    public static String getRandomCode(){

        String randomCode = Math.round(Math.random()*9)+""+Math.round(Math.random()*9)+""+Math.round(Math.random()*9)+""+Math.round(Math.random()*9)+""+Math.round(Math.random()*9);
        return randomCode;
    }
}
