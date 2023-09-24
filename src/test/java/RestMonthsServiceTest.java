package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RestMonthsServiceTest {

    @Test
    public void testRegisteredUnderLimit(int income, int expenses, int threshold) {
        org.example.RestMonthsService service = new org.example.RestMonthsService();

        int expected = 10_000, 3_000, 20_000;
        int actual = service.calcMonths(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
