package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class evenDigits {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        int[] arrNum={1,4,5,8,10,11,16};
        for (int i = 0; i <arrNum.length ; i++) {
            if(arrNum[i]%2==0){
                arr.add(arrNum[i]);
            }
        }
        for (int num:arr){
            System.out.println(num);
        }
    }
}
