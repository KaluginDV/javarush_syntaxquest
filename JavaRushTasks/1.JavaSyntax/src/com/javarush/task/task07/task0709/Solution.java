package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList();

        for (int i = 0; i < 5; i++)
        {
            list.add(reader.readLine());
        }

        int min = list.get(0).length();

        for (int i = 1; i < list.size(); i++){
            if(min>list.get(i).length()){
                min = list.get(i).length();
            }
        }

        //ArrayList<String> list2 = new ArrayList();

        for (int i = 0; i < list.size(); i++){
            if(min==list.get(i).length()){
                //list2.add(list.get(i));
                System.out.println(list.get(i));
            }
        }
    }
}
