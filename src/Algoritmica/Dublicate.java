package Algoritmica;
import java.util.ArrayList;
public class Dublicate {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(6);
        lista.add(3);
        lista.add(4);
        lista.add(8000);
        lista.add(6);
        lista.add(6);
        lista.add(870980);
        lista.add(6);
        lista.add(8);
        lista.add(8000);
        lista.add(1);
        lista.add(4);
        lista.add(4);
        lista.add(4);
        lista.add(4);
        for (int i = 0; i < lista.size(); i++) {
                for (int j = i + 1; j < lista.size(); j++) {
                    if (lista.get(i) > lista.get(j)) {
                        int aux = lista.get(i);
                        lista.set(i, lista.get(j));
                        lista.set(j, aux);
                    }
                }
        }

        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(i) == lista.get(j)) {
                    lista.remove(i);
                }
            }
        }
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i));
            }
        }
    }
