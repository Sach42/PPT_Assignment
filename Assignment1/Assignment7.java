package Assignment1;

public class Assignment7 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
         int n = nums.length;
        int index = 0;

        // Traverse the array
        for (int i = 0; i < n; i++) {
            // If the current element is non-zero, move it to the leftmost available position
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Fill the remaining positions with zeros
        while (index < n) {
            nums[index] = 0;
            index++;
        }

        for(int ele:nums){
            System.out.print(ele+" ");
        }
    }
}
