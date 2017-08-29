package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list1 = new int[20];

        for (int i = 0; i < list1.length; i++)
        {
            String n = reader.readLine();
            list1[i] = Integer.parseInt(n);
        }

        int[] list2 = new int[10];
        int[] list3 = new int[10];

        for (int i = 0; i < 10; i++)
        {
            list2[i] = list1[i];
        }

        for (int i = 10; i < 20; i++)
        {
            list3[i-10] = list1[i];
        }

        for (int i = 0; i < list3.length; i++)
            System.out.println(list3[i]);
    }
}
