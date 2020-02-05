package date;

import java.time.LocalDate;
import java.time.Period;

public class Date {
    public static void main(String[] args) {
        LocalDate my_birthday = LocalDate.of(1999, 9, 8);
        LocalDate date_now = LocalDate.now();
        Period a = my_birthday.until(date_now);
        System.out.println("Astazi suntem in: " + date_now + " si eu m-am nascut in anul " + my_birthday.getYear() + " pe data de " + my_birthday.getDayOfMonth());
        System.out.println("Am " + a.getYears() + " de ani " + a.getMonths() + " luni si " + a.getDays() + " zile.");

        int years_to_celebrate = 10;
        while (years_to_celebrate < 40) {
            LocalDate date_to_celebrate = my_birthday.plusYears(years_to_celebrate);
            System.out.printf("\n %1$d years old on %2$tF (%2$tA)", years_to_celebrate, date_to_celebrate);
            years_to_celebrate = years_to_celebrate + 10;
        }

        LocalDate date_to_increment = LocalDate.of(my_birthday.getYear(), my_birthday.getMonth(), my_birthday.getDayOfMonth());
        int day_counter = 0;
        while (day_counter < 20001) {
            date_to_increment = date_to_increment.plusDays( 1 ) ;
            day_counter  ++;
            if ((day_counter % 10000) == 0) {
                System.out.printf("\n %1$d years old on %2$tF (%2$tA)", years_to_celebrate, date_to_increment);
                System.out.println(day_counter  );
             //   System.out.println( date_to_increment.getYear() + date_to_increment.);

            }
        }
    }
}