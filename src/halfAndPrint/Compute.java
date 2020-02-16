package halfAndPrint;

public class Compute {


    int[] compute(int array[], Function function) {
        for (int i = 0; i < array.length; i++) {
            array[i] = function.evaluate(array[i]);  //elemente array rezultatate prin aplicarea functiei fiecarui element din array dat ca parametru
            System.out.println(array[i]);
        }
        return array;
    }


}
