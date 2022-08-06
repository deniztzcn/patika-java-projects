import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı adeti : ");
        int amount = input.nextInt();
        int number,kucuk = 0,buyuk = 0;

        for(int i = 1; i <= amount; i++) {
            System.out.print(i + ". sayıyı giriniz : ");
            number = input.nextInt();

            if (number > buyuk) {
                if (kucuk == 0) {
                    kucuk = number;
                }
                buyuk = number;
            }
            if (number < kucuk) {
                if (buyuk == 0) {
                    buyuk = number;
                }
                kucuk = number;
            }
        }
        System.out.println("En büyük sayı : " + buyuk);
        System.out.println("En küçük sayı : " + kucuk);
    }
}
