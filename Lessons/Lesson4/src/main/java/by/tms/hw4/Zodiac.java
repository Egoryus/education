package by.tms.hw4;

import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {


        //4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.

            System.out.println("ведите день");
            Scanner scan = new Scanner(System.in);
            int day = scan.nextInt();
            System.out.println("Введите месяц");
            int mes = scan.nextInt();
            if ((mes == 1) && (day >= 21) || (mes == 2) && (day <= 19)) {
                System.out.println("Водолей");
            } else if ((mes == 2) && (day >= 20) || (mes == 3) && (day <= 20)) {
                System.out.println("рыбы");
            } else if ((mes == 3) && (day >= 21) || (mes == 4) && (day <= 20)) {
                System.out.println("овен");
            } else if ((mes == 4) && (day >= 21) || (mes == 5) && (day <= 21)) {
                System.out.println("телец");
            } else if ((mes == 5) && (day >= 22) || (mes == 6) && (day <= 21)) {
                System.out.println("Близнецы");
            } else if ((mes == 6) && (day >= 22) || (mes == 7) && (day <= 22)) {
                System.out.println("Рак");
            } else if ((mes == 7) && (day >= 23) || (mes == 8) && (day <= 21)) {
                System.out.println("Лев");
            } else if ((mes == 8) && (day >= 22) || (mes == 9) && (day <= 23)) {
                System.out.println("Дева");
            } else if ((mes == 9) && (day >= 24) || (mes == 10) && (day <= 23)) {
                System.out.println("Весы");
            } else if ((mes == 10) && (day >= 24) || (mes == 11) && (day <= 23)) {
                System.out.println("Скорпион");
            } else if ((mes == 11) && (day >= 24) || (mes == 12) && (day <= 22)) {
                System.out.println("Стрелец");
            } else if ((mes == 12) && (day <= 23) || (mes == 1) && (day <= 20)) {
                System.out.println("Козерог");
            }
        }
    }
