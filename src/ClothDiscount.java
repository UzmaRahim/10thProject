import java.lang.*;
import java.util.*;
import java.io.*;


public class ClothDiscount {
    public static void main(String[] args) {
        char c;
        double amt, discount=0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter h or m");
            c = sc.next().charAt(0);
            System.out.println("Enter total amount");
            amt = sc.nextDouble();
        }
        switch (c) {
            case 'h':
                if (amt < 1000)
                    discount = .05 * amt;
                else if (amt >= 1000 && amt < 5000)
                    discount = .25 * amt;
                else if (amt >= 5000 && amt < 10000)
                    discount = .5 * amt;
                else if (amt >= 10000)
                    discount = .6 * amt;
                break;
            case 'm':
                if (amt < 1000)
                    discount = .02 * amt;
                else if (amt >= 1000 && amt < 5000)
                    discount = .2 * amt;
                else if (amt >= 5000 && amt < 10000)
                    discount = .4 * amt;
                else if (amt >= 10000)
                    discount = .5 * amt;
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        System.out.println("Amount" + amt + "Discount" + discount+ "Net");
        System.out.println(amt-discount);
    }


}
