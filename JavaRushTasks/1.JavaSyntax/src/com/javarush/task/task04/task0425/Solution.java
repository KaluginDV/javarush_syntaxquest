package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sN1 = bufferedReader.readLine();
        String sN2 = bufferedReader.readLine();

        int a = Integer.parseInt(sN1);
        int b = Integer.parseInt(sN2);

        if(a > 0 && b > 0){
            System.out.println(1);
        }
        else if(a < 0 && b > 0){
            System.out.println(2);
        }
        else if(a < 0 && b < 0){
            System.out.println(3);
        }
        else if(a > 0 && b < 0){
            System.out.println(4);
        }

    }
}
