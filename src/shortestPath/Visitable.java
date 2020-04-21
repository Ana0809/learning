package shortestPath;
import java.time.Duration;
import java.time.LocalTime;

public interface Visitable {
   default boolean isVisitable(){
        return true;
    }

   LocalTime openeningHour();

    default LocalTime openingHours() {
        return firstHour;
    }

    default LocalTime closingHours() {
        return secondHour;
    }

    LocalTime firstHour = LocalTime.of(9, 30);
    LocalTime secondHour = LocalTime.of(20, 00);
}
