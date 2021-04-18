import java.util.*;

public class Solution {

    public static int fibonacciSimpleSolution(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /**
    * This is more optimal solution as after we compute the results, we save them!, so
    * we don't have to compute them again when calling fibonacci(n - 2). You don't need to store
    * the first two values as no computation is required for them. 
    */
    public static List<Integer> fibonacciResults = new ArrayList<>();

    public static int fibonacci(int n) {
        if (fibonacciResults.get(n) != null) {
            return fibonacciResults.get(n);
        }

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int number = fibonacci(n - 1) + fibonacci(n - 2);
            fibonacciResults.add(n, number);
            return number;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < n+1; i++) {
          fibonacciResults.add(null);
        }
        
        System.out.println(fibonacci(n));
    }
}
