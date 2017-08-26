package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList();

        for (int i = 0; i < 10; i++)
        {
            list.add(reader.readLine());
        }
        String min = list.get(0);
        int a = 0;
        for (int i = 1; i < 10; i++)
        {
            if(min.length()>list.get(i).length()){
                min = list.get(i);
                a = i;
            }
        }

        String max = list.get(0);
        int b = 0;
        for (int i = 1; i < 10; i++)
        {
            if(max.length()<list.get(i).length()){
                max = list.get(i);
                b = i;
            }
        }
        if(a<b){
            System.out.println(list.get(a));
        }
        else {
            System.out.println(list.get(b));
        }
    }
}
