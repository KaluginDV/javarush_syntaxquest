package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String str1 = bufferedReader.readLine(); //читаем строку с клавиатуры
        String sN = bufferedReader.readLine(); //читаем строку с клавиатуры
        int n = Integer.parseInt(sN); //преобразовываем строку в число.
        int i = 0;
        while (i < n){
            i++;
            System.out.println(str1);
        }
    }
}
