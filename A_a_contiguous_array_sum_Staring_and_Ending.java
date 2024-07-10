import java.util.*;
public class A_a_contiguous_array_sum_Staring_and_Ending {
      public static void main(String args[]){
           int[] arr ={ -2, -3, 4, -1, -2, 1, 5, -3 };
           maxSubarraySum(arr);
      }
      static void maxSubarraySum(int[] arr){
            int curr_sum = 0, max_sum = Integer.MIN_VALUE;
            int start = 0,end = 0,s = 0;
            for(int i = 0;i <arr.length; i++){
                  curr_sum += arr[i];

                  if(max_sum < curr_sum){
                        max_sum = curr_sum;
                        start = s;
                        end = i;
                  }
                  if(curr_sum < 0) {
                        curr_sum = 0;
                        s = i + 1;
                  }
            }
                System.out.println("Maximum contiguous sum is " + max_sum);
                System.out.println("Starting index " + start);
                System.out.println("Ending index " + end);
      }
}
