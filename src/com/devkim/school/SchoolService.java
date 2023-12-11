package com.devkim.school;

import java.util.Scanner;

public class SchoolService {
    public Student[] makeStudents () {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 수를 입력해주세요.");
        int studentNumber = sc.nextInt();
        Student[] studentArray = new Student[studentNumber];
        
        for(int i =0; i < studentArray.length; i++){
            sc.nextLine();
            System.out.println("학생 이름을 입력해주세요.");
            String name = sc.nextLine();
            int number = i+1;
            System.out.println("학생 성적을 입력해주세요.");
            double score = sc. nextDouble();
            studentArray[i] = new Student(name, number, score);
        }
        return studentArray;
    }
    public void showStudents(Student[] students){
        for(Student st: students){
            System.out.println(st.number+"번 학생 "+st.name+"의 성적은 "+st.score+"점 입니다.");

        }
    }
    public void searchStudent(Student[] students){
        Scanner sc = new Scanner(System.in);
        System.out.println("검색할 학생의 이름을 입력해주세요.");
        String name = sc.nextLine();
        System.out.println(name);
        for(Student st: students){
            if(st.name.equals(name)){
                System.out.println(st.name+"학생의 성적은"+st.score+"점 입니다.");

            }
        }
    }
    public Student[] addStudent(Student[] students){
        Student[] studentArray = new Student[students.length+1];
        Scanner sc = new Scanner(System.in);

        System.out.println("추가할 학생 이름을 입력해주세요.");
        String name = sc.nextLine();
        System.out.println("추가할 학생 성적을 입력해주세요.");
        double score = sc. nextDouble();
        for(int i = 0; i < students.length; i++){
            studentArray[i] = students[i];
        }
        studentArray[studentArray.length-1] = new Student(name, studentArray.length, score);

        return studentArray;
    }
}
