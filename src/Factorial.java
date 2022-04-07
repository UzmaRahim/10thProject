public class Factorial {
     static int n=10;
   static long sum = 0;

    public static void main(String[] args) {
        for (int i = 1; i <= n; i++) {
            sum += computeFactorial(i);
        }
        System.out.println(sum);
    }

     static long computeFactorial(int n) {
        long fact = 1;
        int i;
        for (i = 1; i <= n; i++) {
            fact *= i;
        }
        return (fact);
    }
}







