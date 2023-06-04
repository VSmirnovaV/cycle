package ru.netology.services;
public class RestService {
    public int calculate(int income, int threshold, int expense) {
        int money = 0;
        int count = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = money - expense;
                money = threshold / 3;
            } else {
                money = money + income - expense;
            }
        }
        return count;
    }
}
