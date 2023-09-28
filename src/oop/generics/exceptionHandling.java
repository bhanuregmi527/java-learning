package oop.generics;

public class exceptionHandling {
    public static void main(String[] args) {
        int b = 0;
        int a = 10;
        try{
            String name="bhanu";
            if (name.equals("bhanu")){
                throw new customExceptions("name is bhanu");
            }
        }catch(customExceptions e){
            System.out.println(e.getMessage());

        }finally {
            System.out.println("this will always execute even exception is thrown or not ");
        }
    }


}
