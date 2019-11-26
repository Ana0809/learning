package Algoritmica;

public class Merge {

    public static void main (String[] args)
    {
        int[] array1 = {1, 2, 3, 4, 9,10};
        int[] array2 = {11, 12, 13,14, 15, 18};
        int[] array3 = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;
        while (i<array1.length && j <array2.length)
        {
            if (array1[i] < array2[j])
                array3[k++] = array1[i++];
            else
                array3[k++] = array2[j++];
        }
        while (i < array1.length)
            array3[k++] = array1[i++];
        while (j < array2.length)
            array3[k++] = array2[j++];

        for ( i=0; i < array3.length; i++)
            System.out.print(array3[i] + " ");
    }
}
