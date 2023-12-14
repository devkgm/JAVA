package com.devkim.rpg;

import com.devkim.rpg.weapon.Axe;
import com.devkim.rpg.weapon.Weapone;

public class Worrier extends Character {
    private Weapone weapone;

    public Weapone getWeapone() {
        return this.weapone;
    }

    public void setWeapone(Weapone weapone) {
        this.weapone = weapone;
    }

    @Override
    public void attack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }

}
