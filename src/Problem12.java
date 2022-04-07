import java.util.*;

public class Problem12 {
    public static void main(String[] args) {
        int choice, n;
        System.out.println("Enter 1 for Triangle and 2 for InvertedTriangle");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        System.out.println("Enter number of terms");
        try (Scanner sc1 = new Scanner(System.in)) {
            n = sc1.nextInt();
        }
        switch (choice) {
            case 1:

                generateTriangle(n);
                break;
            case 2:

                generateInverseTriangle(n);
                break;
            default:
                System.out.println("Invalid");
        }
    }
        static void generateTriangle ( int n){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i);
                }
                System.out.println("");
            }
        }
        static void generateInverseTriangle ( int n){
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i);
                }
                System.out.println("");
            }
        }
    }
