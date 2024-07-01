import java.util.Scanner;

public class HollowPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
//        int col =sc.nextInt();

        for(int i=1;i<=row; i++){
            for(int k=1; k<=row-1; k++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
