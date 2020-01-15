package ArrayListImplementation;

public class ArrayList implements List {
    private Object[] object;
    private Object[] a;
    private int size = 0;
    private int index = 0;
    private int value = 0;
    private static final int SIZE_FACTOR = 1;

    public ArrayList() {
        object = new Object[SIZE_FACTOR];
    }

    @Override
    public void put(int index, int value) {
        this.index = index;
        this.value = value;
        if (size < index) {
            size = index;
            object = new Object[(object.length * 2)];
        }
        object[index] = value;
        System.out.println("index: " + index + " value: " + value);

    }

    //    public int get(int index) {
//        this.index = index;
//        if (index <= size) {
//         //   System.out.println("Elementul de pe index este: " + object[index]);
//             return (int) object[index];
//        } else
//           // System.out.println("Nu ai pus nimic pe acel index");
//        return 0;
//    }
    public int get(int index) {
        try {
            this.index = index;
            if (index <= size) {
                return (int) object[index];
            }
        } catch (Exception e) {
            System.out.println("Indexul este inexistent");
        }
        return 0;
    }

    @Override
    public int length() {
        return size;
    }

    @Override
    public boolean contains(int value) {
        boolean b = false;
        for (int i = 0; i < size; i++) {
            if (object[i] != null && object[i].equals(value)) {
                b = true;
                return false;
            }
            if (b == true) {
                System.out.println("Exista in lista");
            } else System.out.println("Nu exsita in lista");
        }
        return true;
    }


    @Override
    public void addAll(List other) {
        object = new Object[object.length + other.length()];
        size = object.length + other.length();
        for (int i = object.length + 1; i < object.length + other.length(); i++) {

        }
    }
}