public class Overloading {
    public static int add(int a,int b){
        return a+b;
    }
    public  int add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Overloading o = new Overloading();
        System.out.println(add(10,20));
        System.out.println(o.add(10,234,230));
    }
}
