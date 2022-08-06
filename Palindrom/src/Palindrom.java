import java.util.Scanner;

public class Palindrom {
    static String palindrom (int number) {
        int temp = number, last, reverse = 0;

        while (temp != 0) {
            last = temp % 10;
            reverse = (reverse * 10) + last;
            temp /= 10;
        }

        if (number == reverse) {
            return "Bu bir Palindrom sayıdır.";
        } else {
            return "Bu bir Palindrom sayı değildir.";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int number = input.nextInt();

        System.out.println(palindrom(number));

    }
}