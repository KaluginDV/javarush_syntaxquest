package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        Map<String, String> addresses = new HashMap();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) break;

            String town = reader.readLine();
            if (town.isEmpty()) break;
            addresses.put(family, town);
        }

        //read town
        String town = reader.readLine();

        for (Map.Entry entry : addresses.entrySet()) {
            if(entry.getKey().equals(town)){
                System.out.println(entry.getValue());
            }
        }
    }
}
