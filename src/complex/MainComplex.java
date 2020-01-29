package complex;

public class MainComplex {
    public static void main(String[] args) {
        Complex nr1 =new Complex(3,1.2);
        Complex nr2 =new Complex(2,1.2);
        Complex add= nr1.add(nr2);
        Complex negate = nr1.negate();
        Complex multiply = nr1.multiply(nr2);
        nr1.equals(nr2);
        System.out.println("Suma "+add);
        System.out.println("Negativ "+negate);
        System.out.println("Inmultire "+ multiply);
        Complex.create(5,4.3);
    }
}
