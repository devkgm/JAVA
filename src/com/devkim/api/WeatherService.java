package com.devkim.api;

public class WeatherService {
    private String dataString;
    private String[] data;
    private WeatherData[] weatherDatas;

    public WeatherService() {
        // this.dataString = "서울-10-비-80,부산-20-맑음-39,대구-39-비-13";
        this.dataString = "서울-10-비-80-부산-20-맑음-39-대구-39-비-13";
    }

    public void getData() {
        this.data = this.dataString.split("-");
        WeatherData[] weatherDatas = new WeatherData[this.data.length / 4];

        for (int i = 0; i < weatherDatas.length; i++) {
            WeatherData wd = new WeatherData();
            wd.setCity(data[0 + (i * 4)]);
            wd.setTemp(data[1 + (i * 4)]);
            wd.setInfo(data[2 + (i * 4)]);
            wd.setHum(data[3 + (i * 4)]);
            weatherDatas[i] = wd;
        }

        this.weatherDatas = weatherDatas;
    }

    public void showData() {
        for (WeatherData data : weatherDatas) {
            System.out.println(
                    data.getCity() + "의 온도는 " + data.getTemp() + " 정보는 " + data.getInfo() + " 습도는 " + data.getHum());
        }
    }
}
