package Hashing;

import java.util.HashMap;

public class SubArrayZeroSum {
    public static void main (String[] args) 
    {
        int arr[] = new int[]{5, 3, 9, -4, -6, 7, -1};
        int n = arr.length;
        
        System.out.println(ZeroSumSubarray(arr, n));
        
    }
    
    static int ZeroSumSubarray(int arr[], int n)
    {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        //hm.put(0,1);
        int sum = 0;

        for(int i=0;i<n;i++){
            sum = sum + arr[i];

            if(hm.containsKey(sum)){
                return 1;
            }
            hm.put(sum,0);

        }
        return 0;
    }
}
