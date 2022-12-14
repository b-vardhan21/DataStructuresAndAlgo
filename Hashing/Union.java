package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class Union {
    public static void main (String[] args) {
        int arr1[] = new int[]{2, 8, 3, 5, 6};
        int arr2[] = new int[]{4, 8, 3, 6, 1};
        int m = arr1.length;
        int n = arr2.length;
        
        System.out.println(unionSize(arr1, m, arr2, n));
    }
    
    static int unionSize(int arr1[], int m, int arr2[], int n)
    {
        HashSet<Integer> res = new HashSet<Integer>();

        for(int i=0;i<arr1.length;i++){
            res.add(arr1[i]);

        }
        for(int i=0;i<arr2.length;i++){
            res.add(arr2[i]);

        }
        return res.size();


    }
}
