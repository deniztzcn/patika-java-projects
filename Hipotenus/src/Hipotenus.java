import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        double c;

        System.out.print("1. Kenarı Giriniz: ");
        a = input.nextInt();
        System.out.print("2. Kenarı Giriniz: ");
        b = input.nextInt();
        c = Math.sqrt((a*a) + (b*b));

        System.out.println("Hipotenüs: " + c);
        double cevre = a + b + c;
        System.out.println("Üçgenin Çevresi: " + cevre);
        double alan = Math.sqrt(cevre * (cevre - a) * (cevre - b) * (cevre - c));
        System.out.println("Üçgenin Alanı: " + alan);
    }
}