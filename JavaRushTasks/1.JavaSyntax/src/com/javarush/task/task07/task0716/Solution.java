package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        ArrayList<String> newList = new ArrayList();
        String r = "р";
        String l = "л";

        for (String s : list){
            if ( s.contains(r) && (s.contains(l) )){
                newList.add(s);
            }
            else if (s.contains(r)&&!(s.contains(l))){
                continue;
            }
            else if (s.contains(l) && !(s.contains(r))){
                newList.add(s);
                newList.add(s);
            }
            else {
                newList.add(s);
            }
        }

        return newList;
    }
}