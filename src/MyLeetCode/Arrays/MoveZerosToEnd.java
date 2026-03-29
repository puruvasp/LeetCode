package MyLeetCode.Arrays;
import java.util.*;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) nums[i] = sc.nextInt();

        int index = 0;

        // Move non-zero elements
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                nums[index++] = nums[i];
            }
        }
        // Fill remaining with zeros
        while(index < n){
            nums[index++] = 0;
        }
        for(int x : nums){
            System.out.print(x + " ");
        }
    }
}