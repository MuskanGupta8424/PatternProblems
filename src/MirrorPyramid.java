import java.util.Scanner;

public class MirrorPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row =sc.nextInt();
        int col=sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int k=col;k>=2*i -1; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
