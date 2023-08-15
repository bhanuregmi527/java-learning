public class methodOverloading {
    public static void main(String[] args) {
        fun(10);
        fun("bhanu");
        fun(10,10);
    }
   static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
    static void fun(int c,int b){
        System.out.println(c + b);
    }
}
