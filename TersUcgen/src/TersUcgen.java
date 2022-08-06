import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısı Giriniz : ");
        int basNumber = input.nextInt();

        for (int i = 1; i <= basNumber; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2 * basNumber) + 1) - (2 * i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}