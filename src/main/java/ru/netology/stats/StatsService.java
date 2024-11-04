package ru.netology.stats;

public class StatsService {
    public long calculateTotalSale(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long calculateAverageAmountSale(long[] sales) {
        long totalSale = calculateTotalSale(sales);
        long averageAmountSale = calculateTotalSale(sales) / 12;
        return averageAmountSale;
    }

    public int calculateMonthMaxSale(long[] sales) {
        int monthMaxSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaxSale]) {
                monthMaxSale = i;
            }

        }
        return monthMaxSale + 1;
    }

    public int calculateMonthMinSale(long[] sales) {
        int monthMinSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinSale]) {
                monthMinSale = i;
            }

        }
        return monthMinSale + 1;
    }

    public int calculateMonthsBellowAverage(long[] sales) {
        int numberMonths = 0;
        long averageAmountSale = calculateAverageAmountSale(sales);
        for (long sale : sales) {
            if (sale < averageAmountSale) {
                numberMonths++;
            }
        }
        return numberMonths;
    }

    public int calculateMonthsAboveAverage(long[] sales) {
        int numberMonths = 0;
        long averageAmountSale = calculateAverageAmountSale(sales);
        for (long sale : sales) {
            if (sale > averageAmountSale) {
                numberMonths++;
            }
        }
        return numberMonths;
    }

}
