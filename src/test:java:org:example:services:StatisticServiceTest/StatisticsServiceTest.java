package org.example.services.StatisticsServiceTest;

import org.example.services.StatisticsService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class StatisticsServiceTest {
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxAllEqual() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {5, 5, 5, 5, 5};
        long expected = 5;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxSingleElement() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {10};
        long expected = 10;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxAllNegative() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {-5, -10, -3, -7};
        long expected = -3;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }
}
