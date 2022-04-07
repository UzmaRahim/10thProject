import java.util.*;

public class Problem11 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        float sum = 0;
        for (float i = 2; i <= 20; i = i + 3) {

            sum += (x / i);


        }
        System.out.println(sum);
    }
}
