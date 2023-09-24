package org.example;
package ru.netology.services.javaqamvn.services;

public class RestMonthsService {

    public int calcMonths (int income, int expenses, int threshold) {
        int count = 0; // месяцев отдыха
        int money = 0; // денег на счету

        for (int month = 0; month <= 12; month++) {
            if (money >= threshold) {
                count++;
                money = money - expenses - (money - (money / 3));
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
