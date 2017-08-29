package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        /*String formattedString;
        formattedString = s.substring(0,1).toUpperCase();
        Boolean up = false;
        for(int i = 1; i < s.length(); i++){
            String sym;
            String sym1;
            sym = s.substring(i,i+1);
            if(up){
                if (s.substring(i,i+1).equals(" ")) {
                    sym1 = sym;
                }
                else {
                    sym1 = sym.toUpperCase();
                }
                up = false;
            }
            else {
                sym1 = sym;
            }
            if (s.substring(i,i+1).equals(" ")){
                up = true;
            }
            formattedString += sym1;
        }
        s = formattedString;
        System.out.println(s);*/
        for (String sUpp : s.split("\\b")){
            System.out.print(sUpp.replaceFirst(sUpp.substring(0,1),sUpp.substring(0,1).toUpperCase()));
        }
    }
}
