package Assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //1st array
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        //2nd array
         int m = sc.nextInt();
        int[] brr = new int[m];
        for(int i=0; i<m; i++){
            brr[i] = sc.nextInt();
        }
        
        ArrayList<Integer>al = new ArrayList<>();
        
        int i=0; 
        int j=0;
        
        if(arr[i]<brr[j]){
            al.add(arr[i]);
            i++;
        }
        else
        {
            al.add(brr[j]);
            j++;
        }
        
        while(i<n && j<m)
        {
            if(arr[i] < brr[j]){
                if(al.get(al.size()-1) != arr[i])
                    al.add(arr[i]);
                i++;
            }else{
                if(al.get(al.size()-1) != brr[j])
                    al.add(brr[j]);
                j++;
            }
        }
        
        while(i<n){
              if(al.get(al.size()-1) != arr[i])
                    al.add(arr[i]);
                i++;
        }
        
        while(j<m){
             if(al.get(al.size()-1) != brr[j])
                    al.add(brr[j]);
                j++;
        }
        
        for(int ele:al){
            System.out.print(ele+" ");
        }
    }
}
