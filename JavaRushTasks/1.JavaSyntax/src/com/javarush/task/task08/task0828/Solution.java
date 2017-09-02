package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key = reader.readLine();

        Map<String, String> map = new HashMap();

        map.put("January",      "January is 1 month");
        map.put("February",     "February is 2 month");
        map.put("March",        "March is 3 month");
        map.put("April",        "April is 4 month");
        map.put("May",          "May is 5 month");
        map.put("June",         "June is 6 month");
        map.put("July",         "July is 7 month");
        map.put("August",       "August is 8 month");
        map.put("September",    "September is 9 month");
        map.put("October",      "October is 10 month");
        map.put("November",     "November is 11 month");
        map.put("December",     "December is 12 month");

        for (Map.Entry entry : map.entrySet()) {
            if(entry.getKey().equals(key)){
                System.out.println(entry.getValue());
            }
        }
    }
}
