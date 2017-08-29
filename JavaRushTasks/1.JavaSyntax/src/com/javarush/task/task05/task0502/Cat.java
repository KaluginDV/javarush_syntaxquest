package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {

        int scoreAnotherCat = 0;
        if(anotherCat.age > 3){
            scoreAnotherCat++;
        }
        if(anotherCat.weight>5){
            scoreAnotherCat++;
        }
        scoreAnotherCat = scoreAnotherCat + anotherCat.strength;

        int scoreThisCat = 0;
        if(this.age > 3){
            scoreThisCat++;
        }
        if(this.weight>5){
            scoreThisCat++;
        }
        scoreThisCat = scoreThisCat + this.strength;

        if(scoreThisCat>scoreAnotherCat){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Vasya";
        cat1.age = 4;
        cat1.weight = 5;
        cat1.strength = 10;

        Cat cat2 = new Cat();
        cat2.name = "Boris";
        cat2.age = 4;
        cat2.weight = 5;
        cat2.strength = 8;

        System.out.println(cat1.name + " vs " + cat2.name + " = " + cat1.fight(cat2));
        System.out.println(cat2.name + " vs " + cat1.name + " = " + cat2.fight(cat1));
    }
}
