import java.util.Scanner;

public class SquareStarPattern {
    public static void main(String[] args) {
        System.out.println("Square Star Pattern");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j=1;j<=r; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
