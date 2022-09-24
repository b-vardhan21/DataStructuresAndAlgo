package Sorting;

public class InsertionSort {
public static void main(String[] args) {
    
    int[] arr = {90,80,60,29,10};

    int len = arr.length;

    for(int i = 1; i < len;i++){
        int key = arr[i];
        int j = i-1;
        while(j>=0 && arr[j]>key){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key;
    }

    for(int i = 0;i<len;i++){
        System.out.println(arr[i]);
    }

}
}
