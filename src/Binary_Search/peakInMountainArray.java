package Binary_Search;

public class peakInMountainArray {
    public static void main(String[] args) {
        int [] arr={0,2,5,8,10,12,3,2};
        System.out.println(searchingPeak(arr));
    }
    static int searchingPeak(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
                if(start==end){
                    //if start ==end we found the peak index
                    return end;
                }
            } else if (arr[mid]<arr[mid+1]) {
                start=mid+1;
            }
        }
        return -1;
    }

}

