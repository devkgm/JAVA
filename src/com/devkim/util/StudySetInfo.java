package com.devkim.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class StudySetInfo {
    // 로또번호 생성
    // 1-45, 6개
    public void ex0() {
        Random random = new Random();
        Integer[] arr = new Integer[6];
        for (int j = 0; j <= arr.length; j++) {
            int num = random.nextInt(46);
            boolean check = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    check = true;
                    break;
                }
            }
            if (!check)
                arr[j] = num;
        }
        System.out.println(arr);

    }

    public void ex1() {
        Random random = new Random();

        ArrayList<Integer> result = new ArrayList<>();
        while (result.size() < 6) {
            int number = random.nextInt(46);
            if (result.contains(number))
                continue;
            result.add(number);
        }
        System.out.println(result);
    }

    public void ex2() {
        Random random = new Random();

        HashSet<Integer> result = new HashSet<>();
        while (result.size() < 6) {
            int number = random.nextInt(46);
            result.add(number);
        }
        System.out.println(result);
    }
}
