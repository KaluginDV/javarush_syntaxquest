package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sN1 = bufferedReader.readLine();

        int n1 = Integer.parseInt(sN1);

        if(n1 == 0){
            System.out.println("ноль");
        }
        else if(n1 < 0 && n1%2==0){
            System.out.println("отрицательное четное число");
        }
        else if(n1 < 0 && n1%2!=0){
            System.out.println("отрицательное нечетное число");
        }
        else if(n1 > 0 && n1%2==0){
            System.out.println("положительное четное число");
        }
        else if(n1 > 0 && n1%2!=0){
            System.out.println("положительное нечетное число");
        }

    }
}
