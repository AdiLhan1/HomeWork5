package com.company;

import java.util.Random;

public class Boss {
    private int health;
    private int hits;
    private int defence;

    public void changeBossDefence(Hero ch) {
        Random r = new Random();
        int randomNum = r.nextInt(3) + 1;
       setDefence(randomNum);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            System.out.println("Wrong value!");
        } else {
            this.health = health;
        }
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        if (health < 0) {
            System.out.println("Wrong value!");
        } else {
            this.hits = hits;
        }
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }


    public void printBoss(Boss b) {
        System.out.println("Жизнь Босса:" + b.getHealth());
        System.out.println("Урон Босса:" + b.getHits());
        System.out.println("Тип защиты Босса:" + getDefence());
    }
}




