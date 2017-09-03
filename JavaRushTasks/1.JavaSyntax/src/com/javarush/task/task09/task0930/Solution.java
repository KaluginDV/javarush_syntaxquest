package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        Map<Integer, String> words = new HashMap();
        Map<Integer, String> nums = new HashMap();
        for(int i = 0; i < array.length; i++){
            if(isNumber(array[i])) {
                nums.put(i, array[i]);
            }
            else {
                words.put(i,array[i]);
            }
        }
        for(int i = words.size()-1; i > 0; i--){                    // Внешний цикл (обратный)
            for(int j = 0; j < i; j++){                             // Внутренний цикл (прямой)
                if(isGreaterThan(words.get(j),words.get(j+1))){     // Порядок нарушен?
                    String temp = words.get(j);                     // Поменять местами
                    words.put(j,words.get(j+1));
                    words.put(j+1,temp);
                }
            }
        }
        for (Map.Entry entry : words.entrySet()) {
            array[(int)entry.getKey()] = (String) entry.getValue();
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
