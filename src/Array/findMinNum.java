package Array;

public class findMinNum {
    public static void main(String[] args) {
        int[] arr={20,14,8,7,22,4,2,0,10};
        System.out.println(min(arr));
    }
    static int min(int[]arr ){
        int min=arr[0];
        for(int num:arr){
            int i=0;
            if(num<min){
                min=num;
                i++;
            }
        }
        return min;
    }
}
