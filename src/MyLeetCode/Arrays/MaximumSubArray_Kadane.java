package MyLeetCode.Arrays;
import java.util.*;

public class MaximumSubArray_Kadane {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int max = nums[0], sum = 0;

        for(int x : nums){
            if(sum < 0) sum = 0;
            sum += x;
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
