import java.util.Scanner;

public class UcVeDortAveraj {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi = input.nextInt();
        int i = 1;
        int toplam = 0;
        int adet = 0;

        while (i <= sayi) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                System.out.print(i + ",");
                toplam += i;
                adet ++;
            }
            i++;
        }
        int average = toplam / adet;
        System.out.println(" ");
        System.out.println("Ortalama : " + average);
    }
}
