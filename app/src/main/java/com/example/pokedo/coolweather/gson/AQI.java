package com.example.pokedo.coolweather.gson;

/**
 * Created by pokedo on 2017/7/14.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }

}
