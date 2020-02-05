package monthCalendars;

import java.util.Scanner;

class  MonthCalendars
{
    public static void main( String[] not_in_use )
    {
        Scanner keyboard  =  new  Scanner( System.in ) ;

        SpanishCalendar a_spanish_calendar  = new SpanishCalendar( 2020, 3 ) ;

        a_spanish_calendar.print() ;

        EnglishCalendar calendar_to_print = new EnglishCalendar( 2020, 9) ;
        calendar_to_print.current();
        calendar_to_print.print() ;

        GermanCalendar newcalendar = new GermanCalendar(2020, 1);
        newcalendar.print();

        String  user_selection  =  "????"  ;

        System.out.print("\n This program prints calendars. Please, select from"
                +  "\n the following menu by typing in a letter. ") ;

        while ( user_selection.charAt( 0 )  !=  'e' )
        {
            System.out.print("\n\n   p   Print previous calendar."
                    +  "\n   n   Print next calendar."
                    +  "\n   s   Switch to Spanish calendars."
                    +  "\n   g   Switch to German calendars."
                    +  "\n   y   The first month of the next year."
                    +  "\n   e   Exit the program.\n\n   " ) ;

            user_selection  =  keyboard.nextLine() ;

            if ( user_selection.charAt( 0 )  ==  'p' )
            {
                calendar_to_print.decrement_calendar_month();
                calendar_to_print.print();
            }
            else if ( user_selection.charAt( 0 )  ==  'n' )
            {
                calendar_to_print.increment_calendar_month() ;

                calendar_to_print.print() ;
            }
            else if ( user_selection.charAt( 0 )  ==  'y' )
            {
                calendar_to_print.first_month(); ;

                calendar_to_print.print() ;
            }
            else if ( user_selection.charAt( 0 )  ==  'g' )
            {
                calendar_to_print = new GermanCalendar( calendar_to_print.get_calendar_year(),
                    calendar_to_print.get_calendar_month() ) ;


                calendar_to_print.print() ;
            }
            else if ( user_selection.charAt( 0 )  ==  's' )
            {
                // We'll take the calendar year and month from the old calendar
                // object and use them to create a SpanishCalendar object.

                calendar_to_print =
                        new SpanishCalendar( calendar_to_print.get_calendar_year(),
                                calendar_to_print.get_calendar_month() ) ;

                calendar_to_print.print() ;
            }
        }

    }
}

