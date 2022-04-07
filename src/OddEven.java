import java.io.*;
import java.lang.*;

public class OddEven {
    public static void main(String[] args) {
        int i, sumOdd = 0, sumEven = 0;
        for (i = 0; i <100; i++) {
            if (i % 2 == 0)
                sumEven += i;
            else sumOdd += i;
        }
        System.out.println("Sum of all Even Numbers" + sumEven);
        System.out.println("Sum of all Odd Numbers" + sumOdd);

    }


}
