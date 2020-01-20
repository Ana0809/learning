package ArrayListImplementation;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> lista = new MyArrayList<>();

        lista.put(2,123);
        lista.add(1);
//        lista.add(2);
//       lista.add(3);
//        lista.add(3);
        lista.add(5);
//        lista.add(6);
//        lista.add(4);
//        lista.add(11);
//        lista.add(20);
//        lista.add(13);

        for (int i = 0; i < lista.length(); i++) {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println(lista.length());
     //   lista.add(29);
        lista.put(1, 9);
        System.out.println("Elementul de pe pozitia 5: " + lista.get(5));
        System.out.println("Dimensiunea listei este: " + lista.length());

        if (lista.contains(187)) {
            System.out.println("contine");
        } else System.out.println("nu contine");

        System.out.print("Dupa update lista este: "); //adica dupa put
        for (int i = 0; i < lista.length(); i++) {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println(" ");

        //am facut test de metode si pt lista 2
        MyArrayList<Integer> lista2 = new MyArrayList<>();
        lista2.add(7);
//        lista2.add(9);
//        lista2.add(13);
        System.out.print("Elementele lista2 sunt: ");
        for (int i = 0; i < lista2.length(); i++) {
            System.out.print(lista2.get(i) + " ");
        }
        lista2.put(2,12);
        System.out.println();
        System.out.println("Dimensiune lista2: " + lista2.length());
        System.out.print("Elementele lista2 dupa update sunt: " );
        for (int i = 0; i < lista2.length(); i++) {
            System.out.print(lista2.get(i) + " "); //dupa put
        }
        System.out.println();
       // System.out.println(lista2.get(5));
        if (lista2.contains(2)) {
            System.out.println("contine");
        } else System.out.println("nu contine");
          lista.addAll(lista2);
//        System.out.println(lista2.length());
//        System.out.println(lista.length());
    }

}