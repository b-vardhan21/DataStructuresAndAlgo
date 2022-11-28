package Hashing;

import java.util.HashSet;

public class Intersection {
    public static void main (String[] args) {
        int arr1[] = new int[]{15, 17, 27, 27, 28, 15};
        int arr2[] = new int[]{16, 17, 28, 17, 31, 17};
        int m = arr1.length;
        int n = arr2.length;
        
        System.out.println(intersection(arr1, m, arr2, n));
    }

    static int intersection(int arr1[], int m, int arr2[], int n){
        int res = 0;
        HashSet<Integer> s = new HashSet<Integer>();

        for(int i = 0;i<arr1.length;i++){
            s.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            if(s.contains(arr2[i])){
                res++;
                s.remove(arr2[i]);
            }
        }
        return res;
    }
}
