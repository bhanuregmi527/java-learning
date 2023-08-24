package sorting_algorithm;

public class missingNumber {
    public static void main(String[] args) {
        int[]arr={9,6,4,2,3,5,7,0,1};
        System.out.println(missing(arr));

    }
   static int missing(int[]arr){
        int i=0;
        while(i<arr.length){
            int correctIndex= arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correctIndex]){
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;

            }else {
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j){
                return j;
            }
        }
        return arr.length;

    }
}
