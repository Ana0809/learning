package zoo;

import java.util.*;

public class Afisari {
    HashMap<String, ArrayList<Animal>> hash = new HashMap<>();
    void adaugare() {
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("introdu un animal");
            String animal = s.nextLine();
            if (animal.equals("urs")) {
                Urs u = new Urs();
                if (hash.get("urs") == null) {
                    hash.put("urs", new ArrayList<Animal>());
                    hash.get("urs").add(u);
                } else hash.get("urs").add(u);
            }
            if (animal.equals("ras")) {
                Ras r = new Ras();
                if (hash.get("ras") == null) {
                    hash.put("ras", new ArrayList<Animal>());
                    hash.get("ras").add(r);
                } else hash.get("ras").add(r);
            }
            if (animal.equals("cangur")) {
                Cangur c = new Cangur();
                if (hash.get("cangur") == null) {
                    hash.put("cangur", new ArrayList<Animal>());
                    hash.get("cangur").add(c);
                } else hash.get("cangur").add(c);
            }
            if (animal.equals("gata")) {
                break;
            }
        }
    }


    void afisareNrAnimale() {
        try {
            if (hash.get("urs").size() > 0)
                System.out.println("In gradina zoo sunt " + hash.get("urs").size() + " ursi.");
        } catch (NullPointerException e) {
        }
        try {
            if (hash.get("ras").size() > 0)
                System.out.println("In gradina zoo sunt " + hash.get("ras").size() + " rasi.");
        } catch (NullPointerException e) {
        }
        try {
            if (hash.get("cangur").size() > 0)
                System.out.println("In gradina zoo sunt " + hash.get("cangur").size() + " canguri.");
        } catch (NullPointerException e) {
        }
    }

    void aisareCuloare() {
        Iterator it = hash.entrySet().iterator();
        while (it.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry) it.next();
            ArrayList<Animal> listaAnimale = (ArrayList<Animal>) pair.getValue();
            if (pair.getKey().equals("urs")) {
                for (int i = 0; i < listaAnimale.size(); i++) {
                    System.out.println(listaAnimale.get(i).getNume() + " " + listaAnimale.get(i).culoare()+" "+listaAnimale.get(i).deplasare()+" "+ listaAnimale.get(i).picioare());
                }
            }
                if (pair.getKey().equals("ras")) {
                    for (int i = 0; i < listaAnimale.size(); i++) {
                        System.out.println(listaAnimale.get(i).getNume() + " " + listaAnimale.get(i).culoare()+" "+listaAnimale.get(i).deplasare()+" "+ listaAnimale.get(i).picioare());
                    }
                }
                    if (pair.getKey().equals("cangur")) {
                        for (int i = 0; i < listaAnimale.size(); i++) {
                            System.out.println(listaAnimale.get(i).getNume() +  " "+ listaAnimale.get(i).culoare()+" "+listaAnimale.get(i).deplasare()+" "+ listaAnimale.get(i).picioare());
                        }
                    }
                }
            }
        }
