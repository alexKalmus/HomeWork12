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
        System.out.printf("[%s] is count %d times in [%s] \n",needle,count,s);
        System.out.println("Enter the key of Cesar crypt");
        int key = sc.nextInt();
        sc.nextLine();
        String cesarS = StringTasks.cesarCrypt(s,key);
        System.out.printf("String in Cesar crypt: [%s] \n", cesarS);
        System.out.println("Enter the string of number");
        Contact[] contacts = StringTasks.parseContacts(sc.nextLine());
        for (int i = 0; i < contacts.length; i++) {
            System.out.println(contacts[i].toString());
        }

    }
}
