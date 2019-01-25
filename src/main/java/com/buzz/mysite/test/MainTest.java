package com.buzz.mysite.test;


import java.util.Arrays;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
         String[] strings = new String[10];
         Arrays.fill(strings,"sdsd");
        List<String> list   = Arrays.asList(strings);
        System.out.println("sdsd");
        System.out.println(Arrays.toString(strings));
    }
}
