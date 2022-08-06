import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Üssü Alınacak Sayı : ");
        int i = input.nextInt();
        System.out.print("Üs Olacak Sayı : ");
        int k = input.nextInt();
        int total = 1;

        for (int j = 1; j <= k; j++) {
            total *= i;
        }
        System.out.println(total);

    }
}