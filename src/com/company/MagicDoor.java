package com.company;

public class MagicDoor {
    public Hero[] generateHeroes() {
        Hero[] heroesArr = new Hero[4];
        Hero warrior = new Hero("Warrior", 200, 20,"Physycal");
        heroesArr[0] = warrior;
        Hero magic = new Hero("Magic",200,20,"Magical");
        heroesArr[1] = magic;
        Hero kinetic = new Hero("kinetic",180,20,"Psyho");
        heroesArr[2] = kinetic;
        Hero healer = new Hero("Medic", 150, 25,"Healing");
        heroesArr[3] = healer;
    return heroesArr;

    }
}


