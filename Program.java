package com.sparta;

import java.sql.SQLOutput;

public class Program {
    public static void main(String[] args){
        int timeOfDay = 21;
        // short-circuiting operation
       String result = greeting(timeOfDay);
       System.out.println(result);
    }

    public static String greeting(int timeOfDay) {
        String greeting;
        if (timeOfDay >= 5 && timeOfDay <= 12){
            greeting ="Good morning!";
        }
        else if(timeOfDay >= 12 && timeOfDay <= 18){
            greeting ="Good afternoon!";
        }
        else{
            greeting ="Good evening";
        }
        return greeting;
    }
}
