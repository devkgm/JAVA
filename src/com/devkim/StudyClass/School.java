package com.devkim.StudyClass;

import java.util.Scanner;

public class School {
    public static void main(Str
    ing[] args) {
        // 객체 생성
        // 클래스명 변수명 = new 클래스명();
        Scanner sc = new Scanner(System.in);
        System.out.println("학생의 수를 입력해주세요.");
        int total = sc.nextInt();
        Student[] st = new Student[total];
        
        for(int i = 0; i < st.length; i++){
            sc.nextLine();
            st[i] = new Student();
            System.out.println("학생의 이름과 성적을 입력해주세요.");
            st[i].name = sc.nextLine();
            st[i].score = sc.nextDouble();
        }
        for(Student s : st){
            System.out.println(s.name + s.score);
        }
        
    }
}
