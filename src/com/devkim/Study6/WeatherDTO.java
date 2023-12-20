    package com.devkim.Study6;

    public class WeatherDTO {
    	private String city;
    	private String temp;
    	private String weather;
    	
    	public String getCity() {
    		return city;
    	}
    	public void setCity(String city) {
    		this.city = city;
    	}
    	public String getTemp() {
    		return temp;
    	}
    	public void setTemp(String temp) {
    		this.temp = temp;
    	}
    	public String getWeather() {
    		return weather;
    	}
    	public void setWeather(String weather) {
    		this.weather = weather;
    	}
    	@Override
    	public String toString() {
    		return "WeatherDAO [city=" + city + ", temp=" + temp + ", weather=" + weather + "]";
    	}
    	
    	
    }
