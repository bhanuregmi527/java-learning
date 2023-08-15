import java.util.Scanner;

public class sumTwoNum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println(greet());

for (int i=0;i<1;i++){
    System.out.println("Please Enter the first Number");
    int firstNum= input.nextInt();
    System.out.println("Please Enter the Second Number");
    int secondNum= input.nextInt();
    int result= sum(firstNum,secondNum);
    System.out.println(result);

}
}
    static int sum(int a,int b){
        return a+b;
    }

//    static  String greet(){
//    String greet="Good Morining";
//
//    return greet;
//    }


}

