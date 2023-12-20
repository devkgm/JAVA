package com.devkim.Study6;

import java.util.List;

public class WeatherView {
    public void view(List<WeatherDTO> list) {
        for (WeatherDTO dao : list) {
            System.out.println(dao);
        }
    }

    public void view(WeatherDTO dto) {
    	if(dto == null) {
    		System.out.println("없는값");
    		return;
    	}
        System.out.println(dto);
    }
}
