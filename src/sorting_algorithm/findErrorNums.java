package sorting_algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findErrorNums {
    public static void main(String[] args) {
        int[]arr={1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));

    }
    static int[] findErrorNums(int[]arr){
        int i=0;
        List<Integer> list=new ArrayList<Integer>();

        while(i<arr.length){
            int correctIndex= arr[i]-1;
            if( arr[i]!=arr[correctIndex]){
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;

            }else {
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                return new int[]{arr[j],j+1};
            }

        }
        return new int[]{-1,-1};
    }
}
