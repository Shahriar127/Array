import java.util.Scanner;

public class C_TrappingRainWater {
    public static int trap1(int[] height, int n) {
        if (height == null || height.length == 0) return 0;

        int[] left_ar = new int[n];
        int[] right_ar = new int[n];

        left_ar[0] = height[0];
        for (int i = 1; i < n; i++) {
            left_ar[i] = Math.max(height[i], left_ar[i - 1]);
        }

        right_ar[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right_ar[i] = Math.max(height[i], right_ar[i + 1]);
        }

        int water = 0;
        for (int i = 0; i < n; i++) {
            water += Math.min(left_ar[i], right_ar[i]) - height[i];
        }

        return water;
    }

    public static int trap2(int[] ar, int n) {
        int water = 0;
        int low = 0, high = n - 1;
        int left_ar = ar[low], right_ar = ar[high];

        while (low <= high) {
            if (left_ar <= right_ar) {
                water += Math.max(0, left_ar - ar[low]);
                left_ar = Math.max(left_ar, ar[low]);
                low++;
            } else {
                water += Math.max(0, right_ar - ar[high]);
                right_ar = Math.max(right_ar, ar[high]);
                high--;
            }
        }

        return water;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] ar = new int[n];

        System.out.println("Enter " + n + " integers representing the heights:");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        int trappedWater = trap1(ar, n);
        int trappedWater2 = trap2(ar, n);
        System.out.println("Total water trapped (pre_computation): " + trappedWater);
        System.out.println("Total water trapped (two pointer): " + trappedWater2);
    }
}
