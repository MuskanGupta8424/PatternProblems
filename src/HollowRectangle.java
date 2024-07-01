import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row =sc.nextInt();
        int col =sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                if((i==1|| i==row) || (j==1 || j==col)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //second rectangular matric pattern
        for(int i=1; i<=row; i++){
            for(int j=1;j<=col; j++){
                if((i+j)%2 ==0){
                    System.out.print(1);
                }else{
                    System.out.print(2);
                }
            }
            System.out.println();
        }

    }
}

//output- ****** , 121212
//        *    *  212121
//        *    *  121212
//        ******  212121


