package Assignment2;

public class Problem8 {
    public static void main(String[] args) {
         int[] nums = {1};
        int k = 0;
        System.out.println(minimumDifference(nums,k));
    }
    public static int minimumDifference(int[] nums, int k) {
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        
        for (int num : nums) {
            minNum = Math.min(minNum, num);
            maxNum = Math.max(maxNum, num);
        }
        
        int minScore = maxNum - minNum;
        
        for (int i = 0; i < nums.length; i++) {
            int potentialMax = nums[i] + k;
            int potentialMin = nums[i] - k;
            
            maxNum = Math.max(maxNum, potentialMax);
            minNum = Math.min(minNum, potentialMin);
            
            minScore = Math.min(minScore, maxNum - minNum);
        }
        
        return minScore;
    }
}
