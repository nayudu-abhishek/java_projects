import java.util.Random;
import java.util.Scanner;

//Project: Number Guessing Game
//with hints ('too high'/'too low') after each try.
//The program picks a random number 1-100; the user keeps guessing until correct,
public class Number_Gessing_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int target = ran.nextInt(100)+1;
        int gess , attempts = 0;
        do{
            System.out.print("Enter ur number:");
            gess = sc.nextInt();
            attempts++;
            if(gess < target){
                System.out.println(gess+" is Too low");
            }else if(gess > target){
                System.out.println(gess+"is Too high");
            }else{
                System.out.println("You won the game");
            }
        }while(gess != target);
        System.out.println("correct in"+attempts+"attempts");
    }
}