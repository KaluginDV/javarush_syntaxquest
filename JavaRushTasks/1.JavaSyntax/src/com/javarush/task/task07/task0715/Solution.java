package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList();
        String imenno = new String("именно");

        list.add("мама");
        list.add("мыла");
        list.add("раму");

        for (int i = 1; i < 6; i=i+2){
            list.add(i,imenno);
        }

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
