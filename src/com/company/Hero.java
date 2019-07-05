package com.company;

public class Hero {
    String nameHero;
    int health;
    int hits;
    String hitsTypes;

    public Hero (String nameHero,int health,int hits,String hitsTypes){
        this.nameHero=nameHero;
        this.health=health;
        this.hits=hits;
        this.hitsTypes=hitsTypes;
    }
    public String printInfo(){
        return nameHero+":  Жизнь-"+ health + " Урон-"+ hits + " Тип атаки-"+ hitsTypes;
    }







}
