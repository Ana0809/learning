package arrayFiles;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("Write your lines");
        ArrayList<String> given_text_lines = scriereLinii();
        punereInFisier(given_text_lines);
        printTheFile();
    }

    private static void punereInFisier(ArrayList<String> given_text_lines) {

        Scanner s = new Scanner(System.in);
        try {
            System.out.print("\nGIVE FILE NAME TO STORE THIS TEXT: ");

            String given_file_name = s.nextLine();
            PrintWriter output_file = new PrintWriter(new FileWriter(given_file_name));
            for (int i = 0; i < given_text_lines.size(); i++) {
                output_file.println(given_text_lines.get(i));
            }
            output_file.close();
            System.out.println("DONE");
        } catch (IOException caught_io_exception) {
            System.out.print("\n Cannot write to file \"");
        }

        String given_file_name = "notknown.txt";
        boolean acceptable_file_name_given = false;
        while (acceptable_file_name_given == false) {
            System.out.println("Type stop to break the loop");
            given_file_name = s.nextLine();
            if (new File(given_file_name).exists()) {
                System.out.print("\nThis file already exists!");
            } else if (given_file_name.length() == 0) {
                System.out.println("\nThe program will not accept an empty string as a file name.\n");
            }else if(!given_file_name.endsWith(".txt")){
                System.out.println("\nThe program accepts only file names that end with txt.\n");
            }else if(given_file_name.equals("stop")){
               acceptable_file_name_given=true;
            }
        }
    }

    private static void printTheFile() {
        Scanner keyboard = new Scanner( System.in ) ;
        System.out.print( "\n This program prints the contents of a text"
                +  "\n file to the screen. Give a file name: " ) ;

        String  file_name_from_user  =  keyboard.nextLine() ;

        try
        {
            BufferedReader file_to_print = new BufferedReader( new FileReader( file_name_from_user ) ) ;
            int line_counter  =  0 ;
            boolean  end_of_file_encountered  =  false ;
            while ( end_of_file_encountered  ==  false ) {
                String text_line_from_file  =  file_to_print.readLine() ;
                if ( text_line_from_file  ==  null ) {
                    end_of_file_encountered  =  true ;
                }
                else {
                    System.out.print( text_line_from_file  +  "\n" ) ;
                    line_counter  ++  ;
                }
            }
            file_to_print.close() ;
            System.out.print( "\n  " + line_counter + " lines printed." ) ;
        }
        catch ( FileNotFoundException caught_file_not_found_exception )
        {
            System.out.print( "\n \"" + file_name_from_user + "\" not found.\n" ) ;
        }
        catch ( IOException caught_io_exception )
        {
            System.out.print( "\n\n  File reading error.  \n" ) ;
        }
    }
    private static ArrayList<String> scriereLinii() {
        ArrayList<String> given_text_lines = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        boolean user_wants_to_type_more = true;
        while (user_wants_to_type_more == true) {
            String text_line_from_user = keyboard.nextLine();
            if (text_line_from_user.length() > 0 && text_line_from_user.charAt(0) == '.') {
                user_wants_to_type_more = false;
            } else {
                given_text_lines.add(text_line_from_user);
            }
        }
        System.out.print("\nGIVEN LINES: \n");
        for (String text_line : given_text_lines) {
            System.out.print("\n" + text_line);
        }
        return given_text_lines;
    }

}
