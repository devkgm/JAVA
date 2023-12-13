package com.devkim.rpg;

public abstract class Character {
    private String name;
    private int hp;

    public Character() {

    }

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public abstract void attack();

    public void info() {

        System.out.println("이름: " + this.name + " 체력: " + this.hp);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}