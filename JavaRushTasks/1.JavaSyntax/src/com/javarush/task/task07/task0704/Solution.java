package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[10];
        int[] list2 = new int[10];
        int j = 0;

        for (int i = 0; i < list.length; i++)
        {
            String n = reader.readLine();
            list[i] = Integer.parseInt(n);
        }

        for (int i = list.length-1; i >= 0; i--)
        {
            list2[j] = list[i];
            j++;
        }

        for (int i = 0; i < list.length; i++)
        {
            list[i] = list2[i];
        }

        for (int i = 0; i < list2.length; i++)
            System.out.println(list2[i]);
    }
}

