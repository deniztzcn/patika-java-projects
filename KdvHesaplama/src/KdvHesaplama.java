import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tax, raw;

        System.out.print("KDV'siz Fiyat: ");
        raw = input.nextDouble();
        int kdv = (raw < 1000)? 18 : 8;

        tax = raw * kdv/100;
        System.out.println("KDV'li Fiyat: " + (tax + raw));

        System.out.println("KDV tutarı: " + tax);

    }
}