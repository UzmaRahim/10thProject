import java.util.Scanner;
import java.io.*;

public class MagicNumber {
    static void isMagicNumber(int x) {
        int sum = 0, temp;
        while (x > 0) {
            sum = sum + x % 10;
            x = x / 10;
        }

        while (sum >= 10) {
            temp = sum;


            sum = 0;
            while (temp > 0) {
                sum = sum + temp % 10;
                temp = temp / 10;
            }
            System.out.println(sum);
            if (sum == 1) System.out.println("yes");
            else System.out.println("no");
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        isMagicNumber(num);

    }
}
