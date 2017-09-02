package com.javarush.task.task09.task0928;

import java.io.*;

/* 
Код не компилится…
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        InputStream fileInputStream = getInputStream(sourceFileName);
        OutputStream fileOutputStream = getOutputStream(destinationFileName);

        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer, 0, buffer.length);
        fileOutputStream.write(buffer,0,buffer.length);

        /*int count = 0;
        while (fileInputStream.available() > 0) ;
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
            count++;
        }*/

        System.out.println("Скопировано байт " + buffer.length);

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}
