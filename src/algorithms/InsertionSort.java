package algorithms;

public class InsertionSort {
    public static void main(String args[])
    {
        int arr[] = { 1, 12, 11, 7, 13, 5, 6, 3};
        int i,j;
        for(i=0;i<arr.length;i++)              //verificam  elementul de pe iteratia curenta
        {                              //daca este egal cu cel de pe anterioara
            j = i;
            while(j>0)                     //daca nu sunt egale elemntele, il punem pe cel mai mare pe pozitia precedenta
            {
                if(arr[j-1] > arr[j])
                {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else
                {
                    break;
                }
                j--;            //pentru a verifica elementul de pe noua pozitie precedenta cu restul din fata pana ajunge cel mai mic element
            }
        }
        for (i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
   }
}

