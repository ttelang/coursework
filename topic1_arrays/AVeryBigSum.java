import java.util.Scanner;

public class Solution {

    /**
    * Adds the elements in the number array
    * @param n number of items in the array
    * @param ar array of numbers
    * @return the sum of all array elements
    */
    static long aVeryBigSum(long[] ar) {
        long sum = 0; 
        for (long num: ar) {
            sum += num; 
        }
        return sum;
    }

    public static void main(String ...args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // count of elements in the array

        long[] ar = new long[n];

        for(int i = 0; i < n; i++){
            ar[i] = in.nextLong();
        }
        in.close();
        long result = aVeryBigSum(ar);

        System.out.println(result);

    }
}
