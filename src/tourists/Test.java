package tourists;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        int pozitieHotel = 0;
        int rating = 0;
        Scanner keyboard = new Scanner(System.in);
        String hotel = null;
        String hotel2 = null;
        String[] elementLinie = new String[0];
        String[] element = new String[0];
        String linie = null;
        while (true) {
            try {
                try {
                    FileReader fr = new FileReader("C:\\\\Users\\\\JohnSmith\\\\Documents\\\\holiday.txt");
                    Scanner reader = new Scanner(fr);
                    System.out.println("Introduceti numele Hotelui caruia sa ii ofeiti rating");
                    hotel = keyboard.nextLine();
                    while ((linie = reader.nextLine()) != null) {
                        elementLinie = linie.split("-");
                        if (elementLinie[1].equals(hotel)) {
                            lista.add(elementLinie[0] + "-" + elementLinie[1]);
                            pozitieHotel = lista.indexOf(linie);
                        } else lista.add(linie);
                    if (pozitieHotel<0) {
                        System.out.println("Nu exista hotelul");
                    }
                    }
                    fr.close();
                } catch (FileNotFoundException e) {
                    System.out.println("Fisierul nu exista");
                }
            } catch (Exception e) {
            }
            try {
                try {
                    ArrayList<String> lista2 = new ArrayList<>();
                    FileReader fr = new FileReader("C:\\\\Users\\\\JohnSmith\\\\Documents\\\\booking.txt");
                    Scanner reader = new Scanner(fr);
                    while ((linie = reader.nextLine()) != null) {
                        element = linie.split("-");
                        if (element[1].equals(hotel)) {
                            hotel2 = element[1];
                        } else lista2.add(linie);
                    if(pozitieHotel<0){
                        System.out.println("Nu exista hotelul");
                    }
                    }
                    fr.close();
                } catch (FileNotFoundException e) {
                }
            } catch (Exception e) {
            }
            try {
                if (hotel.equals(hotel2)) {
                    System.out.println("Oferiti rating hotelului la care ati fost cazat");
                    rating = keyboard.nextInt();

                } else {
                    System.out.println("Nu ati fost cazat la acest hotel ca sa ii oferiti rating.");
                }

                Double a = 0.0;
                for (int i = 0; i < lista.size(); i++) {
                    if (pozitieHotel > 0) {
                        if (hotel.equals(hotel2)) {
                            if (rating >= 0) {
                                element = lista.get(pozitieHotel + 1).split("-");
                                Double ratingInitial = Double.parseDouble(element[1]);
                                lista.remove(pozitieHotel + 1);
                                lista.add(pozitieHotel + 1, "R-" + (rating + ratingInitial) / 2);
                                a = (rating + ratingInitial) / 2;
                                System.out.println("Rating oferit!");
                                break;
                            } else System.out.println("Ratingul trebuie sa fie cuprins intre 0 si 10");
                        }
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Trebuie introdusa o cifra");
            }
//        for (int i = 0; i < destinations.size(); i++) {
//            for (int j = 0; j < destinations.get(i).getCities().size(); j++) {
//                for (int k = 0; k < destinations.get(i).getCities().get(j).getHotels().size(); k++) {
//                    destinations.get(i).getCities().get(j).getHotels().get(pozitieHotel).setRating(a);
//                }
//            }
//        }

            try {
                try {
                    PrintWriter pr = new PrintWriter("C:\\\\Users\\\\JohnSmith\\\\Documents\\\\holiday.txt");
                    for (int i = 0; i < lista.size(); i++) {
                        pr.println((lista.get(i)));
                    }
                    pr.close();

                } catch (FileNotFoundException ex) {
                    System.out.println("Fisierul nu exista");
                }
            } catch (Exception e) {
            }
        }
    }
}