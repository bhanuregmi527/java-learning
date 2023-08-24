package sorting_algorithm;

import java.util.ArrayList;
import java.util.List;

public class firstMissingPositive {
    public static void main(String[] args) {
    int [] arr={1,2,-1,0};
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[]arr){
        int i=0;
        while(i<arr.length){
            int correctIndex= arr[i];
            if( arr[i]!=arr[correctIndex]){
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;

            }else {
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j){
                if(arr[j]>=0){
                    return arr[j];
                }
            }

        }
        return arr.length;
    }
}
