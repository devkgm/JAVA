package com.devkim.api;

public class ApiMain {
    public static void main(String[] args) {
        WeatherService ws = new WeatherService();
        ws.getData();
        ws.showData();
    }
}
