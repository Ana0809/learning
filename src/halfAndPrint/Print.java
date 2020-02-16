package halfAndPrint;

public class Print implements Function {
    //   has a method that simply prints the int value given as an argument, and returns the same int.

    int prints(int value) {
        int[] array = {value};
        for (int i = 0; i < array.length; i++) {
            value = array[i];
            System.out.println(array[i]);
        }
        return value;
    }
}
