package com.devkim.study1;

import java.util.Scanner;

public class Study2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int id = 1234;
			int pw = 1234;
			for(int i = 1; i <= 5; i++) {
				System.out.println("아이디를 입력하세요 : ");
				int input_id = sc.nextInt();
				System.out.println("비밀번호를 입력하세요 : ");
				int input_pwd = sc.nextInt();
				if(id == input_id && pw ==input_pwd) {
					System.out.println("로그인에 성공했습니다.");
					break;
				} else {
					System.out.println("로그인에 실패했습니다.");
					if(i == 5) {
						System.out.println("은행을 방문해주세요.");
						break;
					}
					System.out.println("시도 횟수 : "+i+"/5회");
				}
			}
		}
	}
}
