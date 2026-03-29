package MyLeetCode.Arrays;
import java.util.*;

public class RotateByK {

    static void reverse(int[] a, int l, int r){
        while(l < r){
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) nums[i] = sc.nextInt();

        int k = sc.nextInt();
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);

        for(int x : nums){
            System.out.print(x + " ");
        }
    }
}