package sorting_algorithm;

import java.util.ArrayList;
import java.util.List;

public class duplicateNumber {
    public static void main(String[] args) {
        int[] arr={3,1,3,4,2};
        System.out.println(disappearedNumbers(arr));

    }
    static int disappearedNumbers(int[]arr){
        int i=0;

        while(i<=arr.length-1){
            int correctIndex= arr[i]-1;
            if( arr[i]!=arr[correctIndex]){
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;

            }else {
                i++;
            }
        }
//        for(int j=0;j<arr.length-2;j++){
//            if(arr[j]!=j+1){
//                return arr[j+1];
//            }
//
//        }
        return arr[arr.length-1];
    }
}
