package Hashing;

import java.util.HashMap;

public class LongestSubArray {
    public static void main (String[] args) 
    {
        int arr[] = new int[]{10, 5, 2, 7, 1, 9};
        int n = arr.length;
        int sum = 15;
        
        System.out.println(largestSubarrayWithSumX(arr, n, sum));
        
    }
    
    static int largestSubarrayWithSumX(int arr[], int n, int sum)
    {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int prefix_sum = 0;

        int pointer = 0;
        
        for(int i=0;i<n;i++){
            prefix_sum = prefix_sum + arr[i];
            if(prefix_sum == sum){
                pointer = i+1;
            }
            if(hm.containsKey(prefix_sum-sum)){
                pointer = Math.max(pointer, i - hm.get(prefix_sum-sum));
            }

            hm.put(prefix_sum, i);

        }

        return pointer;

    }
}
