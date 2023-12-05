package com.devkim.study1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

public class Study4 {
    public static void main(String[] args) {
        // fps
        // bullet : 30 * 3
        Scanner sc = new Scanner(System.in);
        //1. 단발
        //2. 점사
        //3. 연사
        int bullet = 90;
        for(int i = 0; i < 3; i++){
            System.out.println("발사 모드를 선택하세요.");
            System.out.println("1. 단발 2. 점사 3. 연사");
            
            int mode;
            mode = sc.nextInt();
            switch (mode) {
                case 1:
                    for(int j = 0; j < 30; j++){
                        System.out.println("탕");
                    }
                    break;
                case 2:
                    for(int j = 0; j < 10; j++){
                        System.out.println("탕탕탕");
                    }
                    break;
                case 3:
                    for(int j = 0; j < 30; j++){
                            System.out.print("탕");
                    }
                    System.out.println("");
                    break;
                default:
                    break;
            }
            System.out.println("장전");
        }
        System.out.println("탄을 모두 소모했습니다.");
    }
}
