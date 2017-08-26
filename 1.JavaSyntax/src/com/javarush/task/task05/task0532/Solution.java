package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        //напишите тут ваш код
        int maximum = Integer.parseInt(reader.readLine());
        if(n>0){
            for(int i = 1; i < n; i++){
                int temp = Integer.parseInt(reader.readLine());
                if(temp>maximum){
                    maximum = temp;
                }
            }
        }

        System.out.println(maximum);
    }
}
