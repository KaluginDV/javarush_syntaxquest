package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int sum = 0;
        int n = 0;

        while (n != -1){
            String sN = bufferedReader.readLine();

            n = Integer.parseInt(sN);

            sum = sum + n;
        }
        System.out.println(sum);


    }
}
