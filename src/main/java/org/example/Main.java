package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*//Задание 1
        //Выведите на экран надпись
        System.out.println("“Your time is limited,\n" +
                "\t so don’t waste it \n" +
                " \t\t living someone else’s life”\n" +
                " \t\t\t Steve Jobs");

        //Задание 2
        //Пользователь вводит с клавиатуры два числа. Первоечисло — это значение, второе число процент,
        // который  необходимо посчитать.
        System.out.print("Введите число  ");
        int number = in.nextInt();
        System.out.print("Введите процент, который нужно посчитать, в виде целого числа  ");
        int percent = in.nextInt();
        System.out.println("Введенный процент от введенного числа равен " + number * percent / 100);

        //Задание 3
        //Пользователь вводит с клавиатуры три цифры. Необходимо создать число, содержащее эти цифры
        int a, b, c;
        System.out.print("Введите 3 цифры через пробел  ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        System.out.println("Из введенных цифр получаем число " + a + b + c);
*/
        /*Задание 4
        Пользователь вводит шестизначное число. Необходимо поменять в этом числе первую и шестую цифры,
        а также  вторую и пятую цифры.  Если пользователь ввел не шестизначное число
        требуется вывести сообщение об ошибке*/

        System.out.println("Введите 6-тизначное число  ");
        String str = in.nextLine();
        str = str.trim();
        if(str==null || str.length() < 6) {
            System.out.println("Вы ввели менее 6 знаков");
            return;
        }
        if(str.length() > 6) {
            System.out.println("Вы ввели более 6 знаков");
            return;
        }
        char[] arr=str.toCharArray();
        for (int i=0; i<str.length(); i++){
            if ( !Character.isDigit(arr[i])) {
                System.out.println("Вы ввели не 6-тизначное число");
                return;
            }
        }
        char temp = arr[5];
        arr[5] =arr[0];
        arr[0] = temp;
        temp = arr[4];
        arr[4] = arr[1];
        arr[1] = temp;

        for (int i=0; i<str.length(); i++) System.out.print(arr[i]);


        /*Задание 5
        Пользователь вводит с клавиатуры номер месяца (от 1 до 12). В зависимости от полученного номера месяца
        программа выводит на экран надпись: Winter, Spring, Summer, Autumn.
        Если пользователь ввел значение не в диапазоне от 1 до 12 требуется вывести сообщение об ошибке*/



    }
}