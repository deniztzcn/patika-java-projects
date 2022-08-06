import java.util.Scanner;

public class BasamakSayilariToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();

        int result = 0;
        int value;
        while (number != 0) {
            value = number % 10;
            result += value;
            number /= 10;
        }
        System.out.println("Basamak Değerlerinin Toplamı : " + result);

    }
}
