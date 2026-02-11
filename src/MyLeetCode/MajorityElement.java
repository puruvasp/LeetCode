package MyLeetCode;

public class MajorityElement
{
   public int majorityElementBrute(int[] nums, int n)
   {
       int target;
       int count = 0;
       int ans = -1;

       for(int i=0; i < n; i++)
       {
           target = nums[i];
           count = 0;

           for(int j=i; j < n; j++)
           {
               if(target == nums[j])
               {
                   count++;
               }
           }

           if(count >= n/2)
           {
               ans = target;
               break;
           }

       }

       return ans;
   }

    public static void main(String[] args)
    {
        int A[] = {2,3,3,3,1,3,3};
        int n = A.length;

        MajorityElement obj = new MajorityElement();
        int ans = obj.majorityElementBrute(A, n);
        System.out.println("Majority Element: " + ans);
    }
}