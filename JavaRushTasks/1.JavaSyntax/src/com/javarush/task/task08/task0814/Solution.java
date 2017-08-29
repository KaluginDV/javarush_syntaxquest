package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> list = new HashSet<Integer>();
        for (int i = 1; i <= 20; i++) {
            list.add(i);
        }
        return list;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        HashSet<Integer> list = new HashSet<Integer>();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            int i = (int) iterator.next();
            if(i<=10){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
