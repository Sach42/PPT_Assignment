package Assignment2;

import java.util.Arrays;

public class Problem5 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        Arrays.sort(nums);
        int length = nums.length;
        
        int product1 = nums[length - 1] * nums[length - 2] * nums[length - 3];
        int product2 = nums[0] * nums[1] * nums[length - 1];
        System.out.println(Math.max(product1, product2));
    }
    
}
