import java.lang.*;
import java.util.*;
import java.io.*;
import java.math.*;
public class Problem9 {
    public static void main(String[] args) {
        int x =2,n=3;
System.out.println(computeSum(x,n));
    }
    static double computeSum(int x, int n){
        double sum =0;
        for (int i =1 ;i<=n;i++){
            sum+= (Math.pow(x,i)/factorial(i));

        }
        return(sum);
    }
    static long factorial(int n) {
        long fact = 1;
        int i;
        for (i = 1; i <= n; i++) {
            fact *= i;
        }
        //System.out.println(fact);
        return (fact);
    }
}
