package complex;

public class Complex {
    double real;
    double i;

    Complex(double r, double i) {
        this.real = r;
        this.i = i;
    }
    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    Complex add(Complex number) {
        double r = this.real + number.real;
        double i = this.i + number.i;
        return new Complex(r, i);
    }

    Complex negate() {
        return new Complex(-this.real, -this.i);
    }

    Complex multiply(Complex number) {
        double r = this.real * number.real;
        double i = this.i * number.i;
        return new Complex(r, i);
    }

    void equals(Complex number) {
        if (this.real == number.real) {
            if (this.i == number.i) {
                System.out.println("Egale");
            }
        } else System.out.println("Nu sunt egale");
    }

    public String toString() {
        return real + " + " + i + "i";
    }

    static Complex create(double realPart, double imaginaryPart){
        Complex nr=new Complex(realPart,imaginaryPart);
        return nr;
    }
}


