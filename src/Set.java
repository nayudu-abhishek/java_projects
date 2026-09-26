import java.util.*;

public class Set {
    public static void main(String[] args) {
     TreeSet<Integer> hs = new TreeSet<>(); // contains,add,remove, size
        hs.add(3);
        hs.add(2);
        hs.add(5);
     hs.add(1);
     hs.add(2);

     hs.add(4);

        System.out.println(hs);
        System.out.println(hs.contains(1));
        System.out.println(hs.size());
        System.out.println(hs.remove(4));
        System.out.println(hs);
    }
}
