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

    }
}
