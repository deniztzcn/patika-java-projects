import java.util.Scanner;

public class AsalSayilarRecursive {
    static int asalSayi(int a, int b) {
        if (b == 1) {
            return 1;
        }
        if (a % b == 0) {
            return 0;
        }
        return asalSayi(a,--b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int number = input.nextInt();
        int a = number - 1;

        if(asalSayi(number,a) == 1) {
            System.out.println(number + " sayısı asal sayıdır.");
        } else {
            System.out.println(number + " sayısı asal sayı değildir.");
        }

    }
}