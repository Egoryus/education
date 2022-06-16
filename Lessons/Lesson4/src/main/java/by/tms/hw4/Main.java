package by.tms.hw4;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    //1) Задача на оператор switch!
    // Рандомно генерируется число От 1 до 7.
    // Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
    // Если 6 или 7 – “Выходной”.
    public static void task1() {
        Random randomich = new Random();
        int randomDay = randomich.nextInt(7);
        if (randomDay == 0) randomDay++;
        switch (randomDay) {
            case 1:
                System.out.println(randomDay + " Monday.");
                break;
            case 2:
                System.out.println(randomDay + " Tuesday.");
                break;
            case 3:
                System.out.println(randomDay + " Wednesday.");
                break;
            case 4:
                System.out.println(randomDay + " Thursday.");
                break;
            case 5:
                System.out.println(randomDay + " Friday.");
                break;
            case 6, 7:
                System.out.println(randomDay + " Weekends.");

        }


    }
    //2) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
    //сколько амеб будет через 3, 6, 9, 12,..., 24 часа
    public static void task2(){
        System.out.println("Амебы");
        int amb = 1;
        int hr = 24;

            for (int i = 1; i <= hr / 3; i++) {
                amb *= 2;
                System.out.println(amb);
            }


    }
    //3) В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"
    public static void task3() {
        System.out.println("ведите число");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String str = String.valueOf(num);
        int count = str.length();
        if (num<0) count-=1;
        System.out.println("кол-во цифр " + count);
        if (num > 0) {
            System.out.println("положительное");
        } else if (num < 0) {
            System.out.println("отрицательное");
        }else
            System.out.println("ноль");

    }
    //4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.
    public static void task4(){
        System.out.println("ведите день");
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        System.out.println("Введите месяц");
        int mes = scan.nextInt();
        if((mes == 1) && (day >= 21) || (mes ==2) && (day<=19)){
            System.out.println("Водолей");
        }else if ((mes == 2) && (day >= 20) || (mes ==3) && (day<=20)){
            System.out.println("рыбы");
        }else if ((mes == 3) && (day >= 21) || (mes ==4) && (day<=20)){
            System.out.println("овен");
        }else if ((mes == 4) && (day >= 21) || (mes ==5) && (day<=21)){
            System.out.println("телец");
        }else if ((mes == 5) && (day >= 22) || (mes ==6) && (day<=21)){
            System.out.println("Близнецы");
        }else if ((mes == 6) && (day >= 22) || (mes ==7) && (day<=22)){
            System.out.println("Рак");
        }else if ((mes == 7) && (day >= 23) || (mes ==8) && (day<=21)){
            System.out.println("Лев");
        }else if ((mes == 8) && (day >= 22) || (mes ==9) && (day<=23)){
            System.out.println("Дева");
        }else if ((mes == 9) && (day >= 24) || (mes ==10) && (day<=23)){
            System.out.println("Весы");
        }else if ((mes == 10) && (day >= 24) || (mes ==11) && (day<=23)){
            System.out.println("Скорпион");
        }else if ((mes == 11) && (day >= 24) || (mes ==12) && (day<=22)){
            System.out.println("Стрелец");
        }else if ((mes == 12) && (day <= 23) || (mes ==1) && (day<=20)){
            System.out.println("Козерог");
        }

    }
    // /**
    //     * Необходимо прочитать с консоли значение числа типа int,
    //     * сделать проверку что если пользователь ввел не положительное число,
    //     * то вывести ошибку и отправить пользователя вводить заново новое число!
    //     * далее создать одномерный массив типа int размера прочитанного с консоли
    //     * далее заполнить массив случайными значениями
    //     * далее вывести массив на консоль
    public static void task5(){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи положительное число");
        int chislo = sc.nextInt();
        while (chislo<0){
            System.out.println("Разве оно положительное?");
            chislo = sc.nextInt();
        }
        System.out.println("наконец-то");
        int[] array = new int[chislo];
        for(int i=0;i<chislo;i++) {
            array[(int) i] = rand.nextInt();
            System.out.print(array[i] + " ");
        }

    }
    
}

