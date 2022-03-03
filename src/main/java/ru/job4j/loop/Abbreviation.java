package ru.job4j.loop;

public class Abbreviation {
   public static String collect(String s) {
        StringBuilder aString = new StringBuilder();
       //перебираем элементы массива, массив создаём методом сплит до пробела
       for (String i : s.split(" ")) {
           //в строку астринг добавляем значение каждого элемента массива с индексам 0 и 1
           aString.append(i.substring(0, 1));
       }
       return aString.toString();
    }
}

