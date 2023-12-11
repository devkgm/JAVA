package com.devkim.StudyArray;

import java.util.Scanner;

public class Study4 {
    public static void main(String[] args) {
        // 1.학생정보생성
        // -학생수를 입력
        // -학생수만큼 이림, 번호, 학점 입력
        // 2.학생정보출력
        // 3.학생정보검색
        // -갬색할 학생 번호를 입력받아서 해당 학생의 정보를 출력
        // 4.성적순출력
        // 5.프로그램종료
       
        Scanner sc = new Scanner(System.in);

        // 학생 정보 생성
        System.out.println("학생수를 입력하세요.");
        String[] users = new String[sc.nextInt()];
        int[] score = new int[users.length];
        sc.nextLine();
        System.out.println("학생의 정보를 입력해주세요.");
        for(int i = 0; i < users.length; i++){
            System.out.println(i+1+"번째 학생 이름 학점을 순서대로 입력해주세요.");
            String[] userInput = sc.nextLine().split(" ");
            users[i] = userInput[0];
            score[i] = Integer.parseInt(userInput[1]);
        }

        // 학생 정보 출력
        for(int i = 0; i < users.length; i++){
            System.out.println(i+1+"번 "+users[i]+"학생 학점 : "+score[i]);
        }

        // 학생 정보 검색
        System.out.println("검색할 학생의 이름을 입력하세요.");
        String searchUser = sc.nextLine();
        for(int i = 0; i < users.length; i++){
            if(users[i].equals(searchUser)){
                System.out.println(searchUser+"학생의 학점은 : "+score[i]+"점 입니다.");
            }
        }

        //성적순정렬
        for(int i =0; i < score.length-1; i++){
            int minIndex = i;
            for(int j = i+1; j < score.length; j++){
                if(score[minIndex] > score[j]){
                    minIndex = j;
                }
            }
            int tempScore = score[minIndex];
            String tempUser = users[minIndex];
            score[minIndex] = score[i];
            users[minIndex] = users[i];
            score[i] = tempScore;
            users[i] = tempUser;
        }
        // 학생 정보 출력
        for(int i = 0; i < users.length; i++){
            System.out.println(i+1+"번 "+users[i]+"학생 학점 : "+score[i]);
        }
        System.out.println("프로그램을 종료합니다.");

    }
}
