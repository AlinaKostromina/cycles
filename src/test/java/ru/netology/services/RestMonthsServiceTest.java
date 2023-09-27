package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.javaqamvn.services.RestMonthsService;

public class RestMonthsServiceTest {

    @Test
    public void calcMonthsToRest() {
        RestMonthsService service = new RestMonthsService();

        int expected = 3;
        int actual = service.calcMonths(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }
}
