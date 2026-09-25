import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class List {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(0,0);
        li.add(3,4);
        System.out.println(li);
        System.out.println(li.remove(3));
        System.out.println(li);
        System.out.println(li.contains(3));
        System.out.println(li.size());
        System.out.println(li.get(0));
        System.out.println(li.set(1,2));
        Collections.sort(li);
        System.out.println(li);
        System.out.println(li.indexOf(2));
        System.out.println(li.remove(Integer.valueOf(2)));
        System.out.println(li);
        Collections.reverse(li);
        System.out.println(li);
        System.out.println(li.indexOf(4));

    }
}
