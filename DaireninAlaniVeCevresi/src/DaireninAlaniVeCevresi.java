import java.util.Scanner;

public class DaireninAlaniVeCevresi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi, cevre, alan, alan2;
        int a, r;

        System.out.print("Daire'nin Yarıçapını Giriniz: ");
        r = input.nextInt();
        pi = 3.14;
        cevre = 2 * pi * r;
        alan = pi * r * r;
        System.out.print("Merkez Açı Giriniz: ");
        a = input.nextInt();
        alan2= (pi * r * r * a) / 360;

        System.out.println("Daire'nin Yarıçapı: " + r);
        System.out.println("Daire'nin Alanı: " + alan);
        System.out.println("Daire'nin Çevresi: " + cevre);
        System.out.println("Merkez Açısı " + a + " Olan Dilimin Alanı: " + alan2);
    }
}
