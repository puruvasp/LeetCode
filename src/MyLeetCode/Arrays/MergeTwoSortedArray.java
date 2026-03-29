package MyLeetCode.Arrays;
import java.util.*;

public class MergeTwoSortedArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] a = new int[n1];
        int[] b = new int[n2];

        for(int i = 0; i < n1; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n2; i++){
            b[i] = sc.nextInt();
        }
        TreeSet<Integer> set = new TreeSet<>();
        // Add elements of first array
        for(int num : a){
            set.add(num);
        }
        // Add elements of second array
        for(int num : b){
            set.add(num);
        }
        // Print merged sorted unique elements
        for(int num : set){
            System.out.print(num + " ");
        }
    }
}
