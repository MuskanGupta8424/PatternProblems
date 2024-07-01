import java.util.Scanner;

public class TriangleStarPattern {
    public static void main(String[] args) {
        System.out.println("Triangle Star Pattern");
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();

        for(int i=1; i<=row;i++){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
