package Array;

public class searchInString {
    public static void main(String[] args) {
        String name="bhanubhakta";
        char target='h';
        System.out.println(searchString(name,target));
    }
    static  boolean searchString(String str,char target){
      for(int i=0;i<str.length();i++){
          if (target==str.charAt(i)){
              return true;

          }
      }
      return false;
    }
}
