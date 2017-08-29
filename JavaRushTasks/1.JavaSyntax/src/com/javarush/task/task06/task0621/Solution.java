package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName);
        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName);
        catFather.father = catGrandFather;
        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName);
        catMother.mother = catGrandMother;

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName);
        catSon.father = catFather;
        catSon.mother = catMother;
        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName);
        catDaughter.father = catFather;
        catDaughter.mother = catMother;

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            String textFather;
            String textMother;
            if (mother != null){
                textMother = ", mother is " + mother.name;
            }
            else {
                textMother = ", no mother";
            }
            if (father != null){
                textFather = ", father is " + father.name;
            }
            else {
                textFather = ", no father";
            }
                return "Cat name is " + name + textMother + textFather;
        }
    }

}
