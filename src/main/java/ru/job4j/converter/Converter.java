package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return  rsl;
    }

    public static void main(String[] args) {

        float rslt = Converter.rubleToEuro(140);
        float rslt2 = Converter.rubleToDollar(140);

        System.out.println("140 rubles are " + rslt + " euro.");
        System.out.println("140 rubles are " + rslt2 + " dollar.");
    }
}