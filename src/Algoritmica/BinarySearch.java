package Algoritmica;

class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 80, 80, 90};
        System.out.println(search(arr, 0, arr.length - 1, 81));
    }

    public static int search(int[] v, int start, int end, int cheie) {
        if (start <= end) {
            int mijloc = (start + end) / 2;
            if (cheie == v[mijloc])
                return mijloc;
            if (cheie < v[mijloc])
                return search(v, start, mijloc, cheie);
            if (cheie > v[mijloc])
                return search(v, mijloc + 1, end, cheie);

        }
        return -1; //daca nu a fost gasit elementul
    }

}