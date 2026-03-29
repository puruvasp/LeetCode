package MyLeetCode.Arrays;
import java.util.*;

public class MissingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) nums[i] = sc.nextInt();

        int sum = n * (n + 1) / 2;

        int arrSum = 0;
        for(int x : nums) arrSum += x;

        System.out.println(sum - arrSum);
    }
}