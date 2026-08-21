package MyLeetCode.Arrays;
import java.util.*;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) nums[i] = sc.nextInt();

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int x : nums){
            if(x > first){
                second = first;
                first = x;
            }
            else if(x > second && x != first){
                second = x;
            }
        }
        if(second == Integer.MIN_VALUE){
            System.out.println("No second largest element");
        } else {
            System.out.println(second);
        }
    }
}