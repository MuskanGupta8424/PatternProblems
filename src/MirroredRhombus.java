import java.util.Scanner;

public class MirroredRhombus {
    public static void main(String[] args) {
        System.out.println("Mirror Rhombus Star Pattern Right mirror");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
//1 logic
        for(int i=1; i<=r; i++){
            for(int j=r; j>=i; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=r; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd logic - Better approach
        for(int i=1; i<=r; i++){
            for(int j=1; j<=r-i; j++ ){
                System.out.print(" ");
            }
            for(int k=1; k<=r; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


