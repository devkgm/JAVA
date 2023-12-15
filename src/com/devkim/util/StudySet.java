package com.devkim.util;

import java.util.*;

public class StudySet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("test");
        hs.add("second");
        hs.add("third");
        System.out.println(hs.size());
        System.out.println(hs);
        Set<String> set = hs;
        Collection<String> co = hs;
        Iterator<String> it = hs.iterator();
        while (it.hasNext()) {
            String data = it.next();
            System.out.println(data);
        }
    }
}
