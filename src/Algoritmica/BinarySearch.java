package Algoritmica;

class BinarySearch {

    public static void main(String[] args) {
        int[] arr= {1,7,14,23,55,67,70,81,99};
        System.out.println(search(arr,0,arr.length-1,81));
    }

    public static int search(int[] v, int start, int end, int cheie) {
        if(start<=end) {
            int mijloc=(start+end)/2;
            if(cheie<v[mijloc])
                return search(v,start,mijloc,cheie);
            if(cheie>v[mijloc])
                return search(v, mijloc+1, end, cheie);
            return mijloc;
        }
        return -1;
    }

}