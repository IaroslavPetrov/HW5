package com.company;

public class Main {

    public static void main(String[] args) {

        // Задача 1
        int i = 1;
        int f;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (f = 10; f >= 1; f--) {
            System.out.print(f + " ");
        }
        System.out.println();

        // Задача 2
        int startFriday = 1;
        int nextFriday;
        for (nextFriday = startFriday; nextFriday <= 31; nextFriday += 7) {
            System.out.println("Сегодня пятница, " + nextFriday + "-е число. Необходимо подготовить отчет");
        }

        // Задача 3
        int cometFlyby = 79;
        int year = 2021;
        int yearTo = year - 200;
        int yearAfter = year + 100;
        for (int y = yearTo; y <= yearAfter; y++) {
            if (y % cometFlyby == 0) {
                System.out.println(y);
            }
        }

        // Задача 4
        for (i = 1; i <= 30; i++) {
            System.out.print(i + ": ");
            if (i % 3 == 0) {
                System.out.print("ping ");
            }
            if (i % 5 == 0) {
                System.out.print("pong");
            }
            System.out.println();
        }

        // Задача 5
        int f0 = 0;
        int f1 = 1;
        for (int y = 1; y < 11; y++){
            System.out.print(f0 + " ");
            f1 = f0 + f1;
            f0 = f1 - f0;
        }
    }
}
