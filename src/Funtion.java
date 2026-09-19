public class Funtion {
    int id;
    String name;
    Funtion(int id , String name){
        this.id = id;
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public  int setId(int sid){
        id = sid;
        return  id;
    }
    public String getName(){
        return name;
    }
    public String setName(String sname){
        name = sname;
        return  name;
    }
    public static void main(String[] args) {
        Funtion fn = new Funtion(100,"jhon");
        System.out.println(fn.getId());
        System.out.println(fn.setId(2002));
        System.out.println(fn.id);
        System.out.println(fn.getName());
        System.out.println(fn.setName("wick"));
        System.out.println(fn.name);
    }
}

