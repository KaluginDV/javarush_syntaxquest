package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sN1 = bufferedReader.readLine();
        String sN2 = bufferedReader.readLine();
        String sN3 = bufferedReader.readLine();
        int n1 = Integer.parseInt(sN1);
        int n2 = Integer.parseInt(sN2);
        int n3 = Integer.parseInt(sN3);

        if ((n1 >= n2) & (n1 >= n3))
            System.out.println((n3 < n2) ? n2 : n3);
        else if ((n2 >= n1) & (n2 >= n3))
            System.out.println((n1 > n3) ? n1 : n3);
        else if ((n3 >= n1) & (n3 >= n2))
            System.out.println((n1 > n2) ? n1 : n2);
    }
}
