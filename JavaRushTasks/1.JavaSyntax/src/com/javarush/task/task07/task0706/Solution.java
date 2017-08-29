package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list1 = new int[15];
        int even = 0;
        int odd = 0;

        for (int i = 0; i < list1.length; i++)
        {
            String n = reader.readLine();
            list1[i] = Integer.parseInt(n);
        }

        for (int i = 0; i < 15; i++)
        {
            if((i%2==0)||(i==0)){
                even = even + list1[i];
            }
            else{
                odd = odd + list1[i];
            }
        }

        if(even>odd){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
