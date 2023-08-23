package sorting_algorithm;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[]arr={4,5,1,2,3,10,12,14,11,7,9};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selection(int[]arr){

        for (int i = 0; i < arr.length ; i++) {
            //find minimum index
            int min=i;
            //find the minimum element in unsorted array i.e. i+1
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;



        }

    }
}
