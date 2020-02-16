package halfAndPrint;

public class Half implements Function {


    @Override
    public int evaluate(int myParameter) {
        int value = myParameter / 2;
        return value;
    }
}
