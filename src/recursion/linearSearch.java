package recursion;

public class linearSearch {
    public static void main(String[] args) {
        int[]arr={1,4,6,10,20,30,33,42};
        int target=1;
        System.out.println(search(arr,target,0));
    }
    public static int search(int[]arr,int target,int i){
        if(i>=arr.length){
            return -1;
        }
       else if (arr[i]==target){
            return i;
        }
       return search(arr,target,i+1);

    }
}
