package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sN1 = bufferedReader.readLine();
        String sN2 = bufferedReader.readLine();
        String sN3 = bufferedReader.readLine();
        String sN4 = bufferedReader.readLine();

        int n1 = Integer.parseInt(sN1);
        int n2 = Integer.parseInt(sN2);
        int n3 = Integer.parseInt(sN3);
        int n4 = Integer.parseInt(sN4);

        int max = n1;
        if(max < n2){
            max = n2;
        }
        if(max < n3){
            max = n3;
        }
        if(max < n4){
            max = n4;
        }
        System.out.println(max);
    }
}
