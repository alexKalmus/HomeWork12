package com.homeWork12;

public class StringTasks {
    static int countOf (String s, String needle){
        int index;
        int count = 0;
        for (int i = 0; i < s.length() ; i++) {
            index = s.indexOf(needle, i);
            if (index >= 0){
                count++;
                i = index + 1;
            }
        }
        return count;
    }
}
