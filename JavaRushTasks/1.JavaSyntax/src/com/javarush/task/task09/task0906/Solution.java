package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        //int stackLenght = stackTraceElements.length;
        String callClass = stackTraceElements[2].getClassName();
        String callMethod = stackTraceElements[2].getMethodName();
        String callLog = callClass+": "+callMethod+": ";
        System.out.println(callLog+s);
    }
}
