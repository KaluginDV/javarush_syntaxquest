package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine(); //читаем строку с клавиатуры
        String sY = bufferedReader.readLine(); //читаем строку с клавиатуры
        String sM = bufferedReader.readLine(); //читаем строку с клавиатуры
        String sD = bufferedReader.readLine(); //читаем строку с клавиатуры
        int y = Integer.parseInt(sY); //преобразовываем строку в число.
        int m = Integer.parseInt(sM); //преобразовываем строку в число.
        int d = Integer.parseInt(sD); //преобразовываем строку в число.

        System.out.println("Меня зовут " + name+".");
        System.out.println("Я родился "+d+"."+m+"."+y);
    }
}
