package Array;

import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        int [][] arr={
                {1,5,7},
                {2,101,10},
                {3,15,99}
        };
        int target=2;
        int[] ans= search2DArray(arr,target);
        System.out.println("Position of arrys is: "+Arrays.toString(ans));
        System.out.println("The Maximum value in array is: "+maxOf2DArray(arr));
    }
    static int maxOf2DArray(int[][] arr){
        int max= arr[0][0];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }

            }

        }
        return max;
    }

    static int[] search2DArray(int[][] arr,int target){

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }

            }
        }
        return new int[]{};
    }
}
