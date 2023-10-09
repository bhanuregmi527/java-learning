package Array;

public class contigousBinaryArray {
    //525. Contiguous Array leetcode
    public static void main(String[] args) {
        int[]arr={0,1,0,1};
        System.out.println(findMaxLength(arr));
    }
    static int findMaxLength(int[]nums){
        int count=0;
        for (int i = 0; i <nums.length-1 ; i++) {
            if(nums[i]==0){
                if(nums[i+1]==0){
                    i++;
                }else if(nums[i+1]==1){
                    count=count+2;
                }
            }else{
                if(nums[i+1]==1){
                    i++;
                }else if(nums[i+1]==0){
                    count++;
                }
            }
        }
        return count;
    }
}
