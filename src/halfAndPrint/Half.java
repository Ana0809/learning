package halfAndPrint;

public class Half implements Function {
    int value;

    @Override
    public int evaluate(int myParameter) {
        this.value = myParameter / 2;
        return value;
    }
}
