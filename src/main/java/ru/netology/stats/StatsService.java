package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales) {
        int sumSale = 0;

        for (int i = 0; i < sales.length; i++) {
            sumSale += sales[i];
        }
        return sumSale;
    }

    public int averageSales(int[] sales) {
        int sumSale = sumSales(sales);
        int averSale = sumSale / sales.length;
        return averSale;
    }

    public int bestSales(int[] sales) {
        int bestSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[bestSale]) {
                bestSale = i;
            }
        }
        return bestSale + 1;
    }

    public int minSales(int[] sales) {
        int minSale = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minSale]) {
                minSale = i;
            }
        }
        return minSale + 1;
    }

    public int belowAverSales(int[] sales) {
        int averSale = averageSales(sales);
        int mounthsBelAvSa = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averSale) {
                mounthsBelAvSa = mounthsBelAvSa + 1;
            }
        }
        return mounthsBelAvSa;
    }

    public int aboveAverSales(int[] sales) {
        int averSale = averageSales(sales);
        int mounthsAbAvSa = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averSale) {
                mounthsAbAvSa = mounthsAbAvSa + 1;
            }
        }
        return mounthsAbAvSa;
    }
}
