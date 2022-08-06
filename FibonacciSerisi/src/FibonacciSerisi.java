import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int number = input.nextInt();
        System.out.println(number + " Elemanlı Fibonacci Serisi\n-----------------------------");
        int result = 0;
        int firstValue = 0;
        int secondValue = 1;

        for (int i = 1; i < number; i++) {
            result = firstValue + secondValue;
            System.out.println(firstValue + " + " + secondValue + " = " + (firstValue + secondValue));
            System.out.println();
            firstValue = secondValue;
            secondValue = result;
        }
    }
}