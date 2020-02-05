package geometrie;

import java.util.Scanner ;
import java.time.LocalDate ;

class ImportantBirthdays
{
    public static void main( String[] not_in_use )
    {
        Scanner keyboard = new Scanner( System.in ) ;

        System.out.print( "\n Type in your date of birth as YYYY-MM-DD"
                +  "\n Please, use four digits for the year"
                +  "\n and two digits for month and day:  " ) ;

        String date_of_birth_as_string = keyboard.nextLine() ;

        LocalDate date_of_birth  = LocalDate.parse( date_of_birth_as_string ) ;

        System.out.printf( "\n   You were born on a %tA",  date_of_birth ) ;
        System.out.print(  "\n   Here are your days to celebrate. You are\n" ) ;

        int  years_to_celebrate  =  10 ;

        while ( years_to_celebrate  <  80 )
        {
            LocalDate date_to_celebrate  = date_of_birth.plusYears( years_to_celebrate ) ;

            System.out.printf( "\n   %1$d years old on %2$tF (%2$tA)",years_to_celebrate,date_to_celebrate  ) ;

            years_to_celebrate  =  years_to_celebrate  +  10 ;
        }
    }
}

