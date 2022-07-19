package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void salesForAllMounth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public  void AverageSalesForAllMounth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAv = 15;
        int actualAv = service.averageSales(sales);

        Assertions.assertEquals(expectedAv, actualAv);
    }

    @Test
    public  void WhichLastMounthBestSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBest = 8;
        int actualBest = service.bestSales(sales);

        Assertions.assertEquals(expectedBest, actualBest);
    }

    @Test
    public  void WhichLastMounthMinSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMin = 9;
        int actualMin = service.minSales(sales);

        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void ManyMounthsBelowAverSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBel = 5;
        int actualBel = service.belowAverSales(sales);
        Assertions.assertEquals(expectedBel, actualBel);
    }

    @Test
    public void ManyMounthsAboveAverSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAb = 5;
        int actualAb = service.aboveAverSales(sales);
        Assertions.assertEquals(expectedAb, actualAb);
    }
}
