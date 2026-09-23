import java.util.Scanner;

public abstract class Vehicle_Rental_System {
    protected  double rent = 100;
//    Vehicle_Rental_System(double rent){
//        this.rent = rent;
//    }
    public abstract double calren(int days);

    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        System.out.println(v.calren(8));
    }
}
class  Vehicle extends Vehicle_Rental_System{
    @Override
    public double calren(int days){
        return rent * days + (days > 7 ? 500 : 0);
    }
}
