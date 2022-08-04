public class StatsService {

    public long sum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long average(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum / 12;
    }

    public int countBeLowAvg(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                count++;
            }
        }
        return count;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int countBeAboveAvg(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                count++;
            }
        }
        return count;
    }
}