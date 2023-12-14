package com.devkim.rpg;

import com.devkim.rpg.weapon.Axe;
import com.devkim.rpg.weapon.Bow;

public class RpgMain {
    public static void main(String[] args) {
        Worrier worrier = new Worrier();
        Axe axe = new Axe();
        worrier.setWeapone(axe);

        Bow bow = new Bow();
        worrier.setWeapone(bow);
        worrier.getWeapone().attack();
    }
}
