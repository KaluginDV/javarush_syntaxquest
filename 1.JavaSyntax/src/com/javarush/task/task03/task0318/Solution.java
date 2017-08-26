package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String years = bufferedReader.readLine(); //читаем строку с клавиатуры
        String name = bufferedReader.readLine(); //читаем строку с клавиатуры

        int nYears = Integer.parseInt(years);

        System.out.println(name + " захватит мир через " + nYears + " лет. Му-ха-ха!");

    }
}
