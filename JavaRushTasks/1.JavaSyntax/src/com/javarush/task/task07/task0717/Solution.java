package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList();

        for (int i = 0; i < 10; i++){
            list.add(bis.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        // Вывести на экран result
        for (String s : result){
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList();
        for (int i = 0; i < list.size(); i++){
            result.add(list.get(i));
            result.add(list.get(i));
        }
        return result;
    }
}
