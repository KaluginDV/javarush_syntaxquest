package com.javarush.task.task06.task0604;

/* 
Ставим котов на счётчик
*/

public class Cat {
    public static int catCount = 0;

    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        Cat.catCount--;
        System.out.println("Cat destroyed");
    }

    public Cat(){
        Cat.catCount++;
    }


    public static void main(String[] args) {

    }
}