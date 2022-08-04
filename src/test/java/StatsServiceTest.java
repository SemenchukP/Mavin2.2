import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void summa() {
        StatsService service = new StatsService();
        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void average() {
        StatsService service = new StatsService();
        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.average(sales);
        long expected = 180 / 12;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void countBe() {
        StatsService service = new StatsService();
        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int actual = service.countBeLowAvg(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void minSales() {
        StatsService service = new StatsService();
        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int actual = service.minSales(sales);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void maxSales() {
        StatsService service = new StatsService();
        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int actual = service.maxSales(sales);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void countBeAbove() {
        StatsService service = new StatsService();
        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int actual = service.countBeAboveAvg(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }


}
