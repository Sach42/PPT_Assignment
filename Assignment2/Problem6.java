package Assignment2;

public class Problem6 {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 9;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println(i);
            }
        }
    }
}
