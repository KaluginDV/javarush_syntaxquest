package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String mainString = reader.readLine();
        String str1 = new String();
        String str2 = new String();

        char[] chArray = mainString.toCharArray();

        for(int i = 0; i < chArray.length; i++){
            if(isVowel(chArray[i])){
                str1 = str1 + chArray[i] + " ";
            }
            else {
                if (chArray[i]!=' ') {
                    str2 = str2 + chArray[i] + " ";
                }
            }
        }

        System.out.println(str1);
        System.out.println(str2);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}