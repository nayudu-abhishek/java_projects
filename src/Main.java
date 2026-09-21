public class Main{
    public static void main(String[] args) {
        String name = "Hello";
        int length = name.length();
        System.out.println(length);
        for(int i = 0;i<name.length();i++){
            System.out.print(name.indexOf("H"));
        }
    }
}