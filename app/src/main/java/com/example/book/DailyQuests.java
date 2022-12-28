package com.example.book;


import java.util.ArrayList;

public class DailyQuests {


    private int allQuests = 5;
    public boolean flag = false;
    public ArrayList<Integer> list = new ArrayList<>();
    public int qenNumber() {
        int a = 1 + (int) (Math.random() * allQuests);
        while (list.contains(a))
            a = 1 + (int) (Math.random() * allQuests);
        list.add(a);
        return a;
    }
}
