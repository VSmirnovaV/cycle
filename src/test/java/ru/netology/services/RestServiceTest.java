package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.services.RestService;

public class RestServiceTest {

    @Test
    void Example1() {
        RestService service = new RestService();

        // подготавливаем данные:
        int income = 10_000;
        int expenses = 3_000;
        int threshold  = 20_000;
        int expected = 3;

        // вызываем целевой метод:
        int actual = service.calculate(income, threshold, expenses);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void Example2() {
        RestService service = new RestService();

        // подготавливаем данные:
        int income = 100_000;
        int expenses = 60_000;
        int threshold  = 150_000;
        int expected = 2;

        // вызываем целевой метод:
        int actual = service.calculate(income, threshold, expenses);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}