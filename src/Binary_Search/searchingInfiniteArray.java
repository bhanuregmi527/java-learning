package Binary_Search;

public class searchingInfiniteArray {
    public static void main(String[] args) {
        int[]arr={2,3,5,6,7,8,10,11,12,15,20,23,30};
        int target=30;
        System.out.println(searchInfinite(arr,target));
    }

    static int searchInfinite(int[]arr,int target){
        int start =0;
        int end=1;

        while (start<=end){
            //double the end if the target is greater than arr[end]
            if(target>arr[end]){
                start=end;
                end=2*start;
            }
            int mid= start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;

            } else if (target<arr[mid]) {
                end=mid-1;

            }else {
                return mid;
            }
        }
        return -1;
    }
}
