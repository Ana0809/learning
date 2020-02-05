package monthCalendars;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.time.* ; // for classes LocalDate, Period
import java.time.temporal.WeekFields ;


class  EnglishCalendar
{
    protected  int  this_year ;
    protected  int  this_month ;

    protected  String[]  names_of_months ;
    protected  String    week_description ;
    LocalDate current_system_date = LocalDate.now() ;
    int current_year = current_system_date.getYear() ;
    int current_month = current_system_date.getMonthValue();

    public EnglishCalendar()
    {
    }

    public EnglishCalendar( int given_year, int given_month )
    {
        String[]  english_names_of_months  =

                { "January", "February", "March", "April",
                        "May", "June", "July", "August",
                        "September", "October", "November", "December" } ;

        String  english_week_description  =

                " Week   Mon  Tue  Wed  Thu  Fri  Sat  Sun" ;

        names_of_months   =  english_names_of_months ;

        week_description  =  english_week_description ;

        this_year   =  given_year  ;
        this_month  =  given_month ;
    }

    public int get_calendar_year()
    {
        return this_year ;
    }

    public int get_calendar_month()
    {
        return this_month ;
    }


    public void increment_calendar_month()
    {
        this_month ++ ;

        if ( this_month > 12 )
        {
            this_month = 1 ;
            this_year ++ ;
        }
    }
    public void decrement_calendar_month(){
        this_month -- ;

        if ( this_month < 12 )
        {
            this_month = 12 ;
            this_year-- ;
        }
    }
    public void first_month(){
        this_month =1 ;
    }
    public void current(){
        LocalDate current_system_date = LocalDate.now() ;
        int current_year = current_system_date.getYear() ;
        this_year = current_year;
        int current_month = current_system_date.getMonthValue() ;
        this_month=current_month;
        System.out.println(current_month);
    }


    public void print()
    {
        LocalDate a_day_in_this_month  =
                LocalDate.of( this_year, this_month, 1 ) ;

        // Days of week are numbered from 1 to 7.
        // The first day of week is Monday.

        int day_of_week_value = 1 ;

        int day_of_week_of_first_day  =
                a_day_in_this_month.getDayOfWeek().getValue() ;

        System.out.print(
                "\n\n   "  +  names_of_months[ this_month - 1 ]
                        +  "  "  +  this_year  +  "\n\n"  +  week_description   +  "\n\n" );

        System.out.printf( "%4d  ",  a_day_in_this_month.get(
                WeekFields.ISO.weekOfWeekBasedYear() ) ) ;

        // The first week of a month is often an incomplete week,
        // i.e., the first part of week belongs to the previous
        // month. In place of the days that belong to the previous
        // month we print just spaces.

        while ( day_of_week_value != day_of_week_of_first_day )
        {
            System.out.print( "     " )  ;
            day_of_week_value  ++ ;
        }

        while ( this_month  ==  a_day_in_this_month.getMonthValue() )
        {
            if ( day_of_week_value  >=  8 )
            {
                System.out.printf( "\n%4d  ",
                        a_day_in_this_month.get(
                                WeekFields.ISO.weekOfWeekBasedYear() ) ) ;

                day_of_week_value  =  1 ;
            }

            System.out.printf( "%5d", a_day_in_this_month.getDayOfMonth() ) ;

            a_day_in_this_month = a_day_in_this_month.plusDays( 1 ) ;

            day_of_week_value  ++  ;
        }

        System.out.print( "\n" ) ;
    }
}

