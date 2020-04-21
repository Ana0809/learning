package algorithms;

public class merge {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 9,10};
        int[] array2 = {11, 12, 13,14, 15, 18};
        int[] array3=new int[array1.length+array2.length];
        int k=0;
        int m=0;
        int n=0;
        while(m<array1.length&&n<array2.length){
            if(array1[m]<array2[n]) {
                array3[k++] = array1[m];
                m++;
            }
          else
                array3[k++]=array1[n++];

        }
        while(m<array1.length){
            array3[k++]=array1[m++];
        }
        while(n<array2.length){
            array3[k++]=array2[n++];
        }
        for(int i=0;i<array3.length;i++){
            System.out.println(array3[i]);
        }
    }
}
