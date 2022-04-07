import java.io.*;
import java.util.*;
import java.lang.*;

public class ElectricityBill {
    static double calculateBill(int x) {
        double sum;
        if (x < 100) return (.8 * x);
        else if (x >= 100 && x <= 200) return (100 * .8 + (x - 100) * 1);
        else if (x > 200) return (100 * .8 + 100 * 1 + (x - 200) * 1.25);
        return 0;
    }

    public static void main(String[] args) {
        int units;
        double bill;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of units");
            units = sc.nextInt();
        }
        bill = calculateBill(units);
        System.out.println(bill);
    }
}
