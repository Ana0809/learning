package zoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Map {
    static void meniu() {
        Scanner s = new Scanner(System.in);
        int optiune = s.nextInt();
        switch (optiune) {
            case 1:
                introducereAnimale();
            case 2:
                afisareAnimale();
            case 3:
                afisareDeplasare();
            case 4:
                afisareCuloare();
            case 5:
                afisarePicioare();
            case 6: //   scoatereAnimale();

        }
    }

    static void introducereAnimale() {
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("introdu un animal");
            String animal = s.nextLine();
            HashMap<String, List<Animal>> gradina = new HashMap<>();
            if (animal.equals("urs")) {
                if (gradina.get("urs") == null) {
                    Urs u = new Urs();
                    gradina.put("urs", new ArrayList<>());
                    gradina.get("urs").add(u);
                }
            }
//            } else if (animal.equals("ras")) {
//                Ras r = new Ras();
//                gradina.add(r);
//            } else if (animal.equals("cangur")) {
//                Cangur c = new Cangur();
//                gradina.add(c);
//            } else if (animal.equals("gata")) {
            break;
        }
    }


    static void afisareAnimale() {
        for (int i = 0; i < gradina.size(); i++) {
            System.out.println(gradina.get(i).getNume());
        }
    }

    static void afisareCuloare() {
        for (int i = 0; i < gradina.size(); i++) {
            System.out.println(gradina.get(i).culoare());
        }
    }

    static void afisarePicioare() {
        for (int i = 0; i < gradina.size(); i++) {
            System.out.println(gradina.get(i).picioare());
        }
    }

    static void afisareDeplasare() {
        for (int i = 0; i < gradina.size(); i++) {
            System.out.println(gradina.get(i).deplasare());
        }
    }

}


