package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private String secondName;
        private int age;
        private boolean sex;
        private int weighr;
        private int cash;

        public Human(){
            this.name = "noname";
        }

        public Human(String name){
            this.name = name;
        }

        public Human(String name, String secondName){
            this.name = name;
            this.secondName = secondName;
        }

        public Human(String name, String secondName, int age){
            this.name = name;
            this.secondName = secondName;
            this.age = age;
        }

        public Human(String name, String secondName, int age, boolean sex){
            this.name = name;
            this.secondName = secondName;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String secondName, int age, boolean sex, int weighr){
            this.name = name;
            this.secondName = secondName;
            this.age = age;
            this.sex = sex;
            this.weighr = weighr;
        }

        public Human(String name, String secondName, int age, boolean sex, int weighr, int cash){
            this.name = name;
            this.secondName = secondName;
            this.age = age;
            this.sex = sex;
            this.weighr = weighr;
            this.cash = cash;
        }

        public Human(String name, int age, boolean sex, int weighr, int cash){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weighr = weighr;
            this.cash = cash;
        }

        public Human(String name, int age, boolean sex, int cash){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.cash = cash;
        }

        public Human(String name, int age, boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
    }
}
