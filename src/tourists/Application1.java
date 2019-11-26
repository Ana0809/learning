package tourists;

import java.io.*;
import java.util.*;

public class Application1 {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> fileList = adaugareDinFisier();
        ArrayList<Hotel> priceh2 = new ArrayList<>();
        ArrayList<Hotel> ratingh2 = new ArrayList<>();
        ArrayList<Hotel> hoteluri = new ArrayList<>();
        ArrayList<Hotel> hoteluri2 = new ArrayList<>();
        ArrayList<Double> preturi = new ArrayList<>();
        ArrayList<Destination> destinations = new ArrayList<>();
        login();
        while (true) {
            int n = readOption();
            metodaMain(fileList, hoteluri, hoteluri2, destinations);
            if (n == 1) {
                afisareGenerala(destinations);
            } else if (n == 2) {
                hotelDupaPret(hoteluri2, priceh2);
            } else if (n == 3) {
                hotelDupaRating(hoteluri2, ratingh2);
            } else if (n == 4) {
                hoteluriPretEgal(hoteluri);
//            } else if (n == 5) {
//                hotelOrdAceiasiLista(hoteluri);
            } else if (n == 5) {
                dacaTaraExista(destinations);
            } else if (n == 6) {
                oferaRating(destinations);
            } else if (n == 7) {
                rezervaCamere();
            } else if (n == 8) {
                insertHotel();
            } else if (n == 9) {
                modificaPret();
            } else if (n == 10) {
                modificaNrCamere();
            } else if (n >= 20) {
                System.out.println("Optiunea nu exista!");
            } else if (n == 0) {
                logout();
                break;
            }
        }
    }

    private static int readOption() {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti cifra corespunzatoare optiunii dorite: ");
        return s.nextInt();
    }

    private static void logout() {
        while (true) {
            System.out.println("Te-ai delogat!");
            break;
        }
    }

    private static void login() throws FileNotFoundException {
        while (true) {
            System.out.println("Bine ai venit, te rugam sa te loghezi!");
            System.out.println("Useranme");
            Scanner keyboard = new Scanner(System.in);
            String user = keyboard.nextLine();
            System.out.println("Password");
            String parola = keyboard.nextLine();
            File file = new File("C:\\Users\\JohnSmith\\Documents\\users.txt");
            Scanner sc = new Scanner(file);
            boolean b = true;
            String rol = null;
            while (sc.hasNextLine()) {
                if (user.equals(sc.nextLine())) {
                    if (parola.equals(sc.nextLine())) {
                        b = false;
                        rol = sc.nextLine();
                        break;
                    }
                }
            }
            if (b == false) {
                System.out.println("Rolul este " + rol);
            } else System.out.println("Nu esti in lista noastra, reintrodu datele!");
            if ("admin".equals(rol)) {
                System.out.println("Meniul pentru admin:");
                System.out.println("8.Adauga hotel");
                System.out.println("9. Modifica pretul unui hotel");
                System.out.println("10. Modifica numarul de camere");
                System.out.println("Pentru logout introdu 0");
                break;
            }
            if ("client".equals(rol)) {
                System.out.println("Meniu pentru client:");
                System.out.println("1.Afisare a listei de destinatii cu hoteluri");
                System.out.println("2.Afisare hoteluri dupa pret");
                System.out.println("3.Afisare hoteluri dupa rating");
                System.out.println("4.Afisare hoteluri cu preturi egale");
                // System.out.println("5.Afisare hoteluri din aceiasi lista");
                System.out.println("5.Verifica daca destinatia dorita exista in lista noastra");
                System.out.println("6.Ofera rating");
                System.out.println("7.Rezerva Camere");
                System.out.println("Pentru logout introdu 0");
                break;
            }

        }
    }

    private static void metodaMain(ArrayList<String> fileList, ArrayList<Hotel> hoteluri, ArrayList<Hotel> hoteluri2, ArrayList<Destination> destinations) {
        for (int i = 0; i < fileList.size(); i++) {
            if (fileList.get(i).startsWith("D-")) {
                Destination d = new Destination();
                d.setCountry(fileList.get(i));
                destinations.add(d);
                d.setCities(new ArrayList<>());
                for (int j = i + 1; j < fileList.size(); j++) {
                    if (fileList.get(j).startsWith("CY-")) {
                        City c = new City();
                        String name2 = fileList.get(j);
                        c.setName(name2);
                        d.getCities().add(c);

                        c.setHotels(new ArrayList<>());
                        for (int k = j + 1; k < fileList.size(); k++) {
                            if (fileList.get(k).startsWith("H-")) {
                                Hotel h = new Hotel();
                                String name = fileList.get(k);
                                h.setName(name);
                                c.getHotels().add(h);
                                hoteluri.add(h);
                                hoteluri2.add(h);
                                for (int m = k + 1; m < fileList.size(); m++) {
                                    String st = fileList.get(m);

                                    if (st.startsWith("R-")) {
                                        String v[] = st.split("-");
                                        int rating = Integer.parseInt(v[1]);
                                        h.setRating(rating);
                                    }
                                    if (st.startsWith("NC-")) {
                                        String v[] = st.split("-");
                                        int availableRooms = Integer.parseInt(v[1]);
                                        h.setAvailableRooms(availableRooms);
                                    }
                                    if (st.startsWith("P-")) {
                                        String v[] = st.split("-");
                                        double price = Double.parseDouble(v[1]);
                                        h.setPrice(price);
                                    }
                                    if (st.startsWith("D-") || st.startsWith("CY-") || st.startsWith("H-")) {
                                        k = m;
                                        k--;
                                        break;
                                    }

                                }
                            } else {
                                if (fileList.get(k).startsWith("CY-")) {
                                    j = k;
                                    j--;
                                    break;
                                } else {

                                    if (fileList.get(k).startsWith("D-")) {
                                        j = k;
                                        j--;
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        if (fileList.get(j).startsWith("D-")) {
                            i = j;
                            i--;
                            break;
                        }
                    }
                }
            }
        }
    }

    private static ArrayList<String> adaugareDinFisier() throws FileNotFoundException {
        File file = new File("holiday.txt");
        ArrayList<String> fileList = new ArrayList<>();
        Scanner in = new Scanner(file);
        while (in.hasNextLine()) {
            fileList.add(in.nextLine().trim());
        }
        return fileList;
    }

    private static void hotelOrdAceiasiLista(ArrayList<Hotel> hoteluri) {
        System.out.println("Hoteluri ordaonate in aceiasi lista");
        for (int i = 0; i < hoteluri.size(); i++) {
            for (int j = i + 1; j < hoteluri.size(); j++) {
                if (hoteluri.get(i).getPrice() > hoteluri.get(j).getPrice()) {

                    Hotel pret = hoteluri.get(i);
                    hoteluri.set(i, hoteluri.get(j));
                    hoteluri.set(j, pret);
                }
            }
        }
        System.out.println(" ");
        for (int i = 0; i < hoteluri.size(); i++) {
            System.out.println(hoteluri.get(i).getName() + " " + hoteluri.get(i).getPrice());

        }
    }

    private static void hoteluriPretEgal(ArrayList<Hotel> hoteluri) {
        System.out.println("Hotelurile care au acelasi pret");
        for (int i = 0; i < hoteluri.size(); i++) {
            for (int j = i + 1; j < hoteluri.size(); j++) {
                if (hoteluri.get(i).getPrice() == hoteluri.get(j).getPrice()) {
                    System.out.println(hoteluri.get(i).getName() + " cu " + hoteluri.get(j).getName());
                    //System.out.println(hoteluri.get(i).getPrice() + " "  + hoteluri.get(j).getPrice());
                }

            }
        }
    }

    private static void dacaTaraExista(ArrayList<Destination> destinations) {
        System.out.println("Introduceti tara (cu majuscula) pe care doriti sa o verificati daca exista");
        while (true) {
            Scanner sc = new Scanner(System.in);
            String tara = sc.nextLine();
            if (tara.equals("GATA")) {
                break;
            }
            Boolean country = false;
            for (int i = 0; i < destinations.size(); i++) {
                String v[] = destinations.get(i).getCountry().split("-");
                if (tara.equals(v[1])) {
                    country = true;
                }

            }
            if (country == true) {
                System.out.println("Tara exista");
                System.out.println("Daca doriti sa mai verificati, introduceti tara, altfel introduceti GATA");

            } else {
                System.out.println("Tara nu exista, introduceti din nou!");
                System.out.println("Daca nu mai doriti sa introduceti tara, scrieti GATA");
            }
        }
    }

    private static void hotelDupaRating(ArrayList<Hotel> hoteluri2, ArrayList<Hotel> ratingh2) {
        System.out.println("Hotelurile mele dupa rating");
        for (int i = 0; i < hoteluri2.size(); i++) {
            for (int j = i + 1; j < hoteluri2.size(); j++) {
                if (hoteluri2.get(i).getRating() > hoteluri2.get(j).getRating()) {
                    Hotel rating;
                    rating = hoteluri2.get(i);
                    hoteluri2.set(i, hoteluri2.get(j));
                    hoteluri2.set(j, rating);
                }
            }
            ratingh2.add(hoteluri2.get(i));
        }
        for (int i = 0; i < ratingh2.size(); i++) {
            System.out.println(ratingh2.get(i).getName() + " " + ratingh2.get(i).getRating());
        }
    }

    private static void hotelDupaPret(ArrayList<Hotel> hoteluri2, ArrayList<Hotel> priceh2) {
        System.out.println("Hotelurile mele dupa pret:");
        for (int i = 0; i < hoteluri2.size(); i++) {
            for (int j = i + 1; j < hoteluri2.size(); j++) {
                if (hoteluri2.get(i).getPrice() < hoteluri2.get(j).getPrice()) {
                    Hotel pret;
                    pret = hoteluri2.get(i);
                    hoteluri2.set(i, hoteluri2.get(j));
                    hoteluri2.set(j, pret);
                }

            }
            priceh2.add(hoteluri2.get(i));
        }

        for (int i = 0; i < priceh2.size(); i++) {
            System.out.println(priceh2.get(i).getName() + "  " + priceh2.get(i).getPrice());
        }
    }

    private static void afisareGenerala(ArrayList<Destination> destinations) {
        for (int i = 0; i < destinations.size(); i++) {
            System.out.println(destinations.get(i).getCountry());
            for (int j = 0; j < destinations.get(i).getCities().size(); j++) {
                System.out.println("  " + destinations.get(i).getCities().get(j).getName());
                for (int k = 0; k < destinations.get(i).getCities().get(j).getHotels().size(); k++) {
                    System.out.println("   " + destinations.get(i).getCities().get(j).getHotels().get(k).getName());
                    System.out.println("    R-" + destinations.get(i).getCities().get(j).getHotels().get(k).getRating());
                    System.out.println("    NC-" + destinations.get(i).getCities().get(j).getHotels().get(k).getAvailableRooms());
                    System.out.println("    P-" + destinations.get(i).getCities().get(j).getHotels().get(k).getPrice());
                }
            }
        }
    }

    public static void myMap(ArrayList<Hotel> hoteluri) {

        HashMap<String, Integer> map = new HashMap<>();
        Iterator<Hotel> it = hoteluri.iterator();
        while (it.hasNext()) {
            Hotel el = it.next();
            if (map.containsKey(el.getName())) {
                map.put(el.getName(), map.get(el.getName()) + 1);
            } else {
                map.put(el.getName(), 1);
            }
        }
        Iterator<Map.Entry<String, Integer>> itm = map.entrySet().iterator();
        while (itm.hasNext()) {
            Map.Entry m = itm.next();
            System.out.print(m.getKey() + " ");
            System.out.println(m.getValue());
        }

    }

    public static void mySet(ArrayList<Hotel> hoteluri) {
        HashSet<String> set = new HashSet<>();
        for (int j = 0; j < hoteluri.size(); j++) {
            set.add(hoteluri.get(j).getName());
        }

        Iterator<String> itm = set.iterator();
        while (itm.hasNext()) {
            System.out.println(itm.next());

        }
    }

    private static void modificaPret() {
        ArrayList<String> lista = new ArrayList<>();
        int pozitieHotel = 0;
        int pret = 0;
        Scanner keyboard = new Scanner(System.in);
        try {
            try {
                FileReader fr = new FileReader("C:\\\\Users\\\\JohnSmith\\\\Documents\\\\holiday.txt");
                Scanner reader = new Scanner(fr);

                System.out.println("Introduceti numele Hotelui");
                String hotel = keyboard.nextLine();

                String linie;
                String[] elementLinie;
                while ((linie = reader.nextLine()) != null) {
                    elementLinie = linie.split("-");
                    if (elementLinie[1].equals(hotel)) {
                        lista.add(elementLinie[0] + "-" + elementLinie[1]);
                        pozitieHotel = lista.indexOf(linie);
                    } else lista.add(linie);
                }
                fr.close();
            } catch (FileNotFoundException e) {
            }
        } catch (Exception e) {
        }
        try {
            if (pozitieHotel > 0) {
                System.out.println("Introduceti noul pret al hotelului");
                pret = keyboard.nextInt();
            } else {
                System.out.println("Nu exista hotelul");
            }
        } catch (InputMismatchException e) {
            System.out.println("Trebuie introdus un numar");

        }

        for (int i = 0; i < lista.size(); i++) {
            if (pozitieHotel > 0) {
                lista.remove(pozitieHotel + 3);
                lista.add(pozitieHotel + 3, "P-" + pret);
                System.out.println("Pretul hotelului a fost modificat");
                break;
            }
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
    }

    private static void modificaNrCamere() {
        ArrayList<String> lista = new ArrayList<>();
        int pozitieHotel = 0;
        String camere = null;
        Scanner keyboard = new Scanner(System.in);
        try {
            try {
                FileReader fr = new FileReader("C:\\\\Users\\\\JohnSmith\\\\Documents\\\\holiday.txt");
                Scanner reader = new Scanner(fr);
                System.out.println("Introduceti numele Hotelui");
                String hotel = keyboard.nextLine();
                String linie;
                String[] elementLinie;
                while ((linie = reader.nextLine()) != null) {
                    elementLinie = linie.split("-");
                    if (elementLinie[1].equals(hotel)) {
                        lista.add(elementLinie[0] + "-" + elementLinie[1]);
                        pozitieHotel = lista.indexOf(linie);
                    } else lista.add(linie);
                }
                fr.close();
            } catch (FileNotFoundException e) {
            }
        } catch (Exception e) {
        }
        if (pozitieHotel > 0) {
            System.out.println("Introduceti noul numar de camere al hotelului");
            camere = keyboard.nextLine();
        } else {
            System.out.println("Nu exista hotelul");
        }
        for (int i = 0; i < lista.size(); i++) {
            if (pozitieHotel > 0) {
                lista.remove(pozitieHotel + 2);
                lista.add(pozitieHotel + 2, "NC-" + camere);
                System.out.println("Numarul de camere a fost schimbat!");
                break;
            }
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
    }

    private static void insertHotel() {
        ArrayList<String> lista = new ArrayList<>();
        try {
            try {
                FileReader fr = new FileReader("C:\\\\Users\\\\JohnSmith\\\\Documents\\\\holiday.txt");
                Scanner reader = new Scanner(fr);
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Introduceti orasul unde vreti sa adaugati hotelul");
                String oras = keyboard.nextLine();
                System.out.println("Introduceti numele Hotelui nou");
                String hotel = keyboard.nextLine();
                System.out.println("Introduceti ratingul hotelului");
                String rating = keyboard.nextLine();
                System.out.println("Introduceti numarul de camere disponibile");
                String numarCamere = keyboard.nextLine();
                System.out.println("Introduceti pretul hotelului");
                String pret = keyboard.nextLine();
                String linie;
                String[] elementLinie;
                while ((linie = reader.nextLine()) != null) {
                    elementLinie = linie.split("-");
                    if (elementLinie[1].equals(oras)) {
                        lista.add(elementLinie[0] + "-" + elementLinie[1]);
                        lista.add("H-" + hotel);
                        lista.add("R-" + rating);
                        lista.add("NC-" + numarCamere);
                        lista.add("P-" + pret);

                    } else lista.add(linie);
                }
                fr.close();

            } catch (FileNotFoundException e) {
            }
        } catch (Exception e) {

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
    }

    private static void oferaRating(ArrayList<Destination> destinations) {
        ArrayList<String> lista = new ArrayList<>();
        int pozitieHotel = 0;
        int rating = 0;
        Scanner keyboard = new Scanner(System.in);
        String hotel = null;
        String hotel2 = null;
        String[] elementLinie = new String[0];
        String[] element = new String[0];
        String linie = null;
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
                }
                fr.close();
            } catch (FileNotFoundException e) {
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
                }
                fr.close();
            } catch (FileNotFoundException e) {
            }
        } catch (Exception e) {
        }
        if (hotel.equals(hotel2)) {
            System.out.println("Oferiti rating hotelului la care ati fost cazat");
            rating = keyboard.nextInt();

        } else {
            System.out.println("Nu exista hotelul");
        }
        for (int i = 0; i < lista.size(); i++) {
            if (pozitieHotel > 0) {
                element = lista.get(pozitieHotel + 1).split("-");
                Double ratingInitial = Double.parseDouble(element[1]);
                lista.remove(pozitieHotel + 1);
                lista.add(pozitieHotel + 1, "R-" + (rating + ratingInitial) / 2);
                System.out.println("Rating oferit!");
                break;
            }
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
    }

    private static void rezervaCamere() {
        ArrayList<String> lista = new ArrayList<>();
        int pozitieHotel = 0;
        String camere = null;
        Scanner keyboard = new Scanner(System.in);
        String linie = null;
        String[] elementLinie = new String[0];
        String hotel = null;
        String nume = null;
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
                fr.close();
            } catch (FileNotFoundException e) {
            }
        } catch (Exception e) {
        }
        if (pozitieHotel > 0) {
            System.out.println("Introduceti cate camere doriti sa rezervati?");
            camere = keyboard.nextLine();
            int nrCamereRezervate = Integer.parseInt(camere);
            System.out.println("Care este numele dvs?");
            nume = keyboard.nextLine();
            for (int i = 0; i < lista.size(); i++) {
                elementLinie = lista.get(pozitieHotel + 2).split("-");
                if (elementLinie[1] != null) {
                    int nrCamereInitiale = (Integer.valueOf(elementLinie[1]));
                    lista.remove(pozitieHotel + 2);
                    int rezultat = nrCamereInitiale - nrCamereRezervate;
                    if (rezultat >= 0) {
                        lista.add(pozitieHotel + 2, "NC-" + rezultat);
                        System.out.println("Rezervat!");
                        break;
                    } else {
                        System.out.println("Nu este disponibil numarul de camere, lipsesc " + rezultat + " camere");
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
            lista2.add("Nume-" + nume);
            lista2.add("H-" + hotel);
            lista2.add(" camere-" + camere);
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



