import java.util.Scanner;

public class Monthly_Expenses_Tracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double expenses[] = new double[n];
        for(int i = 0;i< n;i++){
            expenses[i] = sc.nextInt();
        }
        double total=0 , min = expenses[0] , max = expenses[0];
        for(double amount : expenses){
            total += amount;
            if(amount > max) max = amount;
            if (amount < min) min = amount;
        }
        System.out.println("Total"+total+"Average"+(total)/expenses.length);
        
    }
}


