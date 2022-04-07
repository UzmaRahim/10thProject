import java.util.*;
public class Problem10 {
    public static void main(String[] args) {
        System.out.println("Enter the number of terms");
        int n;// number of terms
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        int sum = 0;
        for (int i=1; i<=n; i++){
            if(i%2==0)
                sum=sum-i;
            else sum = sum+i;
        }
        System.out.println(sum*2);
    }
}
