package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        int i = 0;
        map.put("Name"+(i++), new Date("JUNE 2 1981"));
        map.put("Name"+(i++), new Date("AUGUST 3 1982"));
        map.put("Name"+(i++), new Date("JUNE 4 1983"));
        map.put("Name"+(i++), new Date("JUNE 5 1984"));
        map.put("Name"+(i++), new Date("JUNE 6 1985"));
        map.put("Name"+(i++), new Date("JUNE 7 1986"));
        map.put("Name"+(i++), new Date("JUNE 8 1987"));
        map.put("Name"+(i++), new Date("JUNE 9 1988"));
        map.put("Name"+(i++), new Date("JANUARY 10 1989"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        //HashMap<String, Date> newMap = new HashMap<String, Date>();
        Iterator<HashMap.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            Date getDate = pair.getValue();
            if(getDate.getMonth()==5||getDate.getMonth()==6||getDate.getMonth()==7){
                System.out.println(""+pair.getValue()+"  "+pair.getKey());
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
