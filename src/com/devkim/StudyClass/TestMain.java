package com.devkim.StudyClass;

public class TestMain {
    public static void main(String[] args) {
        Test t = new Test();
        int[] arr = new int[3];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        System.out.println(arr);
        t.t1(arr);
        System.out.println(arr[0]);
        System.out.println(arr);

    }
}
