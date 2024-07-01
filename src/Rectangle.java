import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        System.out.println("Rectangle Pattern ");
        Scanner sc =new Scanner(System.in);

        int row=sc.nextInt();
        int col =sc.nextInt();

        for(int i=1; i<=col; i++){
            for(int j=1; j<=row; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
