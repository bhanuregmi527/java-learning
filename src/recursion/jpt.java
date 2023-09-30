package recursion;

import java.util.ArrayList;

public class jpt {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2=list1;
        list2.add(4);
        System.out.println(list1);
    }
}
