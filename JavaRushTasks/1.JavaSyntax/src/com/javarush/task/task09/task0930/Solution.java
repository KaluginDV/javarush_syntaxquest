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

        String[] arrayWord = new String[words.size()];
        int s = 0;
        for (Map.Entry entry : words.entrySet()) {
            arrayWord[s] = (String) entry.getValue();
            s++;
        }
        for(int i = arrayWord.length-1; i > 0; i--){                    // Внешний цикл (обратный)
            for(int j = 0; j < i; j++){                             // Внутренний цикл (прямой)
                if(isGreaterThan(arrayWord[j],arrayWord[j+1])){     // Порядок нарушен?
                    String temp = arrayWord[j];                     // Поменять местами
                    arrayWord[j] = arrayWord[j+1];
                    arrayWord[j+1] = temp;
                }
            }
        }
        s = 0;
        for (Map.Entry entry : words.entrySet()) {
            words.put((int)entry.getKey(),arrayWord[s]);
            s++;
        }

        int[] arrayNum = new int[nums.size()];
        s = 0;
        for (Map.Entry entry : nums.entrySet()) {
            arrayNum[s] = Integer.parseInt((String) entry.getValue());
            s++;
        }
        for (int i = 0; i < arrayNum.length; i++)
        {
            for (int j = 0; j < arrayNum.length; j++)
            {
                if (arrayNum[i] >= arrayNum[j]){
                    int temp = arrayNum[i];
                    arrayNum[i] = arrayNum[j];
                    arrayNum[j] = temp;
                }
            }
        }
        s = 0;
        for (Map.Entry entry : nums.entrySet()) {
            nums.put((int)entry.getKey(),""+arrayNum[s]);
            s++;
        }

        for (Map.Entry entry : words.entrySet()) {
            array[(int)entry.getKey()] = (String) entry.getValue();
        }
        for (Map.Entry entry : nums.entrySet()) {
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
