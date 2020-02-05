package stockmarket;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        LocalDate d1 = LocalDate.of(2019, 1, 1);
        StockUpdate stockUp1 = new StockUpdate("AMZN", d1, 100);
        stockMarket.add(stockUp1);
        LocalDate d2 = LocalDate.of(2019, 3, 3);
        StockUpdate stockUp2 = new StockUpdate("AMZN", d2, 200);
        stockMarket.add(stockUp2);
        LocalDate d3 = LocalDate.of(2020, 5, 4);
        StockUpdate stockUp3 = new StockUpdate("MSFT", d3, 300);
        stockMarket.add(stockUp3);
        LocalDate d4 = LocalDate.of(2021, 5, 4);
        StockUpdate stockUp4 = new StockUpdate("AMZN", d4, 400);
        stockMarket.add(stockUp4);

        stockMarket.queryUpdates(d2, d4);
    }
}
