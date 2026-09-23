public interface Payment {
    void pay( double amount);
}
class Pay implements Payment{
    public void pay(double amount){
        System.out.println("paid"+amount+"upi");
    }

    public static void main(String[] args) {
        Pay p = new Pay();
        p.pay(100);
    }
}