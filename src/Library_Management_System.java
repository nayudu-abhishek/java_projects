public class Library_Management_System {
    int id;
    String author;
    String title;

    Library_Management_System(int id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public void getDetails() {
        System.out.println("The bookd id is:" + id + "\nThe book author is" + author + "\nThe book title is" + title);
    }
    public int getId(){
        return id;
    }
    public int setId(int lid){
        return lid;
    }
    public String GetAuthor(){
        return author;
    }
    public  String setAuthor(String lauthor){
        author = lauthor;
        return author;
            }
    public static void main(String[] args) {
        Library_Management_System li = new Library_Management_System(100,"john","The brown fx");
//        li.getDetails();
        System.out.println(li.setAuthor("wick"));
        System.out.println(li.setId(100));
        System.out.println(li.GetAuthor());

    }
}

