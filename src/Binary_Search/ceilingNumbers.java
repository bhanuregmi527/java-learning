package Binary_Search;

public class ceilingNumbers {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        System.out.println(ceiling(arr,7));
    }
    static int ceiling(int[]arr,int target){
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid= start+ (end-start)/2;
            if(target>arr[mid] ){
                start=mid+1;
//                if(start>end){
//                return arr[start];
//                }

            }else if(target<arr[mid]){
                end=mid-1;
//                if(start>end){
//                    return arr[start];
//                }

            }else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
