import java.util.Scanner;

public class KucuktenBuyuge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, sayi3;

        System.out.print("Birinci Sayıyı Giriniz : ");
        sayi1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        sayi2 = input.nextInt();
        System.out.print("Üçüncü Sayıyı Giriniz : ");
        sayi3 = input.nextInt();

        if(sayi1 < sayi2 && sayi1 < sayi3) {
            if (sayi2 < sayi3) {
                System.out.println("Küçükten Büyüğe Sıralama : " + sayi1 + ", " + sayi2 + ", " + sayi3 );
            } else {
                System.out.println("Küçükten Büyüğe Sıralama : " + sayi1 + ", " + sayi3 + ", " + sayi2);
            }
        } else if (sayi2 < sayi1 && sayi2 < sayi3) {
            if (sayi1 < sayi3) {
                System.out.println("Küçükten Büyüğe Sıralama : " + sayi2 + ", " + sayi1 + ", " + sayi3);
            } else {
                System.out.println("Küçükten Büyüğe Sıralama : " + sayi2 + ", " + sayi3 + ", " + sayi1);
            }
        } else if (sayi3 < sayi1 && sayi3 < sayi2) {
            if (sayi1 < sayi2) {
                System.out.println("Küçükten Büyüğe Sıralama : " + sayi3 + ", " + sayi1 + ", " + sayi2);
            } else {
                System.out.println("Küçükten Büyüğe Sıralama : " + sayi3 + ", " + sayi2 + ", " + sayi1);
            }
        }
    }
}