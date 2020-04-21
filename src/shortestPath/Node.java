package shortestPath;

import java.time.Duration;
import java.time.LocalTime;
import java.util.LinkedList;

public class Node implements Classifiable, Visitable, Payable {
    int price;
    LocalTime openingHour;
    int rank;
    String name;
    LinkedList<Edge> edges;

    public Node() {
    }

    Node(String name) {
        this.name = name;
        isVisitated = false;
        edges = new LinkedList<>();
    }
    void visit() {
        isVisitated= true;
    }

    public boolean isVisitated() {
        return isVisitated;
    }

    boolean isVisitated;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalTime getOpeningHour() {
        return openingHour;
    }

    public void setOpeningHour(LocalTime openingHour) {
        this.openingHour = openingHour;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public int priceOfTheTicket() {
        return price;
    }

    @Override
    public int rank() {
        return rank;
    }

    @Override
    public LocalTime openeningHour() {
        return openingHour;
    }

    static Duration openTime(){
        return Duration.between(firstHour,secondHour);
    }

}
