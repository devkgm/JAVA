package com.devkim.poly;

public class PolyMain {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.num = 20;
        Child2 child2 = new Child2();
        child2.num = 30;

        Parent p = child1;
        System.out.println(child1);
        System.out.println(p);
        child1 = (Child1) p;
        System.out.println(child1);
    }
}
