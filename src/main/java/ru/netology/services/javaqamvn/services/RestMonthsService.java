package ru.netology.services.javaqamvn.services;

public class RestMonthsService {

    public int calcMonths(int income, int expenses, int threshold) {
        int count = 0; // месяцев отдыха
        int money = 0; // денег на счету

        for (int month = 0; month <= 12; month++) {
            if (money >= threshold) { // если денег на счету достаточно
                count++; // прибавляем месяц
                money = (money - expenses) / 3; // остаток накоплений уменьшается в три раза (отдых)
            } else {
                money = money + income - expenses; // остаток увеличиваем на income и вычитаем expenses
            }
        }
        return count;
    }
}
