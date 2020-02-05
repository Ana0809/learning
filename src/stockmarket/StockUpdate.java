package stockmarket;

import java.time.LocalDate;

public class StockUpdate {
    String stockCode;
    LocalDate timeOfTheUpdate;
    int priceNote;

    StockUpdate(String stockCode, LocalDate timeOfTheUpdate, int priceNote) {
        this.stockCode = stockCode;
        this.timeOfTheUpdate = timeOfTheUpdate;
        this.priceNote = priceNote;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public LocalDate getTimeOfTheUpdate() {
        return timeOfTheUpdate;
    }

    public void setTimeOfTheUpdate(LocalDate timeOfTheUpdate) {
        this.timeOfTheUpdate = timeOfTheUpdate;
    }

    public int getPriceNote() {
        return priceNote;
    }

    public void setPriceNote(int priceNote) {
        this.priceNote = priceNote;
    }


}
