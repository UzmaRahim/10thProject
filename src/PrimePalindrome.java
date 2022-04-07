import java.lang.*;

public class PrimePalindrome {
    static boolean isPrime(int x) {
        int d;
        for (d = 2; d < x; d++) {
            if (x % d == 0) return (false);
        }
        return (true);
    }

    static boolean isPalindrome(int x) {
        int temp = 0, y;
        y = x;
        while (y > 0) {
            temp = temp * 10 + y % 10;
            y = y / 10;
        }
        if (x == temp) {
            return (true);
        } else return (false);
    }

    public static void main(String[] args) {
        int i;
        for (i = 10; i < 1000; i++) {
            if (isPrime(i) && isPalindrome(i))
                System.out.println(i + " ");
        }
    }
}

