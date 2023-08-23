package sorting_algorithm;

import java.util.Arrays;

public class insertionSort  {
    public static void main(String[] args) {
        int[]arr={5,7,2,3,8,10,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void insertion(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]>arr[j-1]){
                    break;
                }

                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }

            }
        }
    }
}
