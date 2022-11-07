package Hashing;

import java.util.*;


class Distinct
{
    public static void main (String[] args) {
        int arr[] = new int[]{15, 16, 27, 27, 28, 15};
        int n = arr.length;
        
        System.out.println(countDistinct(arr, n));
    }
    
    static int countDistinct(int arr[], int n){
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0;i < n;i++) {
            s.add(arr[i]);
        }
        return s.size();
    }
}