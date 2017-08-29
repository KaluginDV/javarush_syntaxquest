package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // напишите тут ваш код
        for (int i = 0; i < alphabet.size(); i++){
            char compare = alphabet.get(i);
            int cont = 0;
            for (int j = 0; j < list.size(); j++){
                char[] compareArray = list.get(j).toCharArray();
                for (int k = 0; k < compareArray.length; k++){
                    if(compareArray[k] == compare){
                        cont++;
                    }
                }
            }
            System.out.println(compare + " " + cont);
        }
    }

}
