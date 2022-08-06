import java.util.Scanner;

public class TaksiMetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar, mesafe;

        System.out.print("Mesafei km cinsinden giriniz: ");
        mesafe = input.nextDouble();
        tutar = 10 + (mesafe * 2.20);

        double total = (tutar < 20) ? 20 : tutar;

        System.out.println("Ücret: " + total);
    }
}