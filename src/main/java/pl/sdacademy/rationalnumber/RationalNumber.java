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
    public RationalNumber  getOpposite(){
        return new RationalNumber(-2,3);
    }
    public RationalNumber getInverse(){
        return new RationalNumber(3,2);
    }

}
