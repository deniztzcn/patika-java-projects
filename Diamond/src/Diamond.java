import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        for (int i = 1; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2*n)-1)-(2*i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}