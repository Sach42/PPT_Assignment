package Assignment3;

public class Problem6 {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int result = 0;
        
        for (int num : nums) {
            result ^= num; 
        }
        
        return result;
    }

}
