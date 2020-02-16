package stockmarket;

import java.time.LocalDate;
import java.util.*;

public class StockMarket {

    List<StockUpdate> updates = new ArrayList<>();
    TreeSet<StockUpdate> tree = new TreeSet<>();
    Map<String, Double> map = new HashMap<>();

    void addd(StockUpdate update) {
        updates.add(update);
//        for (int i = 0; i < updates.size(); i++) {
//            System.out.println(updates.get(i).getStockCode()+updates.size());
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
        tree.addAll(updates);
        double price = 0;
        StockUpdate s1 = null;
        for (StockUpdate s : tree) {
            price = s.getPriceNote();
            if (s.getTimeOfTheUpdate().equals(date) && s.getStockCode().equals(stockCode)) {
                System.out.println("Pretul stocului de pe data specificata este :" + price);

            } else if (!s.getTimeOfTheUpdate().equals(date) && s.getStockCode().equals(stockCode)) {
                LocalDate d1 = LocalDate.of(2020, 6, 1);
                StockUpdate stockUpdateee = new StockUpdate(stockCode, d1, 200);
                s1 = tree.ceiling(stockUpdateee);
            }
        }
        if (s1 != null) {
            System.out.println(s1.getTimeOfTheUpdate() + " " + s1.getStockCode() + " " + s1.getPriceNote() + " stocul nu a fost updatat pe data specificata, aceasta este data cea mai apropiata");
        }

        return price;
    }

    Map<String, Double> getPrices(LocalDate date) {

        Iterator<StockUpdate> itrr = updates.iterator();
        while (itrr.hasNext()) {
            StockUpdate el = itrr.next();
            if (el.getTimeOfTheUpdate().equals(date)) {
                map.put(el.getStockCode(), el.getPriceNote());
            }
        }
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        return map;
    }


}