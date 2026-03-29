package MyLeetCode.Arrays;
import java.util.*;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int max = nums[0];

        for(int i = 1; i < n; i++){
            if(nums[i] > max) max = nums[i];
        }

        System.out.println(max);
    }
}//[1,2,3,4,5,6,7,8]