package Assignment2;

import java.util.HashSet;

public class Problem2 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3};
        int n = arr.length;

        int maxeat = n/2;

        HashSet<Integer> CandieSet = new HashSet<>();
        
        for(int ele:arr){
            CandieSet.add(ele);

            if(CandieSet.size() == maxeat){
                System.out.println(maxeat);
            }
        }
    }
}
