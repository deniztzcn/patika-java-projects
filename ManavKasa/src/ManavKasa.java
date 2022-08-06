import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double elma, armut, domates, muz, patlıcan;
        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz = 0.95;
        patlıcan = 5;

        System.out.print("Armut Kaç Kilo ? : ");
        double a = input.nextDouble();
        double tlArmut = a * armut;

        System.out.print("Elma Kaç Kilo ? : ");
        double e = input.nextDouble();
        double tlElma = e * elma;

        System.out.print("Domates Kaç Kilo ? : ");
        double d = input.nextDouble();
        double tlDomates = d * domates;

        System.out.print("Muz Kaç Kilo ? : ");
        double m = input.nextDouble();
        double tlMuz = m * muz;

        System.out.print("Patlıcan Kaç Kilo ? : ");
        double p = input.nextDouble();
        double tlPatlıcan = p * patlıcan;

        System.out.print("Toplam Tutar : " + (tlArmut + tlElma + tlDomates + tlMuz + tlPatlıcan) + " TL");
    }
}