package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> mainList = new ArrayList();
        ArrayList<Integer> listMod3 = new ArrayList();
        ArrayList<Integer> listMod2 = new ArrayList();
        ArrayList<Integer> listOther = new ArrayList();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 20; i++){
            String tempString = reader.readLine();
            mainList.add(Integer.parseInt(tempString));
        }

        for(int i = 0; i < 20; i++){
            if(mainList.get(i)%3==0||mainList.get(i)%2==0) {
                if (mainList.get(i) % 3 == 0&&mainList.get(i) % 2 == 0) {
                    listMod3.add(mainList.get(i));
                    listMod2.add(mainList.get(i));
                }
                else if (mainList.get(i) % 3 == 0) {
                    listMod3.add(mainList.get(i));
                }
                else if (mainList.get(i) % 2 == 0) {
                    listMod2.add(mainList.get(i));
                }
            }
            else{
                listOther.add(mainList.get(i));
            }
        }

        printList(listMod3);
        printList(listMod2);
        printList(listOther);

    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
