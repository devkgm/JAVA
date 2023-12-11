package com.devkim.school;

import java.util.Scanner;

public class SchoolController {

  public void start() {
    Scanner sc = new Scanner(System.in);
    boolean check=true;
    SchoolService schoolService = new SchoolService();
    Student[] students = null;
    while (check) {
        
        System.out.println("1. 학생정보입력");
        System.out.println("2. 학생정보출력");
        System.out.println("3. 학생정보검색");
        System.out.println("4. 학생정보추가");
        System.out.println("5. 학생정보종료");
        int select = sc.nextInt();
        switch (select) {
            case 1:
                students = schoolService.makeStudents();
                break;
            case 2:
                schoolService.showStudents(students);          
                break;
            case 3:
                schoolService.searchStudent(students);
                break;
            case 4:
                students = schoolService.addStudent(students);                         
                break;
            default:
                System.out.println("프로그램을 종료합니다.");

                check = false;
                break;
        }
    }
  }
}
