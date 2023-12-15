package com.devkim.util;

import java.util.*;

public class StudyMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("k1", 1);
        map.put("k2", 2);

        Set<String> set = map.keySet();
        Iterator<String> kets = set.iterator();

        while (kets.hasNext()) {
            System.out.println(map.get(kets.next()));
        }
    }
}
