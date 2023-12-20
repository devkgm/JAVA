package com.devkim.Study6;

import java.util.*;

public class WeatherController {
	private WeatherDAO weatherDAO;
	private WeatherView weatherView;
	private Scanner sc = new Scanner(System.in);

	public WeatherController() {
		this.weatherDAO = new WeatherDAO();
		this.weatherView = new WeatherView();
	}

	public WeatherController(WeatherDAO wd, WeatherView wv) {
		this.weatherDAO = wd;
		this.weatherView = wv;
	}

	public void start() throws Exception {
		List<WeatherDTO> weatherList = weatherDAO.getWeathers();
		boolean check = true;
		while (check) {

			System.out.println("1. 날씨정보출력");
			System.out.println("2. 날씨정보검색");
			System.out.println("3. 날씨정보추가");
			System.out.println("4. 날씨정보삭제");
			System.out.println("5. 날씨정보저장");
			System.out.println("6. 프로그램종료");
			try {
				int select = sc.nextInt();
				if (select == 1) {
					weatherView.view(weatherList);
				} else if (select == 2) {
					weatherView.view(weatherDAO.getDetail(weatherList));
				} else if (select == 3) {
					boolean flag = weatherDAO.add(weatherList);
				} else if (select == 4) {
					boolean flag = weatherDAO.delete(weatherList);
					if (flag) {
						System.out.println("성공적으로 삭제했습니다.");
					} else {
						System.out.println("삭제 실패 했습니다.");
					}
				} else if (select == 5) {
					boolean flag = weatherDAO.save(weatherList);
					if (flag) {
						System.out.println("성공적으로 저장했습니다.");
					} else {
						System.out.println("저장에 실패했습니다.");
					}
				} else if (select == 6) {
					System.out.println("종료합니다.");
					check = false;
				} else {
					System.out.println("잘못입력했습니다.");
				}
			} catch (Exception e) {
				System.out.println("잘못입력했습니다.");
				sc.next();
			}

		}
	}
}
