import java.util.Scanner;

//Project: Ticket Pricing System
//Calculate a ticket price that changes based on age (child/adult/senior),
// day (weekday/weekend).
public  class Ticket_Pricing_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        boolean weekend = true;
        double price = 150;
        if(age<17){
            price *= 0.6;
        }else if(age >= 60){
            price *= 1.0;
        }
        if(weekend == true) price *=5.0;
        System.out.println("Total price"+price);
    }
}
