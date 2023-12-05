package com.devkim.study1;

import java.util.Scanner;

public class Study4 {
    static int exp = 0;
    static int level = 1;
    static int gold = 0;
    public static void main(String[] args) {
        login();
        while(true){
            monster();
            levelUp();
            state();
            if (level%5 == 0 && endCheck()) {
                break;
            }
        }
        state();
    }
    public static void login(){
        Scanner sc = new Scanner(System.in);
        String id = "user01";
        String pwd = "1234";
        System.out.println("로그인 해주세요.");   
        System.out.println("아이디 :");   
        String input_id = sc.nextLine();
        System.out.println("비밀번호 :");
        String input_pwd = sc.nextLine();
        System.out.println(id+input_id+pwd+input_pwd);
        if(id.equals(input_id) && pwd.equals(input_pwd)){
            System.out.println("로그인에 성공했습니다.");
        } else {
            System.out.println("로그인에 실패했습니다.");
        }
    }
    public static void monster(){
        Scanner sc = new Scanner(System.in);
        int monster_num =(int) (Math.random()*3 + 1);
        System.out.println("몬스터 "+monster_num+" 마리가 출몰했습니다.");
        System.out.println("1. 사냥한다 2. 도망친다.");
        int mode = sc.nextInt();
        if(mode == 1){
            System.out.println("몬스터 "+monster_num+"마리를 사냥했습니다!");
            int addGold = (int)(Math.random()*100) + 1;
            System.out.println(addGold+"골드 획득!");
            gold += addGold;
            exp += monster_num;
        } else {
            System.out.println("도망쳤습니다!");
        }
    }
    public static void levelUp(){
        if(level == exp/3){
            level++;
            System.out.println("레벨업!");
        }
        switch (level) {
            case 5:
                gold += 1000;
                System.out.println("5 레벨업 보상 1000골드 획득");
                break;
            case 10:
                gold += 2000;
                System.out.println("10 레벨업 보상 2000골드 획득");
                break;
            case 15:
                gold += 3000;
                System.out.println("15 레벨업 보상 3000골드 획득");
                break;
            default:
                break;
        }
    }
    public static void state(){
        System.out.println("현제 레벨 : "+level);
        System.out.println("현제 보유 골드 : "+ gold);
    }
    public static boolean endCheck(){
        Scanner sc = new Scanner(System.in);
        System.out.println("종료하시겠습니까?");
        System.out.println("1. 예 2. 아니요");
        int exit = sc.nextInt();
        if(exit == 1){
            return true;
        } else {
            return false;
        }
    }
}
