import java.util.Scanner;

public class CiftVeDordeBolumToplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int toplam = 0, sayı;

        do {
            System.out.print("Sayı Giriniz : ");
            sayı = input.nextInt();
            if ((sayı % 2 == 0) || (sayı % 4 == 0)) {
                toplam += sayı;
            }
        } while (sayı > 0);

        System.out.println("Toplam : " + toplam);
    }
}