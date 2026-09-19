import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int[] arr= new int[n];
        //Taking arr input from the user
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i:arr) {
            System.out.println(i);
        }
        //find the specified element
        int target = 1;
        for(int i = 0;i<n;i++)
        {
            if(arr[i] == target){
                System.out.println("found in idx "+i);
            }
        }
        //reverse and array
        for(int i = n-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
