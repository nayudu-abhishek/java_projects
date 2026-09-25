import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        System.out.println(hs);
        hs.remove(10);
        System.out.println(hs);
        System.out.println(hs.size());
    }
}
