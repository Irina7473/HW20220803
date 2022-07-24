package org.example;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Задание 1
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
        System.out.println();


        /*Задание 5
        Пользователь вводит с клавиатуры номер месяца (от 1 до 12). В зависимости от полученного номера месяца
        программа выводит на экран надпись: Winter, Spring, Summer, Autumn.
        Если пользователь ввел значение не в диапазоне от 1 до 12 требуется вывести сообщение об ошибке*/
        boolean ok=false;
        System.out.print("Введите номер месяца в виде целого числа от 1 до 12 -  ");

        while (!ok) {
            int month = in.nextInt();
            if (month > 12 || month < 1) {
                System.out.print("Вы не попали в диапазон от 1 до 12 Ведите снова -  ");
            } else {
                if (month ==1 || month ==2 || month ==12) System.out.print("Winter");
                else if (month > 2 && month < 6) System.out.print("Spring");
                else if (month > 5 && month < 9) System.out.print("Summer");
                else if (month > 8 && month < 12) System.out.print("Autumn");
                ok=true;
            }
        }


        /*Задание 6
        Пользователь вводит с клавиатуры количество метров. В зависимости от выбора пользователя
        программа переводит метры в мили, дюймы или ярды.*/

        System.out.print("Введите количество метров для конвертации -  ");
        int metr = in.nextInt();
        System.out.print("Введите единицу измерения для конвертации метров, 1 - мили, 2 - дюймы, 3 - ярды :  ");
        int unitLength = in.nextInt();
        switch(unitLength){

            case 1:
                System.out.println(metr + " метров = " + metr * 0.00062137 + " милей");
                break;
            case 2:
                System.out.println(metr + " метров = " + metr * 39.37 + " дюймов");
                break;
            case 3:
                System.out.println(metr + " метров = " + metr * 1.0936 + " ярдов");
                break;
            default:
                System.out.println("Неизвестная единица длины");
                return;
        }


        /*Задание 7
        Пользователь вводит с клавиатуры два числа. Нужно показать все нечетные числа в указанном диапазоне. 
        Если границы диапазона указаны неправильно требуется произвести нормализацию границ. */
        int num1, num2;
        System.out.print("Введите через пробел 2 целых числа, границы диапазона :  ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        int min = num1 < num2 ? num1 : num2;
        int max = num1 > num2 ? num1 : num2;
        System.out.print("Нечетные числа в указанном диапазоне :  ");
        for (int i = min; i<=max; i++)
            if ( i %2 != 0) System.out.print(i + ", ");


        /*Задание 8
        Показать на экран таблицу умножения в диапазоне, в указанном пользователем. */
        System.out.print("Введите через пробел 2 целых числа, границы диапазона :  ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        min = num1 < num2 ? num1 : num2;
        max = num1 > num2 ? num1 : num2;
        System.out.println("Таблица умножения для введенного диапазона");
        for (int i = min; i<=max; i++){
            for (int j = 1; j<=10; j++)
                System.out.print(i + "*" + j + "=" + i*j + " ");
            System.out.println();
            System.out.println("-----------------------------------------------");
        }

        /*Задание 9
        В одномерном массиве, заполненном случайными числами, определить минимальный и максимальный элементы,
        посчитать количество отрицательных и положительных элементов, посчитать количество нулей. */
        int [] nums = new int[10];
        Random rand = new Random();
        int pos=0, neg=0, zero=0, even=0, odd=0;
        for (int i =0; i<nums.length; i++) {
            nums[i] = -3 + rand.nextInt(7);
            System.out.print(nums[i] + " ");
            if(nums[i]==0) zero++;
            if(nums[i]>0) pos++;
            if(nums[i]<0) neg++;
            if(nums[i]%2 !=0) odd++;
                else if(nums[i]!=0) even++;
        }
        System.out.println();
        System.out.println("В сгенерированном массиве " +pos+ " положительных, " +neg+ " отрицательных, " +zero+ " нулевых, " +even+ " четных, " +odd+ " нечетных элементов");


        /*Задание 10
        Есть одномерный массив, заполненный случайными числами. На основании данных этого массива нужно:
        ■ Создать одномерный массив, содержащий только четные числа из первого массива;
        ■ Создать одномерный массив, содержащий только нечетные числа из первого массива;
        ■ Создать одномерный массив, содержащий только отрицательные числа из первого массива;
        ■ Создать одномерный массив, содержащий только положительные числа из первого массива. */
        int [] arrEven = new int[even];
        int [] arrOdd = new int[odd];
        int [] arrNeg = new int[neg];
        int [] arrPos = new int[pos];
        int e=0, o=0, n=0, p=0;
        for (int i =0; i<nums.length; i++) {
            if(nums[i]%2 !=0){
                arrOdd[o] = nums[i];
                o++;
            }
            else if(nums[i]!=0) {
                arrEven[e] = nums[i];
                e++;
            }
            if(nums[i]<0) {
                arrNeg[n] = nums[i];
                n++;
            }
            if(nums[i]>0) {
                arrPos[p] = nums[i];
                p++;
            }
        }
        System.out.println(Arrays.toString(arrEven));
        System.out.println(Arrays.toString(arrOdd));
        System.out.println(Arrays.toString(arrNeg));
        System.out.println(Arrays.toString(arrPos));

    }
}