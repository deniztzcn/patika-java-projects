import java.util.Scanner;

public class UsluSayiRecursive {
    static int power(int a,int b){
        if (b < 1){
            return 1;
        }
        return a * power(a,--b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban Değeri Giriniz : ");
        int a = input.nextInt();
        System.out.print("Üs Değeri Giriniz : ");
        int b = input.nextInt();

        System.out.println(power(a,b));

    }
}