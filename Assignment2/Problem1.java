package Assignment2;

public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2};
        int sum = 0;

        //sum of each element
        for(int i=0; i<arr.length; i+=2){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
