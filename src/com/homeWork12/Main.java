package com.homeWork12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println("Enter the fragment");
        String needle = sc.nextLine();
        int count = StringTasks.countOf(s, needle);
        System.out.printf("[%s] is count %d times in [%s]",needle,count,s);
    }
}
