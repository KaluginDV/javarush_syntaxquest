package com.javarush.task.task08.task0821;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> newMap = new HashMap<>();
        newMap.put("Иванов","Иван");
        newMap.put("Иванов","Иван");
        newMap.put("Иванов","Петр");
        newMap.put("Иванов","Иван");
        newMap.put("Петров","Иван");
        newMap.put("Иванов","Иван");
        newMap.put("Иванов","Иван");
        newMap.put("Иванов","Иван");
        newMap.put("Иванов","Иван");
        newMap.put("Иванов","Иван");
        return newMap;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
