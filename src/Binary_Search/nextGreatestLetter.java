package Binary_Search;

public class nextGreatestLetter {
    public static void main(String[] args) {
        char[] let={'c','f','j','n'};
        char target='d' ;
        System.out.println(checkGreaterLetter(let,target));

    }
    static  char checkGreaterLetter(char[]let, char target){
        int start=0;
        int end=let.length-1;
              while (start<=end){
            int mid=start+ (end-start)/2;
            if(target>let[mid]){
                start=mid+1;

            }else {
                end=mid-1;
            }
        }
        return let[start%let.length];

    }
}
