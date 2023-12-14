package com.devkim.rpg;

public class Archer extends Character {
    public Archer(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void attack() {
        System.out.println("활쏘기");
    }

}
