package com.workintech.model;

public enum Weapon {
    SWORD(10),
    DAGGER(3),
    BATTLEAXE(15),
    SPEAR(12),
    MACE(18),
    STAFF(10),
    BOW(10);

    private int damage;

    Weapon(int damage){
        this.damage = damage;
    }

}
