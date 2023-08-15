import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        //taking input from users
        Scanner input= new Scanner(System.in);
        String fruits= input.next();

        switch (fruits){
            case "Mango":
                System.out.println("Hyy Mango is my Fav Fruits");
                break;
            case "Banana":
                System.out.println("Hyy Banana is my breakfast fruit");
                break;
            case "Apple":
                System.out.println("hyy Apple is my brothers fav fruit");
            default:
                System.out.println("we all love "+ fruits + " fruit");
        }



    }
}
