package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> deti1 = new ArrayList<>();
        ArrayList<Human> deti2 = new ArrayList<>();

        Human grandfather1 = new Human();
        grandfather1.name = "dedushka1";
        grandfather1.sex = true;
        grandfather1.age = 90;
        grandfather1.children = deti1;

        Human grandfather2 = new Human();
        grandfather2.name = "dedushka2";
        grandfather2.sex = true;
        grandfather2.age = 87;
        grandfather2.children = deti2;

        Human grandmother1 = new Human();
        grandmother1.name = "babushka1";
        grandmother1.sex = false;
        grandmother1.age = 85;
        grandmother1.children = deti1;

        Human grandmother2 = new Human();
        grandmother2.name = "babushka2";
        grandmother2.sex = false;
        grandmother2.age = 88;
        grandmother2.children = deti2;

        ArrayList<Human> vnuki = new ArrayList<>();

        Human father = new Human();
        father.name = "papa";
        father.sex = true;
        father.age = 40;
        father.children = vnuki;
        deti1.add(father);

        Human mother = new Human();
        mother.name = "mama";
        mother.sex = false;
        mother.age = 41;
        mother.children = vnuki;
        deti2.add(mother);

        Human child1 = new Human();
        child1.name = "rebenok1";
        child1.sex = true;
        child1.age = 12;
        vnuki.add(child1);

        Human child2 = new Human();
        child2.name = "rebenok2";
        child2.sex = true;
        child2.age = 14;
        vnuki.add(child2);

        Human child3 = new Human();
        child3.name = "rebenok3";
        child3.sex = false;
        child3.age = 13;
        vnuki.add(child3);

        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children;

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if(!(this.children==null)) {
                int childCount = this.children.size();
                if (childCount > 0) {
                    text += ", дети: " + this.children.get(0).name;

                    for (int i = 1; i < childCount; i++) {
                        Human child = this.children.get(i);
                        text += ", " + child.name;
                    }
                }
            }
            return text;
        }
    }

}
