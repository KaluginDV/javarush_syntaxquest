package com.javarush.task.task08.task0801;

/* 
HashSet из растений арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель
*/

import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashSet<String> set = new HashSet();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("жень-шень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        //получение итератора для множества
        Iterator iterator = set.iterator();

        while (iterator.hasNext())        //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            String text = iterator.next().toString();

            System.out.println(text);
        }
    }
}
