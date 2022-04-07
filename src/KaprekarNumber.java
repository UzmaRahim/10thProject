import java.util.Scanner;
import java.math.*;

public class KaprekarNumber {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        isKaprekarNumber(num);

    }

    static void isKaprekarNumber(int x) {
        long square, temp;
        int len = 0, i, flag=0;
        square = x * x;
        temp = square;
        while (temp != 0) {
            temp = temp / 10;
            len++;
        }
        for (i = 1; i <= len; i++) {
            int divisor, quotient, remainder;
            temp = square;
            divisor = (int) Math.pow(10, i);
            quotient = (int) (temp / divisor);
            remainder = (int) (temp % divisor);
            //System.out.println(quotient+"  "+ remainder+ "  "+divisor);
            if (quotient + remainder == x) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) System.out.println("Yes");
        else System.out.println("No");

    }

}
