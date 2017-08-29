package com.javarush.task.task05.task0529;

import java.io.*;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sN = bufferedReader.readLine();
        int n = 0;
        int sum = 0;
        String summa = "сумма";

        while (!(sN.equals(summa))){
            n = Integer.parseInt(sN);
            sum = sum + n;
            sN = bufferedReader.readLine();
        }
        System.out.println(sum);
    }
}
