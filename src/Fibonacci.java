public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(generateFibonacci(10));
    }

    static int generateFibonacci(int n) {
        int x = 0, y = 1, i;
        int temp = 0, sum = x + y;
        for (i = 2; i < n; i++) {
            temp = x + y;
            sum += temp;
            x = y;
            y = temp;


        }
        return (sum);
    }
}
