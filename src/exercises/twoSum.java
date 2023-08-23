package exercises;

import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int[]nums={2,7,11,20,1,5};
        int target=9;
        System.out.println(Arrays.toString(twoSum(nums,target)));

    }
    static int[] twoSum(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    break;
                }
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};

    }
}
