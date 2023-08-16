package Array;

public class searchingarray {
    static int linearSearch(int[]arr,int target){
        int index=0;
        if (arr.length==0){
            return -1;
        }

        for(int num:arr){
            if(num==target){
                return index;
            }else {
                index ++;
            }


        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr={1,5,7,9};
        int target=9;

        System.out.println(linearSearch(arr,target));


    }
}
