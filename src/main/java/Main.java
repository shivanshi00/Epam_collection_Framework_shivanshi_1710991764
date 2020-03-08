
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Custom<Integer> arr=new Custom<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        System.out.println(arr.get(2));
        System.out.println(arr.print());
        arr.add(11);
        arr.add(12);
        arr.add(13);
        arr.add(14);
        System.out.println(arr.print());
        arr.remove(6);
        System.out.println(arr.print());
    }
}
