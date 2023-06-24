package Assignment1;

public class Assignment1{
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] res = sum(arr,target);
        for(int ele:res){
            System.out.print(ele+" ");
        }
    }
    public static int[] sum(int[] arr, int target){
        int x = 0;
        int y = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j] == target){
                    x = i;
                    y=j;
                }
            }
        }
        int[] pos = {x,y};
        return pos;
    }
}