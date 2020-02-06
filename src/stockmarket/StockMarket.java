package stockmarket;

import java.time.LocalDate;
import java.util.*;

public class StockMarket {

    List<StockUpdate> updates = new ArrayList<>();

    void add(StockUpdate update) {
        updates.add(update);
//        for (int i = 0; i < updates.size(); i++) {
//            System.out.println(updates.get(i).getStockCode() + " " + updates.get(i).getPriceNote() + " " + updates.get(i).getTimeOfTheUpdate());
//        }
    }

    List<StockUpdate> queryUpdates(LocalDate from, LocalDate to) {
        List<StockUpdate> queryUpdates = new ArrayList<>();
        for (int i = 0; i < updates.size(); i++) {
            if (updates.get(i).getTimeOfTheUpdate().isAfter(from) && updates.get(i).getTimeOfTheUpdate().isBefore(to)) {
                queryUpdates.add(updates.get(i));
            }
        }

        for (int i = 0; i < queryUpdates.size(); i++) {
            System.out.println("Stocurile dintre cele 2 date sunt: " + queryUpdates.get(i).getStockCode());
        }
        return queryUpdates;
    }

    List<StockUpdate> queryUpdates(LocalDate from, LocalDate to, String stockCode) {
        List<StockUpdate> queryUpdates = new ArrayList<>();
        for (int i = 0; i < updates.size(); i++) {
            if (updates.get(i).getTimeOfTheUpdate().isAfter(from) && updates.get(i).getTimeOfTheUpdate().isBefore(to) && updates.get(i).getStockCode().equals(stockCode)) {
                queryUpdates.add(updates.get(i));
            }
        }
        for (int i = 0; i < queryUpdates.size(); i++) {
            System.out.println("Stocurile dintre cele 2 date dupa codul specificat sunt: " + queryUpdates.get(i).getStockCode());
        }
        return queryUpdates;
    }

    Double getPrice(LocalDate date, String stockCode) {

        TreeSet<LocalDate> tree = new TreeSet<>();
        for (int i = 0; i < updates.size(); i++) {
            if (updates.get(i).getTimeOfTheUpdate().isEqual(date) && updates.get(i).getStockCode().equals(stockCode)) {
                System.out.println("Pretul stocului de pe data specificata este :" + updates.get(i).getPriceNote());
            } else {
                tree.add(updates.get(i).getTimeOfTheUpdate());
                tree.ceiling(updates.get(i).getTimeOfTheUpdate());
            }
        }

        return null;
    }

    Map<String, Double> getPrices(LocalDate date) {
        Map<String, Double> price = new HashMap<>();
        price.put("AMZN", 105.0);

        Iterator<Map.Entry<String, Double>> itr = price.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Double> entry = itr.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

        }
        return null;
    }
}