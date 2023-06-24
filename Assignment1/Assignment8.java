package Assignment1;

import java.util.Arrays;

public class Assignment8 {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int n = nums.length;
        int[] count = new int[n + 1];

        for (int num : nums) {
            count[num]++;
        }

        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                result[0] = i;
            } else if (count[i] == 0) {
                result[1] = i;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};

        Assignment8 solution = new Assignment8();
        int[] result = solution.findErrorNums(nums);

        System.out.println("Output: " + Arrays.toString(result));
    }
}
