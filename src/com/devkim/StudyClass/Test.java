package com.devkim.StudyClass;

public class Test {
    public void t1 (int [] arr) {
        System.out.println(arr);
        for(int i  :arr){
            System.out.println(i);
        }
        arr[0] = 11;
        arr = new int[2];
        System.out.println(arr);
    }
}
