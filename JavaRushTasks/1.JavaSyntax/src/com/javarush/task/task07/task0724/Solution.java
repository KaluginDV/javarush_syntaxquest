package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Human dedushka1 = new Human("Dedushka1", true, 90);
        Human dedushka2 = new Human("Dedushka2", true, 91);
        Human babushka1 = new Human("Babushka1", false, 93);
        Human babushka2 = new Human("Babushka2", false, 89);

        Human papa = new Human("Papa", true, 55, dedushka2, babushka2);
        Human mama = new Human("Mama", false, 50, dedushka1, babushka1);

        Human rebenok1 = new Human("Rebenok1", true, 20, papa, mama);
        Human rebenok2 = new Human("Rebenok2", false, 14, papa, mama);
        Human rebenok3 = new Human("Rebenok3", true, 19, papa, mama);

        System.out.println(dedushka1.toString());
        System.out.println(dedushka2.toString());
        System.out.println(babushka1.toString());
        System.out.println(babushka2.toString());
        System.out.println(papa.toString());
        System.out.println(mama.toString());
        System.out.println(rebenok1.toString());
        System.out.println(rebenok2.toString());
        System.out.println(rebenok3.toString());

    }

    public static class Human {
        //напишите тут ваш код имя(String), пол(boolean), возраст(int), отец(Human), мать(Human)
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















