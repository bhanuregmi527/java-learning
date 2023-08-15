public class shadowing {
    static int x=90;

    public static void main(String[] args) {
        System.out.println(x);//prints 90
        int x=40;
        System.out.println(x); //prints 40
        fun(); //prints 90
    }

    private static void fun() {
        System.out.println("inside fun  function "+x);
    }
}

