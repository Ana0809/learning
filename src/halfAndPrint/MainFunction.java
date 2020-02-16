package halfAndPrint;

public class MainFunction {
    public static void main(String[] args) {

        Half half = new Half();
        System.out.println(half.evaluate(4));

        Compute doMath = new Compute();
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        doMath.compute(array, half);

        Print show = new Print();
        for (int i = 0; i < array.length; i++) {
            show.prints(array[i]);
        }


    }

}
