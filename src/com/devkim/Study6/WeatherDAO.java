package com.devkim.Study6;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class WeatherDAO {
    private Scanner sc = new Scanner(System.in);

    public ArrayList<WeatherDTO> getWeathers() throws Exception {
        ArrayList<WeatherDTO> arr = new ArrayList<>();
        File file = new File("C:\\temp\\weatherData.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String str = br.readLine();
        while ((str = br.readLine()) != null) {
            WeatherDTO dao = new WeatherDTO();

            StringTokenizer st = new StringTokenizer(str, "-");
            dao.setCity(st.nextToken());
            dao.setTemp(st.nextToken());
            dao.setWeather(st.nextToken());

            arr.add(dao);
        }
        br.close();
        return arr;

    }

    public WeatherDTO getDetail(List<WeatherDTO> weatherList) {
        System.out.println("도시명 입력");
        WeatherDTO newDTO = new WeatherDTO();
        newDTO.setCity(sc.next());
        for (WeatherDTO dto : weatherList) {
            if (newDTO.getCity().equals(dto.getCity())) {
                return dto;

            }
        }
        return null;
    }

    public boolean add(List<WeatherDTO> weatherList) throws Exception {
        WeatherDTO weatherDTO = new WeatherDTO();

        System.out.println("도시입력");
        weatherDTO.setCity(sc.next());
        System.out.println("온도 입력");
        weatherDTO.setTemp(sc.next());
        System.out.println("날씨입력");
        weatherDTO.setWeather(sc.next());

        return weatherList.add(weatherDTO);
    }

    public boolean delete(List<WeatherDTO> weatherList) {
        System.out.println("도시명 입력");
        String city = sc.next();
        boolean result = false;
        for (WeatherDTO dto : weatherList) {
            if (dto.getCity().equals(city)) {
                result = weatherList.remove(dto);
                break;
            }
        }
        return result;
    }

    public boolean save(List<WeatherDTO> weatherDTOs) throws Exception {
        SimpleDateFormat sFormat = new SimpleDateFormat("yyyyMMdd");

        Calendar now = Calendar.getInstance();
        String simplString = sFormat.format(now.getTime());
        File file = new File("C:\\temp\\weatherData" + simplString + ".txt");
        FileWriter fw = new FileWriter(file);
        fw.write("##날씨정보\n");
        for (WeatherDTO weatherDTO : weatherDTOs) {
            fw.write(weatherDTO.getCity() + "-" + weatherDTO.getTemp() + "-" + weatherDTO.getWeather() + "\n");
        }

        fw.close();
        return true;
    }
}
