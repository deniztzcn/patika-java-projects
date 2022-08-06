import java.util.Scanner;

public class DeseneGoreMetot {
    static int pattern (int number, int temp, boolean direction) {
        System.out.print(number + " ");

        if (number > 0 && direction == true) {
            number -= 5;
        } else {
            direction = false;
            number += 5;
        }

        if (number == temp) {
            return temp;
        }
        return pattern (number,temp,direction);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int number = input.nextInt();

        System.out.println(pattern(number,number,true));

    }
}
