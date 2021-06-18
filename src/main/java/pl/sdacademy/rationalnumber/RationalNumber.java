package pl.sdacademy.rationalnumber;

public final class RationalNumber {
    // licznik
    private int numerator;
    // mianownik
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public String toString(){
        return numerator + "/" + denominator;
    }
    public String  getOpposite(){
        return "-" + numerator + "/" + denominator;
    }
    public String getInverse(){
        return denominator + "/" + numerator;
    }

}
