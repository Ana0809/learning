package tourists;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        int pozitieHotel = 0;
        String camere = null;
        Scanner keyboard = new Scanner(System.in);
        String linie = null;
        String[] elementLinie = new String[0];
        String hotel = null;
        String nume = null;
        int rezultat = 0;
        while (true) {
            try {
                try {
                    try {
                        FileReader fr = new FileReader("C:\\\\Users\\\\JohnSmith\\\\Documents\\\\holiday.txt");
                        Scanner reader = new Scanner(fr);
                        System.out.println("Introduceti numele Hotelui");
                        hotel = keyboard.nextLine();
                        while ((linie = reader.nextLine()) != null) {
                            elementLinie = linie.split("-");
                            if (elementLinie[1].equals(hotel)) {
                                lista.add(elementLinie[0] + "-" + elementLinie[1]);
                                pozitieHotel = lista.indexOf(linie);
                            } else lista.add(linie);
                        }
                        try {
                            fr.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } catch (NoSuchElementException e) {
                        System.out.println("Nu exista hotelul");
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Nu exista hotelul");
                }
            } catch (FileNotFoundException e) {
                System.out.println("Fisierul nu exista");
            }

            if (pozitieHotel > 0) {
                int nrCamereRezervate = 0;
                try {
                    try {
                        System.out.println("Introduceti cate camere doriti sa rezervati?");
                        camere = keyboard.nextLine();
                        nrCamereRezervate = Integer.parseInt(camere);
                        System.out.println("Care este numele dvs?");
                        nume = keyboard.nextLine();
                    } catch (NumberFormatException ex) {
                        System.out.println("Trebuie introdusa o cifra");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Trebuie introdusa o cifra");
                }
                for (int i = 0; i < lista.size(); i++) {
                    elementLinie = lista.get(pozitieHotel + 2).split("-");
                    if (elementLinie[1] != null) {
                        int nrCamereInitiale = (Integer.valueOf(elementLinie[1]));
                        lista.remove(pozitieHotel + 2);
                        rezultat = nrCamereInitiale - nrCamereRezervate;
                        if (rezultat >= 0) {
                            lista.add(pozitieHotel + 2, "NC-" + rezultat);
                            System.out.println("Rezervat!");
                            break;
                        } else {
                            System.out.println("Nu va putem caza, numarul de camere nu este disponibil, lipsesc " + rezultat + " camere");
                            lista.add(pozitieHotel + 2, "NC-" + elementLinie[1]);
                            break;
                        }
                    } else {
                        System.out.println("Nr invalid");
                    }
                }
            } else {
                System.out.println("Nu exista hotelul");
            }

            try {
                try {
                    PrintWriter pr = new PrintWriter("C:\\\\Users\\\\JohnSmith\\\\Documents\\\\holiday.txt");
                    for (int i = 0; i < lista.size(); i++) {
                        pr.println((lista.get(i)));
                    }
                    pr.close();
                } catch (Exception e) {
                }
            } catch (Exception e) {
            }
            try {
                FileReader fisier = new FileReader("C:\\\\Users\\\\JohnSmith\\\\Documents\\\\booking.txt");
                ArrayList<String> lista2 = new ArrayList<>();
                if (rezultat >= 0) {
                    lista2.add("Nume-" + nume);
                    lista2.add("H-" + hotel);
                    lista2.add(" camere-" + camere);
                }
                fisier.close();
                try {
                    try {
                        FileWriter fileWriter = new FileWriter("C:\\\\Users\\\\JohnSmith\\\\Documents\\\\booking.txt", true); //Set true for append mode
                        PrintWriter printWriter = new PrintWriter(fileWriter);
                        for (int i = 0; i < lista2.size(); i++) {
                            printWriter.println((lista2.get(i)));
                        }
                        printWriter.close();
                    } catch (Exception e) {
                    }
                } catch (Exception e) {
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

