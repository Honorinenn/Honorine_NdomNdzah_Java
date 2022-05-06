package com.company;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calReturn = new Calculator();
         int a = 1;
         int b = 1;
        System.out.println(calReturn.add(a, b));

        a = 23;
        b = 52;
        System.out.println(calReturn.subtract(a, b));

        a = 34;
        b = 2;
        System.out.println(calReturn.multiply(a, b));

        a = 12;
        b = 3;
        System.out.println(calReturn.divide(a, b));

        a = 12;
        b = 7;
        System.out.println(calReturn.divide(a, b));

        double c =3.4;
        double d =2.3;
        System.out.println(calReturn.add(c, d));

        c = 6.7;
        d = 4.4;
        System.out.println(calReturn.multiply(c, d));

        c = 5.5;
        d = 0.5;
        System.out.println(calReturn.subtract(c, d));

        c = 10.8;
        d = 2.2;
        System.out.println(calReturn.divide(c, d));




        System.out.println();


    }
}
