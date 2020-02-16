package stockmarket;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();
        LocalDate d1 = LocalDate.of(2019, 1, 1);
        StockUpdate stockUp1 = new StockUpdate("AMZN", d1, 100);
        stockMarket.addd(stockUp1);
        LocalDate d2 = LocalDate.of(2019, 3, 3);
        StockUpdate stockUp2 = new StockUpdate("AMZN", d2, 200);
        stockMarket.addd(stockUp2);
        LocalDate d3 = LocalDate.of(2020, 5, 4);
        StockUpdate stockUp3 = new StockUpdate("MSFT", d2, 300);
        stockMarket.addd(stockUp3);
        LocalDate d4 = LocalDate.of(2021, 5, 4);
        StockUpdate stockUp4 = new StockUpdate("AMZN", d3, 400);
        stockMarket.addd(stockUp4);

        stockMarket.queryUpdates(d1, d4);
        stockMarket.queryUpdates(d1, d4, "AMZN");
        stockMarket.getPrice(d3,"AMZN");

        stockMarket.getPrices(d2);

    }
}
