package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Задание 1
        System.out.println("“Your time is limited,\n" +
                "\t so don’t waste it \n" +
                " \t\t living someone else’s life”\n" +
                " \t\t\t Steve Jobs");

        //Задание 2
        System.out.println("Введите число");
        int number = in.nextInt();
        System.out.println("Введите процент, который нужно посчитать, в виде целого числа");
        int percent = in.nextInt();
        System.out.println("Введенный процент от введенного числа равен " + number * percent / 100);

        //Задание 3
        int a, b, c;
        System.out.println("Введите 3 цифры через пробел");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        System.out.println("Из введенных цифр получаем число " + a + b + c);

        //Задание 4
    }
}