package Hashing;

import java.util.HashMap;

public class subArrayWithSum {
    public static void main (String[] args) 
    {
        int arr[] = new int[]{5, 8, 6, 13, 3, -1};
        int sum=22;
        int n = arr.length;
        
        System.out.println(isSum(arr, n, sum));
        
    }
    
    static boolean isSum(int arr[], int n, int sum)
    {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        hm.put(0,1);
        int prefix_sum = 0;
        for(int i=0;i<n;i++){
            prefix_sum = prefix_sum + arr[i];
            if(hm.containsKey(prefix_sum-sum)){
                return true;
            }
            hm.put(prefix_sum,0);
        }

        return false;
    }
}
