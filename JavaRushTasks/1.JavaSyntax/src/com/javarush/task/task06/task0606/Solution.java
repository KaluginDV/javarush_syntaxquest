package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sN = bufferedReader.readLine();
        int n;

        for (int i = 0; i < sN.length(); i++){
            n = Integer.parseInt(sN.substring(i,i+1)); //преобразовываем строку в число.
            if(n%2==0){
                Solution.even++;
            }
            else{
                Solution.odd++;
            }
        }

        System.out.println("Even: "+Solution.even+" Odd: "+Solution.odd);

    }
}
