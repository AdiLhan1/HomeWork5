package com.company;

public class Main {

    public static void main(String[] args) {
        Hero p1=new Hero("Warrior",150,20,"Physicaly");
        Hero p2=new Hero("Magic",200,20,"Magical");
        Hero p3=new Hero("Kinetic",150,20,"Psyho");


        System.out.println(p1.printInfo());//Параметры героев
        System.out.println(p2.printInfo());
        System.out.println(p3.printInfo());

        Boss boss1 = new Boss();//Параметры босса
        boss1.setHealth(1500);
        boss1.setHits(50);
        boss1.setDefence(0);
        boss1.printBoss(boss1);



        MagicDoor magDoor= new MagicDoor();
        magDoor.generateHeroes();





    }

}
