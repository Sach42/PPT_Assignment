package Assignment1;

public class Assignment2 {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums,val));
    }

    public static int removeElement(int[] nums, int val){
        int i=0;
        int k=0;

        for(int num : nums){
            if(num != val){
                nums[i] = num;
            
            i++;
            k++;
        }
       
    }
     return k;
}
}
