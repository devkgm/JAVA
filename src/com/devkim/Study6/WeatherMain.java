package com.devkim.Study6;

import java.util.*;

public class WeatherMain {
	public static void main(String[] args) {
		WeatherDAO weatherDAO = new WeatherDAO();
		WeatherView weatherView = new WeatherView();
		WeatherController weatherController = new WeatherController(weatherDAO, weatherView);
		try {
			weatherController.start();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
