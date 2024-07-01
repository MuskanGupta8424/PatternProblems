import java.util.Scanner;

public class RhombusStarPattern {
    public static void main(String[] args) {
        System.out.println("Rhombus Star Pattern");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int k=1;k<=r; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//output:  ****
//          ****
//           ****
//            ****