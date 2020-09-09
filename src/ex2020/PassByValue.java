package ex2020;

public class PassByValue {
    public static void main(String[] args) {
        int localValue=5;
       localValue= calculate(localValue);
        System.out.println(localValue);
    }
    public static int calculate(int calcValue){
        calcValue=calcValue*100;
        return calcValue;
    }
}
