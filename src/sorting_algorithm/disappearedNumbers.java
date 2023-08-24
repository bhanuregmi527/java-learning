package sorting_algorithm;
import java.util.*;
public class disappearedNumbers {
    public static void main(String[] args) {
        int[]arr={4,3,2,7,8,2,3,1};
        System.out.println(disappearedNumbers(arr));

    }
    static List<Integer> disappearedNumbers(int[]arr){
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
                list.add(j+1);
            }

        }
        return  list;
    }
}
