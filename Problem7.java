package Assignment3;

import java.util.ArrayList;
import java.util.List;

public class Problem7 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;
        List<String> ranges = findMissingRanges(nums, lower, upper);
        System.out.println("Missing ranges: " + ranges);
    }
     public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        
        long next = lower;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > next) {
                result.add(getRange(next, nums[i] - 1)); 
            }
            
            next = (long) nums[i] + 1;
        }
        
        if (next <= upper) {
            result.add(getRange(next, upper));
        }
        
        return result;
    }
    
    private static String getRange(long start, long end) {
        if (start == end) {
            return String.valueOf(start);
        } else {
            return start + "-" + end;
        }
    }
}
