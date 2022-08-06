import java.util.Scanner;

public class AsalSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1 - 100 Arasındaki Asal Sayılar\n--------------------------------");

        for (int i = 2; i < 100; i++) {
            boolean isTrue = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isTrue = false;
                }
            }
            if (isTrue) {
                System.out.print(i + "|");
            }
        }
    }
}