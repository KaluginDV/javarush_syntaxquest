package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];
        int[] list2 = new int[10];

        for (int i = 0; i < list.length; i++)
        {
            list[i] = reader.readLine();
        }

        for (int i = 0; i < list.length; i++)
        {
            list2[i] = list[i].length();
        }

        for (int i = 0; i < list2.length; i++)
            System.out.println(list2[i]);
    }
}
