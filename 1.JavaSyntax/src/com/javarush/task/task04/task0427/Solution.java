package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sN1 = bufferedReader.readLine();

        int n1 = Integer.parseInt(sN1);

        if(n1>=1 && n1<=999){
            if(n1%2==0){
                System.out.print("четное");
            }
            else {
                System.out.print("нечетное");
            }
            if(n1>9){
                if(n1>99){
                    System.out.println(" трехзначное число");
                }
                else {
                    System.out.println(" двузначное число");
                }
            }
            else {
                System.out.println(" однозначное число");
            }
        }

    }
}
