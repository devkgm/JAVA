package com.devkim.rpg;

public class Magition extends Character {
    int mp;

    public void info() {

        super.info();
        System.out.println(this.mp);
    }

    public void attack() {
        System.out.println("매직완드");
    }
}
