package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sN1 = bufferedReader.readLine();
        String sN2 = bufferedReader.readLine();
        String sN3 = bufferedReader.readLine();
        int n1 = Integer.parseInt(sN1);
        int n2 = Integer.parseInt(sN2);
        int n3 = Integer.parseInt(sN3);

        int[] intArr = {n1, n2, n3};

        Arrays.sort(intArr);

        int n1n = intArr[2];
        int n2n = intArr[1];
        int n3n = intArr[0];

        System.out.println(n1n + " " + n2n + " " + n3n);
    }
}
