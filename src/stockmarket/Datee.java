package stockmarket;

import java.time.LocalDate;

public class Datee{
    void getDate(){
        for (int i = 0; i < 10; i++) {
            LocalDate randomDate = createRandomDate(2019, 2020);
            System.out.println(randomDate);
        }
    }

    static int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    static LocalDate createRandomDate(int startYear, int endYear) {
        int day = createRandomIntBetween(1, 28);
        int month = createRandomIntBetween(1, 12);
        int year = createRandomIntBetween(startYear, endYear);
        return LocalDate.of(year, month, day);
    }
}