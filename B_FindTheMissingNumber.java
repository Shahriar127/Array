import java.util.*;
public class B_FindTheMissingNumber {
      public static void main(String args[]){
            int arr[] = {1, 2, 4, 6, 3, 7, 8};
            int N = 8;
            findMissing_process1(arr,N);
            findMissing_process2(arr, N);
      }
      static void findMissing_process1(int arr[],int n){
            int tmp[] = new int[n];
            for(int i = 0;i < n; i++){
                  tmp[i] = 0;
            }
            for(int i = 0;i < n - 1; i++){
                  tmp[arr[i] - 1] = 1;
            }
            int ans = 0;
            for(int i = 0;i < n; i++){
                  if(tmp[i] == 0) ans = i + 1;
            }
            System.out.println("For process 1 : The missing number is " + ans);

      }

      static void findMissing_process2(int arr[],int n){
            int totalSum = (n * (n + 1)) / 2;
            int curr_sum = 0;
            for(Integer u : arr){
                  curr_sum += u;
            }
            int ans = totalSum - curr_sum;
            System.out.println("For process 2 : The missing number is " + ans);
      }
}
