package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.RestMonthsService;

public class RestMonthsServiceTest {

    @Test
    public void testRegisteredUnderLimit(int income, int expenses, int threshold) {
        RestMonthsService service = new RestMonthsService();

        int expected = 10_000, 2_000, 20_000;
        int actual = service.calcMonths(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
