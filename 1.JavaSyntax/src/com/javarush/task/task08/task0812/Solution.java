package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }

        int mostLenght = 1;
        int firstNum = list.get(0);
        int currentMostLenght = 1;

        for(int i = 1; i < list.size(); i++){
            if(firstNum == list.get(i)){
                currentMostLenght++;
                if (currentMostLenght > mostLenght) {
                    mostLenght++;
                }
            }
            else{
                firstNum = list.get(i);
                currentMostLenght = 1;
            }
        }

        System.out.println(mostLenght);
    }
}