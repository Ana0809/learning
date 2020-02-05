package monthCalendars;

import java.util.Scanner;

class  SpanishCalendar  extends  EnglishCalendar
{
    public SpanishCalendar( int given_year, int given_month )
    {
        String[]  spanish_names_of_months  =

                { "Enero", "Febrero", "Marzo", "Abril",
                        "Mayo", "Junio", "Julio", "Agosto",
                        "Septiembre", "Octubre", "Noviembre", "Diciembre" } ;

        String   spanish_week_description  =

                "Semana  Lun  Mar  Mie  Jue  Vie  Sab  Dom" ;

        names_of_months   =  spanish_names_of_months ;
        week_description  =  spanish_week_description ;

        this_year   =  given_year  ;
        this_month  =  given_month ;
    }
}


