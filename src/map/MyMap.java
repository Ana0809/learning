package map;

import java.util.Objects;

public class MyMap<K, V> implements Map<K, V> {

    private int size = 0;
    private Entry<K, V>[] entryIndex;
    private Object obj[];
    private static final int capacitatea = 2;

    public MyMap() {
        this(capacitatea);
    }

    public MyMap(int capacitate) {
        this.entryIndex = new Entry[capacitate];
    }

    @Override
    public void put(K key, V value) {
        Entry<K, V> entry = new Entry<>(key, value, null);
        int rezultatHashCode = getHash(key) % capacitatea;

        Entry<K, V> indexulUndeSePuneKey = entryIndex[rezultatHashCode];

        if (indexulUndeSePuneKey == null) {       //daca nu exista o cheie pusa
            entryIndex[rezultatHashCode] = entry;   //se pune pe index un entry
            size++;//nr de entry
        } else {                                      //deja exista o cheie pusa
            if (indexulUndeSePuneKey.key.equals(key)) { //daca e aceiasi cheie
                indexulUndeSePuneKey.value = value;     //se inlocuieste valoarea
            } else {
                indexulUndeSePuneKey.next = entry;      //daca nu e aceiasi cheie, se pune pe casuta urmatoare din linklist
                size++;
            }
            while (indexulUndeSePuneKey.next != null) {    //se verifica fiecare casuta din linklist
                if (indexulUndeSePuneKey.key.equals(key)) {
                    indexulUndeSePuneKey.value = value;
                    break;
                }
                indexulUndeSePuneKey = indexulUndeSePuneKey.next; //altfel valoarea se pune pe urmatoarea casuta din linklist
            }
        }

    }

    @Override
    public V get(K key) {
        int rezultatHashCode = getHash(key) % capacitatea;
        Entry<K, V> entry2 = entryIndex[rezultatHashCode];
        while (entry2 != null) {
            if (key == entry2.key) {
                return entry2.value;
            } else {
                entry2 = entry2.next;
            }
        }
        System.out.println("Nu exista elementul pt cheia ceruta");
        return null;
    }

    public int getHash(K key) {
        return Objects.hash(key);

    }

}

