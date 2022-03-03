package ru.job4j.loop;

public class Abbreviation {
   public static String collect(String s) {
        StringBuilder aString = new StringBuilder();

       for (String i : s.split(" ")) {
           aString.append(i.substring(0, 1));
       }
       return aString.toString();
    }
}

