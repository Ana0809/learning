package Algoritmica;

public class BinaryTest {
    public static void main(String[] args) {
        int v[] = {1, 3, 5, 6, 7, 8, 9};
        int start=0;
        int end =v.length-1;

        int key = 8;
        while(start<=end){
            int mijloc=(end+start)/2;
        if(key>v[mijloc]){
            start=mijloc;
        }
        if(key<v[mijloc]){
            end=mijloc;
        }
        if(key==v[mijloc]){
            System.out.println(mijloc);
            break;
        }

    }

}}
