import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ebob, ekok;
        System.out.print("Birinci Sayıyı Giriniz : ");
        int n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        int n2 = input.nextInt();

        int kucuk = n1;
        if (n2 < n1) {
            kucuk = n2;
        }

        int i = kucuk;
        while (kucuk > 1) {
            if (n1 % kucuk == 0 && n2 % kucuk == 0) {
                ebob = kucuk;
                System.out.println("EBOB = " + ebob);
                System.out.println("EKOK = " + (n1* n2) / ebob);
                break;
            }
            kucuk--;
        }
    }
}