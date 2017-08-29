package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Family1","Name1");
        map.put("Family2","Name");
        map.put("Family3","Name1");
        map.put("Family4","Name");
        map.put("Family5","Name2");
        map.put("Family6","Name3");
        map.put("Family7","Name4");
        map.put("Family8","Name5");
        map.put("Family9","Name6");
        map.put("Family0","Name7");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        ArrayList<String> tempArray = new ArrayList<>();
        ArrayList<String> tempArray2 = new ArrayList<>();
        ArrayList<String> tempArray3 = new ArrayList<>();
        for (Map.Entry<String, String> pair : copy.entrySet()){
            tempArray.add(pair.getValue());
            tempArray2.add(pair.getValue());
        }
        for (String name : tempArray){
            int duplicateCount = 0;
            for (String name2 : tempArray2){
                if (name==name2) {
                    duplicateCount++;
                }
            }
            if (duplicateCount>1){
                tempArray3.add(name);
            }
        }
        for (String name4 : tempArray3){
            removeItemFromMapByValue(map, name4);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey()+ " " + pair.getValue());
        }
        removeTheFirstNameDuplicates(map);
        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey()+ " " + pair.getValue());
        }
    }
}
