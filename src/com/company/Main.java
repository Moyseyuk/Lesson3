package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("1. Управляющие конструкции\n2. Циклы\n3. Дополнительное задание");
        System.out.println("4. Введите любой другой номер для выхода");
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите какой блок домашнего задания хотите проверить:");

        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            switch (i){
                case (1):
                    System.out.println("1. Вывод поры года по номеру месяца (оператор switch-case)");
                    System.out.println("2. Вывод поры года по номеру месяца (оператор if-else-if)");
                    System.out.println("3. Проверка числа на чётность");
                    System.out.println("4. Проверка температуры");
                    System.out.println("5. Узнать цвет радуги");
                    System.out.println("Выберите какой пункт хотите проверить:");
                    if (sc.hasNextInt()) {
                        int scr1 = sc.nextInt();
                        switch (scr1){
                            case (1):
                                mounth();
                                break;
                            case (2):
                                timeOfTheYear();
                                break;
                            case (3):
                                division();
                                break;
                            case (4):
                                temperature();
                                break;
                            case (5):
                                rainbow();
                                break;
                            default:
                                System.out.println("Выберите один из 5-ти пунктов");
                                break;
                        }
                    } else {
                        System.out.println("Извините, но вы ввели явно не число. Перезапустите программу и попробуйте снова!");
                    }
                    break;
                case (2):
                    System.out.println("1. Вывод нечётных чисел от 1 до 99");
                    System.out.println("2. Вывод чисел от 5 до 1");
                    System.out.println("3. сумма предыдущих чисел");
                    System.out.println("4. Вывод последовательности");
                    System.out.println("5. Вывод первых 10 чисел последовательности");
                    System.out.println("6. Вывод квадратов чисел");
                    System.out.println("Выберите какой пункт хотите проверить:");
                    if (sc.hasNextInt()) {
                        int scr2 = sc.nextInt();
                        switch (scr2){
                            case (1):
                                odd();
                                break;
                            case (2):
                                output();
                                break;
                            case (3):
                                sum();
                                break;
                            case (4):
                                subsequence();
                                break;
                            case (5):
                                subsq();
                                break;
                            case (6):
                                squaring();
                                break;
                            default:
                                System.out.println("Выберите один из 6-ти пунктов");
                                break;
                        }
                    } else {
                        System.out.println("Извините, но вы ввели явно не число. Перезапустите программу и попробуйте снова!");
                    }
                    break;
                case (3):
                    System.out.println("1. Первые 11 членов последовательности Фибоначи");
                    System.out.println("2. Расчёт процентов вклада");
                    System.out.println("3. Таблица умножения");
                    System.out.println("Выберите какой пункт хотите проверить:");
                    if (sc.hasNextInt()) {
                        int scr3 = sc.nextInt();
                        switch (scr3){
                            case (1):
                                fibonachi();
                                break;
                            case (2):
                                bank();
                                break;
                            case (3):
                                multiplication();
                                break;
                            default:
                                System.out.println("Выберите один из 3-х пунктов");
                                break;
                        }
                    } else {
                        System.out.println("Извините, но вы ввели явно не число. Перезапустите программу и попробуйте снова!");
                    }
                    break;
                default:
                    return;
            }
        } else {
            System.out.println("Извините, но вы ввели явно не число. Перезапустите программу и попробуйте снова!");
        }

    }

    public static void mounth(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца:");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            switch (number){
                case (1):
                case (2):
                case (12):
                    System.out.println("Вы ввели номер месяца зимы");
                    break;
                case (3):
                case (4):
                case (5):
                    System.out.println("Вы ввели номер месяца весны");
                    break;
                case (6):
                case (7):
                case (8):
                    System.out.println("Вы ввели номер месяца лета");
                    break;
                case (9):
                case (10):
                case (11):
                    System.out.println("Вы ввели номер месяца осени");
                    break;
                default:
                    System.out.println("Гугл вам в помощь");
                    break;
            }
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }

    public static void timeOfTheYear(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца:");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            if ((number > 0 && number < 3) || (number == 12)){
                System.out.println("Вы ввели номер месяца зимы");
            }else{
                if (number > 2 && number < 6){
                    System.out.println("Вы ввели номер месяца весны");
                } else{
                    if (number > 5 && number < 9){
                        System.out.println("Вы ввели номер месяца лета");
                    } else{
                        if (number > 8 && number < 12){
                            System.out.println("Вы ввели номер месяца осени");
                        } else{
                            System.out.println("Гугл вам в помощь");
                        }
                    }
                }
            }
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }

    public static void division(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            int div = number % 2;
            if (div == 0) {
                System.out.println("Вы ввели чётное число");
            } else {
                System.out.println("Вы ввели нечётное число");
            }
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }

    public static void temperature(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите температуру на улице:");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            if (number > -5){
                System.out.println("На улице тепло");
            }else{
                if (number > -20 && number <= 5){
                    System.out.println("На улице нормально");
                } else{
                            System.out.println("На улице холодно");
                }
            }
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }

    public static void rainbow(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер цвета радуги:");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            switch (number){
                case (1):
                    System.out.println("Красный");
                    break;
                case (2):
                    System.out.println("Оранжевый");
                    break;
                case (3):
                    System.out.println("Жёлтый");
                    break;
                case (4):
                    System.out.println("Зелёный");
                    break;
                case (5):
                    System.out.println("Голубой");
                    break;
                case (6):
                    System.out.println("Синий");
                    break;
                case (7):
                    System.out.println("Фиолетовый");
                    break;
                default:
                    System.out.println("Гугл вам в помощь");
                    break;
            }
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }

    public static void odd(){
        for (int count = 0; count >= 0 && count <= 100; count++){
            if(count % 2 != 0){
                System.out.print(count + "; ");
            }
        }
    }

    public static void output(){
        for (int count = 5; count > 0; count--){
            System.out.print(count + "; ");
        }
    }

    public static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число:");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
                if (number > 0){
                    int sum = 0;
                    for (int count = 1; count < number; count++){
                        sum += count;
                    }
                    System.out.println("Сумма всех чисел до введённого вами = " + sum);
                }else{
                    System.out.println("Извините, но это явно не положительное число. Перезапустите программу и попробуйте снова!");
                }
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }

    public static void subsequence(){
        int sub = 0;
        int count = 7;
        while (sub < 93){
            sub += count;
            System.out.print(sub + "; ");
        }
    }

    public static void subsq(){
        int num = 0;
        for (int count = 1; count <= 10; count++){
            System.out.print(num + "; ");
            num -= 5;
        }
    }

    public static void squaring(){
        for (int count = 10; count <= 20; count++){
            System.out.print((int)Math.pow(count, 2) + "; ");
        }
    }

    public static void fibonachi(){
        int a = 1;
        int b = 1;
        System.out.print(a + "; " + b + "; ");
        int c;
        for (int count = 3; count <= 11; count++){
            c = a + b;
            System.out.print(c + "; ");
            a = b;
            b = c;

        }
    }

    public static void bank(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму вклада под 7% в месяц: ");
        if (sc.hasNextFloat()){
            float money = sc.nextFloat();
            System.out.println("На сколько месяцев вы хотите сделать вклад?");
            if (sc.hasNextInt()){
                int mounth = sc.nextInt();
                for (int count = 1; count <= mounth; count++){
                    money = money + (money / 100) * 7;
                }
                System.out.format("%.3f",money);
            } else{
                System.out.println("Вы ввели явно не количество месяцев. Перезапустите программу и попробуйте ещё раз!");
            }
        } else{
            System.out.println("Вы ввели явно не сумму вклада. Перезапустите программу и попробуйте ещё раз!");
        }
    }

    public static void multiplication(){
        for(int count = 1; count <= 9; count++){
            System.out.println("Таблица умножения на " + count + ":");
            for(int counter = 1; counter <= 9; counter++){
                System.out.print(count + "x" + counter + "=" + count*counter + "; ");
            }
            System.out.println("\n");
        }
    }
}
