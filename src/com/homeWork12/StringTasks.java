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
    static String cesarCrypt (String s, int key){
        char[] cesarArr = s.toCharArray();
        char[] firstSymbol = new char[key];
        for (int i = cesarArr.length - key, j = 0 ; j < key; i++, j++) {
            firstSymbol[j] = cesarArr [i];
        }
        for (int i = cesarArr.length -1; i >= key; i--) {
                cesarArr[i] = cesarArr[i-key];
        }

        for (int i = 0; i < firstSymbol.length; i++) {
            cesarArr[i] = firstSymbol[i];
        }
        String cesarS = String.valueOf(cesarArr);
        return cesarS;
    }

    static Contact[] parseContacts(String s){
        String[] namesAndNumbers = s.split(";");
        Contact[] contacts = new Contact[namesAndNumbers.length];
        for (int i = 0; i < contacts.length; i++) {
            String[] simple = namesAndNumbers[i].split(":");
            simple[0] = simple[0].trim();
            simple[1] = simple[1].trim();
            contacts[i] = new Contact(simple[0], simple[1]);
        }
        return contacts;
    }
}
