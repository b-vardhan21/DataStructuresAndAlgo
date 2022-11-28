package Hashing;

import java.util.HashSet;

public class Sumpair {
    public static void main (String[] args) {
        int arr[] = new int[]{3, 8, 4, 7, 6, 1};
        int len = arr.length;
        int x = 14;
        System.out.println(pairWithSumX(arr, len, x));
    }
    
    static int pairWithSumX(int arr[],int n, int X)
    {
        HashSet<Integer> s = new HashSet<Integer>();

        for(int i=0;i<n;i++){
            if(s.contains(X-arr[i])){
                return 1;
            }
            s.add(arr[i]);
        }
        return 0;
    }
}
