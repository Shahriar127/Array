import java.util.*;
public class A_Maximum_Subarray_sum {
      public static void main(String args[]){
            int[] arr ={-2, -3, -1, -2, -3 };
            int n = arr.length;
            System.out.println("The maximum subarray sum is :"+ maxSubarraySum(arr));
      }
      static int maxSubarraySum(int arr[]){
            int curr_sum = 0, max_sum = Integer.MIN_VALUE;
            for(int i = 0;i < arr.length; i++){
                  curr_sum += arr[i];
                  
                  max_sum = Math.max(max_sum, curr_sum);
                  if(curr_sum < 0) curr_sum = 0;
            }
            return max_sum;
      }
}
