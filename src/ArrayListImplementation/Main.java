package ArrayListImplementation;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList lista = new ArrayList();
        lista.put(15, 42);
        lista.put(2, 4);
        lista.put(3, 2);
        lista.put(5, 1);
        lista.put(1, 8);

        lista.get(7);
        System.out.println("Dimensiunea listei este : " + lista.length());

        lista.contains(4);

        ArrayList lista2 = new ArrayList();
        lista2.put(16, 7);
        lista2.put(17, 10);
        lista.addAll(lista2);
        System.out.println(lista2.length());
        System.out.println(lista.length());
    }
}
