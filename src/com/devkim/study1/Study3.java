package com.devkim.study1;

import java.util.Scanner;

public class Study3 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int min;
            int sec;
            System.out.println("분을 입력하세요 :");
            min = sc.nextInt();
            System.out.println("초를 입력하세요 :");
            sec = sc.nextInt();
            
            
            for(int i = 0; i <= 59; i++){
                for(int j = 0; j <= 59; j++){
                    System.out.println(i+"분"+j+"초");
                    if(i == min && j == sec){
                        return;
                    }
                }
            }
        }
    }
}
