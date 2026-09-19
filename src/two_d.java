import java.util.Scanner;

public class two_d {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter how man rows u want");
        int r = sc.nextInt();
        System.out.println("Eneter how many columns u want");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                arr[i][j] = sc.nextInt();
//                System.out.println(arr[i][j]);
            }
        }
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print(arr[i][j]);
            }
        }
    }
}
