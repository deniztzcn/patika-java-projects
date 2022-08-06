import java.util.Scanner;

public class DordunVeBesinKuvvetleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int n = input.nextInt();
        int i = 1;
        int k = 1;

        System.out.println("Dördün Kuvvetleri : ");
        while (i < n) {
            System.out.println(i);
            i  *= 4;
        }
        System.out.println("Beşin Kuvvetleri : ");
        while (k < n) {
            System.out.println(k);
            k *= 5;
        }
    }
}
