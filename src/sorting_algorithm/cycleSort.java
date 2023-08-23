package sorting_algorithm;

import java.util.Arrays;

public class cycleSort {
    public static void main(String[] args) {
        int[]arr={5,4,7,6,3,2,1};
        cycleSorting(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static void cycleSorting(int[]arr){
        int i=0;
        while(i<arr.length){
            int correctIndex= arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;

            }else {
                i++;
            }
        }
    }

}
