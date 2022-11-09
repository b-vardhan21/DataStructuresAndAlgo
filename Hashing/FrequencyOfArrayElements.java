package Hashing;
import java.util.*;


class FrequencyOfArrayElements
{
    public static void main (String[] args) {
        int arr[] = new int[]{15, 16, 27, 27, 28, 15};
        int n = arr.length;
        
        countFreq(arr, n);
    }
    
   static void countFreq(int arr[], int n){

    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    for(int i = 0;i<n;i++){
        ///=int key = arr[i];
        if(hm.containsKey(arr[i])){
            hm.put(arr[i], hm.get(arr[i]) + 1);
        }
        else{
            hm.put(arr[i],1);
        }
    }

    for(Map.Entry<Integer,Integer> itr : hm.entrySet()){
        System.out.println(itr.getKey()+" " +itr.getValue());
    }
   }
}