import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
       java.util.List<String> li = new ArrayList<>();
       li.add("John");   //add,remove,contains,get,set,size,indexOf
       li.add("wick");
       li.add("what");
        System.out.println(li);
//        li.remove(1);
        System.out.println(li);
        System.out.println(li.contains("wick"));
        System.out.println(li.get(1));
//        System.out.println(li.set(1,"what"));
        System.out.println(li);
        System.out.println(li.size());
        System.out.println(li.indexOf("what"));

    }
}