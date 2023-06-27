package Assignment3;

import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,4};
        int target = 1;
        System.out.println(totalSum(nums, target));
    }

    public static int totalSum(int[] nums, int target){
         Arrays.sort(nums); // Sort the array in ascending order
        int n = nums.length;
        int closestSum = Integer.MAX_VALUE; // Initialize closestSum to a large value
        
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1; // Pointer to the element after the current one
            int right = n - 1; // Pointer to the last element
            
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }
                
                if (currentSum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        
        return closestSum;
       
    }
}
