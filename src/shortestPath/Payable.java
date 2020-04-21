package shortestPath;

public interface Payable {
    int priceOfTheTicket();

    default boolean isPayable(){
        return true;
    }
}
