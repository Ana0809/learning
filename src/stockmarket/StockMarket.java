package stockmarket;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StockMarket {
    List<StockUpdate> updates = new ArrayList<>();
   void add(StockUpdate update){
       List<StockUpdate> updates = new ArrayList<>();
        updates.add(update);
        for (int i = 0; i < updates.size(); i++) {
            System.out.println(updates.get(i).getStockCode() + " " + updates.get(i).getPriceNote() + " " + updates.get(i).getTimeOfTheUpdate());
        }
    }

    List<StockUpdate> queryUpdates(LocalDate from, LocalDate to) {
        List<StockUpdate> queryUpdates=new ArrayList<>();
      from.
        return queryUpdates;
    }
}
