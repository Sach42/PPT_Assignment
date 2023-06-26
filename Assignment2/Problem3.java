package Assignment2;

import java.util.HashMap;

public class Problem3 {
    public static void main(String[] args) {
         int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};

         HashMap<Integer,Integer> map = new HashMap<>();
         int max = 0;

         for(int ele : nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
         }

         for(int key : map.keySet()){
            if(map.containsKey(key + 1)){
            max = Math.max(max, map.get(key)+ map.get(key+1));
         }
    }
    System.out.println(max);
}
}
