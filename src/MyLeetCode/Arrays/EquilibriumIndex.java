package MyLeetCode.Arrays;
import java.util.*;

public class EquilibriumIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for(int i = 0; i < n; i++) nums[i] = sc.nextInt();

        int total = 0;
        for(int x : nums) total += x;

        int leftSum = 0;

        for(int i = 0; i < n; i++){
            total -= nums[i];

            if(leftSum == total){
                System.out.println(i);
                return;
            }

            leftSum += nums[i];
        }

        System.out.println(-1);
    }
}