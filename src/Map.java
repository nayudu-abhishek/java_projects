import java.util.Calendar;
import java.util.HashMap;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        HashMap<Character,Integer> hm = new HashMap<>();
        String s = "The quick brown fox jumps over the lazy dog";
        for(char c : s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        System.out.println(hm);
        for(HashMap.Entry<Character,Integer> em : hm.entrySet()){
            System.out.println(em.getKey()+" "+ em.getValue());
        }
        hm.put('c',1);
        System.out.println(hm.get('T'));
    }
}
