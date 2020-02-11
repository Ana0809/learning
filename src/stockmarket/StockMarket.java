package stockmarket;

import java.time.LocalDate;
import java.util.*;

public class StockMarket implements Comparable<StockMarket>{

    List<StockUpdate> updates = new ArrayList<>();
    TreeSet<StockUpdate> tree = new TreeSet<>();
    Map<String, Double> price = new HashMap<>();
    void addd(StockUpdate update) {

        updates.add(update);

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
        Iterator<StockUpdate> itr=tree.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        for (int i = 0; i < updates.size(); i++) {
                if (updates.get(i).getTimeOfTheUpdate().isEqual(date) && updates.get(i).getStockCode().equals(stockCode)) {
                    System.out.println("Pretul stocului de pe data specificata este :" + updates.get(i).getPriceNote());
                } else {
                    tree.add(updates.get(i));
                    tree.ceiling(updates.get(i));
                }
            }
    return null;
    }

    Map<String, Double> getPrices(LocalDate date) {

        price.put("AMZN", 105.0);

        Iterator<Map.Entry<String, Double>> itr = price.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Double> entry = itr.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

        }
        return null;
    }

    @Override
    public int compareTo(StockMarket o) {
        return 0;
    }
}