package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class evenDigits {
    public static void main(String[] args) {
        int[] arrNum={12,345,2,66,10,8296};
        System.out.println(evenCount(arrNum));

    }
    static int evenCount(int[]arr){
        int count=0;

        for (int i = 0; i <arr.length ; i++) {
            int digitCount=0;
            if(arr[i]==0){
                return 1;
            } else  {
                //length of digit by converting num into string and string.length()
                String digitString= arr[i]+"";
                digitCount=digitString.length();

                // Length of digit by dividing and counting.
//                while (arr[i]!=0){
//                    arr[i]=arr[i]/10;
//                    digitCount++;
//                }

            }
            if(digitCount%2==0){
                count++;
            }

        }
        return count;

    }
}
