package com.devkim.api;

public class WeatherData {
    private String city;
    private String temp;
    private String info;
    private String hum;

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTemp() {
        return this.temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getHum() {
        return this.hum;
    }

    public void setHum(String hum) {
        this.hum = hum;
    }

}
