package com.company;
import java.util.Scanner;

public class Main {
    public Main() {
    }
    public static void main(String[] args) {
        Hashtable map= new Hashtable(10);
        map.put("one",1);
        map.put("two",2);
        map.put("three",30);
        int val = map.get("three");
                System.out.println(val);
    }
}

