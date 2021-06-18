package pl.sdacademy.rationalnumber;

public class Main {
    public static void main(String[] args) {
        RationalNumber twoThirds = new RationalNumber(2,3);
        System.out.println(twoThirds);
        System.out.println(twoThirds.getOpposite());
        System.out.println(twoThirds.getInverse());
    }
}
